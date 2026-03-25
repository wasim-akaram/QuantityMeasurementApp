package com.app.quantitymeasurement.unit;

import java.util.Objects;
import java.util.function.DoubleBinaryOperator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Quantity<U extends IMeasurable> {

    private static final Logger logger = LoggerFactory.getLogger(Quantity.class);

    private static final double ROUND_FACTOR = 100000.0;
    private final double value;
    private final U unit;

    private enum ArithmeticOperation {

        ADD((a, b) -> a + b),
        SUBTRACT((a, b) -> a - b),
        DIVIDE((a, b) -> a / b);

        private final DoubleBinaryOperator operator;

        ArithmeticOperation(DoubleBinaryOperator operator) {
            this.operator = operator;
        }

        double compute(double a, double b) {
            return operator.applyAsDouble(a, b);
        }
    }

    public Quantity(double value, U unit) {

        if (unit == null) {
            logger.error("Unit is null while creating Quantity");
            throw new IllegalArgumentException("Unit cannot be null");
        }

        if (Double.isNaN(value) || Double.isInfinite(value)) {
            logger.error("Invalid numeric value: {}", value);
            throw new IllegalArgumentException("Invalid numeric value");
        }

        this.value = value;
        this.unit = unit;

        logger.debug("Created Quantity: {} {}", value, unit.getUnitName());
    }

    public double getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }

    private static double round(double value) {
        return Math.round(value * ROUND_FACTOR) / ROUND_FACTOR;
    }

    private void validateArithmeticOperands(Quantity<?> other, U targetUnit, boolean targetRequired) {

        if (other == null) {
            logger.error("Operand quantity is null");
            throw new IllegalArgumentException("Operand quantity cannot be null");
        }

        if (this.unit.getClass() != other.unit.getClass()) {
            logger.error("Different measurement categories: {} vs {}", 
                this.unit.getClass(), other.unit.getClass());
            throw new IllegalArgumentException("Cannot operate on different measurement categories");
        }

        if (targetRequired && targetUnit == null) {
            logger.error("Target unit is null");
            throw new IllegalArgumentException("Target unit cannot be null");
        }
    }

    private double performBaseArithmetic(Quantity<?> quantity2, ArithmeticOperation operation) {

        double base1 = this.unit.convertToBaseUnit(this.value);
        double base2 = quantity2.unit.convertToBaseUnit(quantity2.value);

        if (operation == ArithmeticOperation.DIVIDE && base2 == 0.0) {
            logger.error("Division by zero attempted");
            throw new ArithmeticException("Division by zero");
        }

        double result = operation.compute(base1, base2);

        logger.debug("Base arithmetic result: {}", result);

        return result;
    }

    // 🔹 Conversion
    public Quantity<U> convertTo(U target) {

        logger.info("Converting {} {} to {}", value, unit.getUnitName(), target);

        if (target == null) {
            logger.error("Target unit is null in conversion");
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        if (this.unit == target)
            return this;

        double baseValue = unit.convertToBaseUnit(value);
        double convertedValue = target.convertFromBaseUnit(baseValue);

        if (!(unit instanceof TemperatureUnit)) {
            convertedValue = round(convertedValue);
        }

        logger.info("Conversion result: {} {}", convertedValue, target.getUnitName());

        return new Quantity<>(convertedValue, target);
    }

    // 🔹 Add
    @SuppressWarnings("unchecked")
    public Quantity<U> add(Quantity<?> quantity2) {

        logger.info("ADD operation: {} {} + {} {}", 
            this.value, this.unit.getUnitName(),
            quantity2.value, quantity2.unit.getUnitName());

        if (quantity2 == null)
            throw new IllegalArgumentException("Operand quantity cannot be null");

        unit.validateOperationSupport("addition");
        quantity2.unit.validateOperationSupport("addition");

        validateArithmeticOperands(quantity2, null, false);

        double baseResult = performBaseArithmetic(quantity2, ArithmeticOperation.ADD);

        double result = round(unit.convertFromBaseUnit(baseResult));

        logger.info("ADD result: {} {}", result, unit.getUnitName());

        return new Quantity<>(result, unit);
    }

    public Quantity<U> subtract(Quantity<?> quantity2) {

        logger.info("SUBTRACT operation: {} {} - {} {}", 
            this.value, this.unit.getUnitName(),
            quantity2.value, quantity2.unit.getUnitName());

        if (quantity2 == null)
            throw new IllegalArgumentException("Operand quantity cannot be null");

        unit.validateOperationSupport("subtraction");
        quantity2.unit.validateOperationSupport("subtraction");

        validateArithmeticOperands(quantity2, null, false);

        double baseResult = performBaseArithmetic(quantity2, ArithmeticOperation.SUBTRACT);

        double result = round(unit.convertFromBaseUnit(baseResult));

        logger.info("SUBTRACT result: {} {}", result, unit.getUnitName());

        return new Quantity<>(result, unit);
    }

    // 🔹 Divide
    public double divide(Quantity<?> quantity2) {

        logger.info("DIVIDE operation: {} {} / {} {}", 
            this.value, this.unit.getUnitName(),
            quantity2.value, quantity2.unit.getUnitName());

        if (quantity2 == null)
            throw new IllegalArgumentException("Operand quantity cannot be null");

        unit.validateOperationSupport("division");
        quantity2.unit.validateOperationSupport("division");

        validateArithmeticOperands(quantity2, null, false);

        double result = performBaseArithmetic(quantity2, ArithmeticOperation.DIVIDE);

        logger.info("DIVIDE result: {}", result);

        return result;
    }

    // 🔹 Equals
    @Override
    public boolean equals(Object obj) {

        logger.debug("Comparing quantities");

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Quantity<?> other = (Quantity<?>) obj;

        if (this.unit.getMeasurementType() != other.unit.getMeasurementType())
            return false;

        double base1 = this.unit.convertToBaseUnit(this.value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        if (this.unit.getMeasurementType() == MeasurementType.TEMPERATURE) {
            double EPSILON = 1e-6;
            return Math.abs(base1 - base2) < EPSILON;
        }

        base1 = round(base1);
        base2 = round(base2);

        return Double.compare(base1, base2) == 0;
    }

    @Override
    public int hashCode() {

        double baseValue = unit.convertToBaseUnit(value);

        if (unit instanceof TemperatureUnit) {
            baseValue = Math.round(baseValue * 1000) / 1000.0;
        } else {
            baseValue = round(baseValue);
        }

        return Objects.hash(unit.getClass().getName(), baseValue);
    }

    @Override
    public String toString() {
        return String.format("Quantity(%.2f, %s)", value, unit.getUnitName());
    }
}
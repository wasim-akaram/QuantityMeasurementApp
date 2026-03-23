package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.model.QuantityMeasurementEntity;

import com.app.quantitymeasurement.repository.QuantityMeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.quantitymeasurement.model.QuantityDTO;
import com.app.quantitymeasurement.unit.IMeasurable;
import com.app.quantitymeasurement.unit.Quantity;

import lombok.Data;

@Data
@Service
public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

	@Autowired
	private QuantityMeasurementRepository repository;

	@Override
	public boolean compare(QuantityDTO q1, QuantityDTO q2) {

	    Quantity<?> quantity1 = convertToQuantity(q1);
	    Quantity<?> quantity2 = convertToQuantity(q2);

	    boolean result = quantity1.equals(quantity2);

	    // Create entity object
	    QuantityMeasurementEntity entity = new QuantityMeasurementEntity();

	    entity.setThisValue(q1.getValue());
	    entity.setThisUnit(q1.getUnit());
	    entity.setThisMeasurementType(q1.getMeasurementType());

	    entity.setThatValue(q2.getValue());
	    entity.setThatUnit(q2.getUnit());
	    entity.setThatMeasurementType(q2.getMeasurementType());

	    entity.setOperation("COMPARE");
	    entity.setResultString(String.valueOf(result));
	    entity.setError(false);

	    // Save into DB using JPA
	    repository.save(entity);

	    return result;
	}

	private Quantity<?> convertToQuantity(QuantityDTO dto) {

		IMeasurable unit = IMeasurable.fromUnitName(dto.getMeasurementType(), dto.getUnit());

		return new Quantity<>(dto.getValue(), unit);
	}

	@Override
	public QuantityDTO convert(QuantityDTO q, String targetUnit) {

	    Quantity<IMeasurable> quantity =
	            (Quantity<IMeasurable>) convertToQuantity(q);

	    IMeasurable target =
	            IMeasurable.fromUnitName(q.getMeasurementType(), targetUnit);

	    Quantity<IMeasurable> result = quantity.convertTo(target);

	    // Create entity
	    QuantityMeasurementEntity entity = new QuantityMeasurementEntity();

	    entity.setThisValue(q.getValue());
	    entity.setThisUnit(q.getUnit());
	    entity.setThisMeasurementType(q.getMeasurementType());

	    entity.setThatValue(0.0);
	    entity.setThatUnit(targetUnit);
	    entity.setThatMeasurementType(q.getMeasurementType());

	    entity.setOperation("CONVERT");
	    entity.setResultValue(result.getValue());
	    entity.setResultUnit(result.getUnit().getUnitName());
	    entity.setResultMeasurementType(q.getMeasurementType());
	    entity.setError(false);

	    // Save to DB
	    repository.save(entity);

	    return new QuantityDTO(
	            result.getValue(),
	            result.getUnit().getUnitName(),
	            q.getMeasurementType()
	    );
	}
	@Override
	public QuantityDTO add(QuantityDTO q1, QuantityDTO q2) {

	    Quantity<?> quantity1 = convertToQuantity(q1);
	    Quantity<?> quantity2 = convertToQuantity(q2);

	    Quantity<?> result = quantity1.add(quantity2);

	    // Create entity
	    QuantityMeasurementEntity entity = new QuantityMeasurementEntity();

	    entity.setThisValue(q1.getValue());
	    entity.setThisUnit(q1.getUnit());
	    entity.setThisMeasurementType(q1.getMeasurementType());

	    entity.setThatValue(q2.getValue());
	    entity.setThatUnit(q2.getUnit());
	    entity.setThatMeasurementType(q2.getMeasurementType());

	    entity.setOperation("ADD");
	    entity.setResultValue(result.getValue());
	    entity.setResultUnit(result.getUnit().getUnitName());
	    entity.setResultMeasurementType(q1.getMeasurementType());
	    entity.setError(false);

	    // Save to DB
	    repository.save(entity);

	    return new QuantityDTO(
	            result.getValue(),
	            result.getUnit().getUnitName(),
	            q1.getMeasurementType()
	    );
	}

	@Override
	public QuantityDTO subtract(QuantityDTO q1, QuantityDTO q2) {

	    Quantity<?> quantity1 = convertToQuantity(q1);
	    Quantity<?> quantity2 = convertToQuantity(q2);

	    Quantity<?> result = quantity1.subtract(quantity2);

	    // Create entity
	    QuantityMeasurementEntity entity = new QuantityMeasurementEntity();

	    entity.setThisValue(q1.getValue());
	    entity.setThisUnit(q1.getUnit());
	    entity.setThisMeasurementType(q1.getMeasurementType());

	    entity.setThatValue(q2.getValue());
	    entity.setThatUnit(q2.getUnit());
	    entity.setThatMeasurementType(q2.getMeasurementType());

	    entity.setOperation("SUBTRACT");
	    entity.setResultValue(result.getValue());
	    entity.setResultUnit(result.getUnit().getUnitName());
	    entity.setResultMeasurementType(q1.getMeasurementType());
	    entity.setError(false);

	    // Save to DB
	    repository.save(entity);

	    return new QuantityDTO(
	            result.getValue(),
	            result.getUnit().getUnitName(),
	            q1.getMeasurementType()
	    );
	}
	@Override
	public double divide(QuantityDTO q1, QuantityDTO q2) {

	    Quantity<?> quantity1 = convertToQuantity(q1);
	    Quantity<?> quantity2 = convertToQuantity(q2);

	    double result = quantity1.divide(quantity2);

	    // Create entity
	    QuantityMeasurementEntity entity = new QuantityMeasurementEntity();

	    entity.setThisValue(q1.getValue());
	    entity.setThisUnit(q1.getUnit());
	    entity.setThisMeasurementType(q1.getMeasurementType());

	    entity.setThatValue(q2.getValue());
	    entity.setThatUnit(q2.getUnit());
	    entity.setThatMeasurementType(q2.getMeasurementType());

	    entity.setOperation("DIVIDE");
	    entity.setResultValue(result);
	    entity.setError(false);

	    // Save to DB
	    repository.save(entity);

	    return result;
	}
}
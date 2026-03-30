# Quantity Measurement Application  

A Java-based application that demonstrates measurement equality comparison using object-oriented principles.  
---  


## UC1: Feet Measurement Equality  
### Description  
Checks equality of two numerical values in feet, handling null, type mismatch, and floating-point precision.  

Flow  
> Input two numerical values in feet.  
> Validate inputs are numeric.  
> Compare for equality → return true or false.  

Key Concepts  
> Override equals() using Double.compare() instead of ==  
> private final field for immutability  
> Null & type safety to prevent exceptions  
---    



## UC2: Feet and Inches Measurement Equality  
### Description  
Extends UC1 to support equality checks for both Feet and Inches independently using separate classes. Reduces main method dependency via static helper methods.  

Flow  
> Static method validates two feet values → compares equality.  
> Static method validates two inches values → compares equality.  
> Returns true / false for each comparison.  

Key Concepts  
> Separate Inches class mirroring Feet (same equality logic)  
> Static methods for Feet and Inches equality checks  
> Violates DRY principle  
---


## UC3: Generic Quantity Class (DRY Principle)  
### Description  
Refactors Feet and Inches into a single QuantityLength class using a LengthUnit enum. Eliminates code duplication and supports cross-unit equality (e.g., 1 foot == 12 inches).  
 
Flow  
> Input value + unit type → validate.  
> Convert both values to base unit (feet).  
> Compare converted values → return true / false.  

Key Concepts  
> LengthUnit enum with conversion factors  
> Single class handles all unit types (DRY)  
> Cross-unit equality via base unit normalization  
---


## UC4: Extended Unit Support (Yards & Centimeters)  
### Description  
Extends UC3 by adding YARDS (1 yd = 3 ft) and CENTIMETERS (1 cm = 0.393701 in) to the LengthUnit enum. No changes to QuantityLength class required.  

Flow
> Input value + unit (feet/inches/yards/cm) → validate.  
> Convert both to base unit (feet).  
> Compare → return true / false.  
> Conversion Factors  

### Conversion Factor   
```
Unit	            Factor (to feet)
YARDS            	3.0
CENTIMETERS	        ~0.0328
```


## feature/UC5-UnitConversion  
### Description  
Extends UC4 by exposing an explicit convert(value, sourceUnit, targetUnit) method. Normalizes to base unit (feet) then converts to target unit. Introduces method overloading and JavaDoc documentation.

Flow
> Validate value (finite), sourceUnit and targetUnit (non-null).
> Convert value → base unit using sourceUnit.getConversionFactor().
> Convert base unit → target using targetUnit.getConversionFactor().
> Return converted numeric value.

Key Concepts
> Method overloading: demonstrateLengthConversion(double, LengthUnit, LengthUnit) and (QuantityLength, LengthUnit)
> Private helper methods for encapsulation
> toString() override for readability
> Formula: result = value × (source.factor / target.factor)
---


## UC6: Addition of Two Length Units  
### Description  
Extends UC5 by adding two QuantityLength objects (potentially different units). Result is expressed in the unit of the first operand. Both operands are normalized to base unit before summing.  

Flow  
> Validate both operands (non-null, finite, valid units).  
> Convert both to base unit (feet).  
> Sum converted values.  
> Convert sum → first operand's unit.  
> Return new QuantityLength (immutability preserved).  

Key Concepts  
> Immutability: addition returns new instance  
> Commutativity: add(A, B) = add(B, A)  
> Method overloading for flexible API
---  


## UC7: Addition with Explicit Target Unit  
### Description  
Extends UC6 by allowing the caller to specify any supported unit as the result unit, regardless of the operands' units. Uses a private utility method to avoid code duplication across overloaded add() methods.  

Flow  
> Validate operands and target unit (non-null, finite).  
> Convert both to base unit → sum.  
> Convert sum → explicitly specified targetUnit.  
> Return new QuantityLength in target unit.

Key Concepts  
> Method overloading: add(l1, l2) implicit vs add(l1, l2, targetUnit) explicit  
> Private utility method eliminates DRY violation between overloads  
> Commutativity holds for any target unit  
---  


## UC8: Refactoring LengthUnit to Standalone Enum  
### Description  
Extracts LengthUnit from inside QuantityLength into a standalone top-level class. Assigns conversion responsibility to the enum itself. QuantityLength is simplified to delegate all conversions to unit methods. All UC1–UC7 functionality preserved.  

Flow  
> LengthUnit enum handles convertToBaseUnit() and convertFromBaseUnit().  
> QuantityLength delegates all conversions to unit methods.  
> Public API remains unchanged → backward compatible.  

Key Concepts  
> Single Responsibility: LengthUnit converts, QuantityLength compares/adds  
> Eliminates circular dependency for multi-category scaling  
> Pattern template for future WeightUnit, VolumeUnit, etc.  

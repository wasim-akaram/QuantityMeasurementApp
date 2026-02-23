package com.app.quantitymeasurement;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuantityMeasurementAppTest 
{

	//testinf features of UC1 Feet class
	
//    @Test
//    void testEqualValues() 
//    {
//        Feet f1 = new Feet(5.0);
//        Feet f2 = new Feet(5.0);
//
//        assertEquals(f1, f2);
//    }
//
//    @Test
//    void testDifferentValues() 
//    {
//        Feet f1 = new Feet(5.0);
//        Feet f2 = new Feet(6.0);
//
//        assertNotEquals(f1, f2);
//    }
//
//    @Test
//    void testEqualsWithNull() 
//    {
//        Feet f1 = new Feet(5.0);
//
//        assertNotEquals(f1, null);
//    }
//
//    @Test
//    void testEqualsWithDifferentType() 
//    {
//        Feet f1 = new Feet(5.0);
//        String str = "5.0";
//
//        assertNotEquals(f1, str);
//    }
//
//    @Test
//    void testHashCodeConsistency() 
//    {
//        Feet f1 = new Feet(5.0);
//        Feet f2 = new Feet(5.0);
//
//        assertEquals(f1.hashCode(), f2.hashCode());
//    }
//
//    @Test
//    void testSameReference() 
//    {
//        Feet f1 = new Feet(5.0);
//        Feet f2 = f1;
//
//        assertEquals(f1, f2);
//    }
//    
//    
//    
//    // Inches testinf for UC2
//    
//    @Test
//    void Inches_SameValue() 
//    {
//        assertTrue(QuantityMeasurementApp.compareInches(5.0, 5.0));
//    }
//
//    @Test
//    void Inches_DifferentValue() 
//    {
//        assertFalse(QuantityMeasurementApp.compareInches(5.0, 10.0));
//    }
//
//    @Test
//    void Inches_NullComparison() 
//    {
//        Inches i = new Inches(2.0);
//        assertFalse(i.equals(null));
//    }
//
//    @Test
//    void Inches_SameReference() 
//    {
//        Inches i = new Inches(2.0);
//        assertTrue(i.equals(i));
//    }
//
//
//
//    // Type Safety Testing
//    @Test
//    void testFeetNotEqualToInches() 
//    {
//        Feet f = new Feet(1.0);
//        Inches i = new Inches(1.0);
//        assertFalse(f.equals(i));
//    }
	
	
//	 @Test
//	    void testEquality_FeetToFeet_SameValue() {
//	        Length l1 = new Length(1.0, LengthUnit.FEET);
//	        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//	        assertEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_InchToInch_SameValue() {
//	        Length l1 = new Length(5.0, LengthUnit.INCHES);
//	        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//	        assertEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_FeetToInch_EquivalentValue() {
//	        Length l1 = new Length(1.0, LengthUnit.FEET);
//	        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//	        assertEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_InchToFeet_EquivalentValue() {
//	        Length l1 = new Length(12.0, LengthUnit.INCHES);
//	        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//	        assertEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_FeetToFeet_DifferentValue() {
//	        Length l1 = new Length(1.0, LengthUnit.FEET);
//	        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//	        assertNotEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_InchToInch_DifferentValue() {
//	        Length l1 = new Length(10.0, LengthUnit.INCHES);
//	        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//	        assertNotEquals(l1, l2);
//	    }
//
//	    @Test
//	    void testEquality_SameReference() {
//	        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//	        assertEquals(l1, l1);
//	    }
//
//	    @Test
//	    void testEquality_NullComparison() {
//	        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//	        assertNotEquals(l1, null);
//	    }
//
//	    @Test
//	    void testEquality_NullUnit() {
//	        assertThrows(IllegalArgumentException.class, () -> {
//	            new Length(1.0, null);
//	        });
//	    }
//
//	    @Test
//	    void testEquality_ConsistentResult() {
//	        Length l1 = new Length(1.0, LengthUnit.FEET);
//	        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//	        assertTrue(l1.equals(l2));
//	        assertTrue(l1.equals(l2)); // multiple calls must return same result
//	    }
//
//	    @Test
//	    void testEquality_Transitive() {
//	        Length a = new Length(1.0, LengthUnit.FEET);
//	        Length b = new Length(12.0, LengthUnit.INCHES);
//	        Length c = new Length(1.0, LengthUnit.FEET);
//
//	        assertEquals(a, b);
//	        assertEquals(b, c);
//	        assertEquals(a, c);
//	    }
	
	  // UC1: Feet to Feet
//    @Test
//    void FeetToFeet_SameValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void FeetToInch_EquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void InchToInch_SameValue() 
//    {
//        Length l1 = new Length(5.0, LengthUnit.INCHES);
//        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void FeetToFeet_DifferentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        assertNotEquals(l1, l2);
//    }
//
//
//    // UC2: Inch to Inch
//    @Test
//    void InchToFeet_EquivalentValue() 
//    {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void InchToInch_DifferentValue() 
//    {
//        Length l1 = new Length(10.0, LengthUnit.INCHES);
//        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//        assertNotEquals(l1, l2);
//    }
//
//    // UC3: Generic Equality and Comparison
//    @Test
//    void SameReference() 
//    {
//        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//        assertEquals(l1, l1);
//    }
//
//    @Test
//    void NullComparison() 
//    {
//        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//        assertNotEquals(l1, null);
//    }
//
//    @Test
//    void NullUnit() 
//    {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Length(1.0, null);
//        });
//    }
//
//    @Test
//    void ConsistentResult() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//        assertTrue(l1.equals(l2));
//    }
//
//
//    // UC4: Yard and Centimeter Tests
//
//    @Test
//    void Yard_SameValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(1.0, LengthUnit.YARDS);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void Yard_DifferentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(2.0, LengthUnit.YARDS);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    @Test
//    void YardToFeet_EquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void FeetToYard_EquivalentValue() 
//    {
//        Length l1 = new Length(3.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.YARDS);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void YardToInches_EquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(36.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void YardToFeet_NonEquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    // UC4 : Centimeter Tests
//    @Test
//    void CentimeterToCentimeter_SameValue() 
//    {
//        Length l1 = new Length(2.0, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(2.0, LengthUnit.CENTIMETERS);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void CentimeterToInches_EquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(0.393701, LengthUnit.INCHES);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    @Test
//    void CentimeterToFeet_NonEquivalentValue() 
//    {
//        Length l1 = new Length(1.0, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertFalse(l1.equals(l2));
//    }
//
//    @Test
//    void Transitive() 
//    {
//        Length yard = new Length(2.0, LengthUnit.YARDS);
//        Length feet = new Length(6.0, LengthUnit.FEET);
//        Length inches = new Length(72.0, LengthUnit.INCHES);
//
//        assertTrue(yard.equals(feet));
//        assertTrue(feet.equals(inches));
//        assertTrue(yard.equals(inches));
//    }
	


    // UC1: Feet to Feet
//    @Test
//    void FeetToFeet_SameValue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void FeetToInch_EquivalentValue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void InchToInch_SameValue() {
//        Length l1 = new Length(5.0, LengthUnit.INCHES);
//        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void FeetToFeet_DifferentValue() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        assertNotEquals(l1, l2);
//    }
//
//
//    // UC2: Inch to Inch
//    @Test
//    void InchToFeet_EquivalentValue() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void InchToInch_DifferentValue() {
//        Length l1 = new Length(10.0, LengthUnit.INCHES);
//        Length l2 = new Length(5.0, LengthUnit.INCHES);
//
//        assertNotEquals(l1, l2);
//    }
//
//    // UC3: Generic Equality and Comparison
//    @Test
//    void SameReference() {
//        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//        assertEquals(l1, l1);
//    }
//
//    @Test
//    void NullComparison() {
//        Length l1 = new Length(3.0, LengthUnit.FEET);
//
//        assertNotEquals(l1, null);
//    }
//
//    @Test
//    void NullUnit() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Length(1.0, null);
//        });
//    }
//
//    @Test
//    void ConsistentResult() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//
//        assertTrue(l1.equals(l2));
//        assertTrue(l1.equals(l2));
//    }
//
//
//    // UC4: Yard and Centimeter Tests
//
//    @Test
//    void Yard_SameValue() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(1.0, LengthUnit.YARDS);
//
//        assertTrue(l1.equals(l2));
//    }
//
//    @Test
//    void Yard_DifferentValue() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(2.0, LengthUnit.YARDS);
//
//        assertFalse(l1.equals(l2));
//    }
//
//
//    @Test
//    void YardToFeet_NonEquivalentValue() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(2.0, LengthUnit.FEET);
//
//        assertFalse(l1.equals(l2));
//    }
//
//
//    // UC4 : Centimeter Tests
//    @Test
//    void CentimeterToCentimeter_SameValue() {
//        Length l1 = new Length(2.0, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(2.0, LengthUnit.CENTIMETERS);
//
//        assertTrue(l1.equals(l2));
//    }
//
//
//    @Test
//    void CentimeterToFeet_NonEquivalentValue() {
//        Length l1 = new Length(1.0, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//
//        assertFalse(l1.equals(l2));
//    }
//
//
//    @Test
//    void Transitive() {
//        Length yard = new Length(2.0, LengthUnit.YARDS);
//        Length feet = new Length(6.0, LengthUnit.FEET);
//        Length inches = new Length(72.0, LengthUnit.INCHES);
//
//        assertTrue(yard.equals(feet));
//        assertTrue(feet.equals(inches));
//        assertTrue(yard.equals(inches));
//    }
//
//
//
//
//    // UC5: Conversion Tests
//    @Test
//    void convert_FeetToInches() {
//        double result = Length.convert( 1.0, LengthUnit.FEET, LengthUnit.INCHES );
//        assertEquals(12.0, result);
//    }
//
//    @Test
//    void convert_YardsToFeet() {
//        double result = Length.convert( 3.0, LengthUnit.YARDS, LengthUnit.FEET );
//        assertEquals(9.0, result);
//    }
//
//    @Test
//    void convert_CentimeterToInches() {
//        double result = Length.convert( 2.54, LengthUnit.CENTIMETERS, LengthUnit.INCHES);
//        assertEquals(1.0, result);
//    }
//
//    @Test
//    void convert_RoundTrip() {
//        double value = 5.0;
//        double converted = Length.convert( value, LengthUnit.FEET, LengthUnit.INCHES );
//        double back = Length.convert( converted, LengthUnit.INCHES, LengthUnit.FEET );
//        assertEquals(value, back);
//    }
//
//    @Test
//    void convert_InvalidUnit_Throws() {
//        assertThrows(IllegalArgumentException.class,
//                () -> Length.convert(1.0, null, LengthUnit.FEET));
//    }
//
//
//
//    // UC6 : Addition Testing
//    @Test
//    void add_FeetToFeet() {
//        Length l1 = new Length(2.0, LengthUnit.FEET);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(5.0, LengthUnit.FEET), result);
//    }
//
//    @Test
//    void add_FeetAndInches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(6.0, LengthUnit.INCHES);
//        Length result = l1.add(l2);
//        assertEquals(new Length(1.5, LengthUnit.FEET), result);
//    }
//
//    @Test
//    void add_YardAndFeet() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(2.0, LengthUnit.YARDS), result);
//    }
//
//    @Test
//    void add_CentimeterAndInches() {
//        Length l1 = new Length(2.54, LengthUnit.CENTIMETERS); // 1 inch
//        Length l2 = new Length(1.0, LengthUnit.INCHES);
//        Length result = l1.add(l2);
//        assertEquals(new Length(5.08, LengthUnit.CENTIMETERS), result);
//    }
//
//    @Test
//    void add_ResultInUnitOfFirstOperand() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
//    }
//
//    @Test
//    void add_NullLength_ShouldThrowException() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        assertThrows(IllegalArgumentException.class, () -> {
//            l1.add(null);
//        });
//    }
//
//    @Test
//    void add_RoundingCheck() {
//        Length l1 = new Length(1.333, LengthUnit.FEET);
//        Length l2 = new Length(2.222, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(3.56, LengthUnit.FEET), result);
//    }

	
	 // UC1 : Basic Equality Tests
//    @Test
//    void sameFeetAreEqual() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(5.0, LengthUnit.FEET);
//        assertEquals(l1, l2);
//    }
//
//    @Test
//    void differentFeetNotEqual() {
//        Length l1 = new Length(5.0, LengthUnit.FEET);
//        Length l2 = new Length(6.0, LengthUnit.FEET);
//        assertNotEquals(l1, l2);
//    }
//
//    @Test
//    void equalsReturnsFalseForNull() {
//        Length length = new Length(2.0, LengthUnit.FEET);
//        assertNotEquals(length, null);
//    }
//
//    @Test
//    void referenceEqualitySameObject() {
//        Length length = new Length(2.0, LengthUnit.FEET);
//        assertEquals(length, length);
//    }
//
//    // UC2 : Cross Unit Equality
//    @Test
//    void twelveInchesEqualsOneFoot() {
//        Length inches = new Length(12.0, LengthUnit.INCHES);
//        Length foot = new Length(1.0, LengthUnit.FEET);
//        assertEquals(foot, inches);
//    }
//
//    @Test
//    void thirtySixInchesEqualsOneYard() {
//        Length inches = new Length(36.0, LengthUnit.INCHES);
//        Length yard = new Length(1.0, LengthUnit.YARDS);
//        assertEquals(yard, inches);
//    }
//
//    @Test
//    void thirtyPoint48CmEqualsOneFoot() {
//        Length cm = new Length(30.48, LengthUnit.CENTIMETERS);
//        Length foot = new Length(1.0, LengthUnit.FEET);
//        assertEquals(foot, cm);
//    }
//
//    @Test
//    void yardNotEqualToInches() {
//        Length yard = new Length(1.0, LengthUnit.YARDS);
//        Length inches = new Length(12.0, LengthUnit.INCHES);
//        assertNotEquals(yard, inches);
//    }
//
//    // UC3 : Equality Contract
//    @Test
//    void reflexiveSymmetricAndTransitiveProperty() {
//        Length a = new Length(2.0, LengthUnit.YARDS);
//        Length b = new Length(6.0, LengthUnit.FEET);
//        Length c = new Length(72.0, LengthUnit.INCHES);
//
//        assertTrue(b.equals(a));
//        assertTrue(b.equals(c));
//        assertTrue(a.equals(c));
//    }
//
//    @Test
//    void crossUnitEqualityDemonstrateMethod() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(l1, l2));
//    }
//
//    // UC5 : Conversion Tests
//    @Test
//    void convertFeetToInches() {
//        Length feet = new Length(3.0, LengthUnit.FEET);
//        Length inches = feet.convertTo(LengthUnit.INCHES);
//        assertEquals(new Length(36.0, LengthUnit.INCHES), inches);
//    }
//
//    @Test
//    void convertYardsToInchesUsingOverloadedMethod() {
//        Length yards = new Length(2.0, LengthUnit.YARDS);
//        Length inches = yards.convertTo(LengthUnit.INCHES);
//        assertEquals(new Length(6.0, LengthUnit.INCHES), inches);
//    }
//
//    @Test
//    void convertCentimeterToFeet() {
//        Length cm = new Length(30.48, LengthUnit.CENTIMETERS);
//        Length feet = cm.convertTo(LengthUnit.FEET);
//        assertEquals(new Length(1.0, LengthUnit.FEET), feet);
//    }
//
//    // UC6 : Addition Tests
//    @Test
//    void addFeetToFeet() {
//        Length l1 = new Length(2.0, LengthUnit.FEET);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(5.0, LengthUnit.FEET), result);
//    }
//
//    @Test
//    void addFeetAndInches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(6.0, LengthUnit.INCHES);
//        Length result = l1.add(l2);
//        assertEquals(new Length(1.5, LengthUnit.FEET), result);
//    }
//
//    @Test
//    void addYardAndFeet() {
//        Length l1 = new Length(1.0, LengthUnit.YARDS);
//        Length l2 = new Length(3.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(2.0, LengthUnit.YARDS), result);
//    }
//
//    @Test
//    void addCentimeterAndInches() {
//        Length l1 = new Length(2.54, LengthUnit.CENTIMETERS);
//        Length l2 = new Length(1.0, LengthUnit.INCHES);
//        Length result = l1.add(l2);
//        assertEquals(new Length(33.02, LengthUnit.CENTIMETERS), result);
//    }
//
//    @Test
//    void addResultInUnitOfFirstOperand() {
//        Length l1 = new Length(12.0, LengthUnit.INCHES);
//        Length l2 = new Length(1.0, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
//    }
//
//    @Test
//    void addNullLengthShouldThrowException() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        assertThrows(IllegalArgumentException.class, () -> {
//            l1.add(null);
//        });
//    }
//
//    @Test
//    void addRoundingCheck() {
//        Length l1 = new Length(1.333, LengthUnit.FEET);
//        Length l2 = new Length(2.222, LengthUnit.FEET);
//        Length result = l1.add(l2);
//        assertEquals(new Length(3.56, LengthUnit.FEET), result);
//    }
//
//    // UC7 : Addition With Target Unit
//    @Test
//    void addFeetAndInchesWithTargetUnitInches() {
//        Length l1 = new Length(1.0, LengthUnit.FEET);
//        Length l2 = new Length(12.0, LengthUnit.INCHES);
//        Length result = Length.add(l1, l2, LengthUnit.INCHES);
//        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
//    }

	 @Test
	    void shouldBeEqualWhenSameUnitAndValue() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(1.0, LengthUnit.FEET);

	        assertEquals(l1, l2);
	    }

	    @Test
	    void shouldBeEqualAcrossDifferentUnits() {
	        Length feet = new Length(1.0, LengthUnit.FEET);
	        Length inches = new Length(12.0, LengthUnit.INCHES);

	        assertEquals(feet, inches);
	    }

	    @Test
	    void shouldNotBeEqualWhenDifferentValues() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(2.0, LengthUnit.FEET);

	        assertNotEquals(l1, l2);
	    }

	    @Test
	    void shouldReturnFalseWhenComparedWithNull() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);

	        assertNotEquals(l1, null);
	    }



	    @Test
	    void shouldConvertFeetToInches() {
	        double result = Length.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
	        assertEquals(12.0, result, 0.0001);
	    }

	    @Test
	    void shouldConvertYardsToFeet() {
	        double result = Length.convert(1.0, LengthUnit.YARDS, LengthUnit.FEET);
	        assertEquals(3.0, result, 0.0001);
	    }

	    @Test
	    void shouldConvertCentimetersToInches() {
	        double result = Length.convert(2.54, LengthUnit.CENTIMETERS, LengthUnit.INCHES);
	        assertEquals(1.0, result, 0.01);
	    }

	 

	    @Test
	    void shouldAddDifferentUnitsCorrectly() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(12.0, LengthUnit.INCHES);

	        Length result = l1.add(l2);

	        assertEquals(new Length(2.0, LengthUnit.FEET), result);
	    }

	    @Test
	    void shouldAddWithTargetUnitFeet() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(12.0, LengthUnit.INCHES);

	        Length result = Length.add(l1, l2, LengthUnit.FEET);

	        assertEquals(new Length(2.0, LengthUnit.FEET), result);
	    }

	    @Test
	    void shouldAddWithTargetUnitInches() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(12.0, LengthUnit.INCHES);

	        Length result = Length.add(l1, l2, LengthUnit.INCHES);

	        assertEquals(new Length(24.0, LengthUnit.INCHES), result);
	    }

	    @Test
	    void shouldAddNegativeValues() {
	        Length l1 = new Length(5.0, LengthUnit.FEET);
	        Length l2 = new Length(-2.0, LengthUnit.FEET);

	        Length result = l1.add(l2);

	        assertEquals(new Length(3.0, LengthUnit.FEET), result);
	    }

	  

	    @Test
	    void shouldThrowExceptionForNullUnit() {
	        assertThrows(IllegalArgumentException.class,
	                () -> new Length(5.0, null));
	    }

	    @Test
	    void shouldThrowExceptionForInfiniteValue() {
	        assertThrows(IllegalArgumentException.class,
	                () -> new Length(Double.POSITIVE_INFINITY, LengthUnit.FEET));
	    }

	    @Test
	    void shouldThrowExceptionWhenAddingNull() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);

	        assertThrows(IllegalArgumentException.class,
	                () -> l1.add(null));
	    }

	  

	    @Test
	    void equalObjectsMustHaveSameHashCode() {
	        Length l1 = new Length(1.0, LengthUnit.FEET);
	        Length l2 = new Length(12.0, LengthUnit.INCHES);

	        assertEquals(l1.hashCode(), l2.hashCode());
	    }
	
}
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
    @Test
    void FeetToFeet_SameValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertEquals(l1, l2);
    }

    @Test
    void FeetToInch_EquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertEquals(l1, l2);
    }

    @Test
    void InchToInch_SameValue() 
    {
        Length l1 = new Length(5.0, LengthUnit.INCHES);
        Length l2 = new Length(5.0, LengthUnit.INCHES);

        assertEquals(l1, l2);
    }

    @Test
    void FeetToFeet_DifferentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(2.0, LengthUnit.FEET);

        assertNotEquals(l1, l2);
    }


    // UC2: Inch to Inch
    @Test
    void InchToFeet_EquivalentValue() 
    {
        Length l1 = new Length(12.0, LengthUnit.INCHES);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertEquals(l1, l2);
    }

    @Test
    void InchToInch_DifferentValue() 
    {
        Length l1 = new Length(10.0, LengthUnit.INCHES);
        Length l2 = new Length(5.0, LengthUnit.INCHES);

        assertNotEquals(l1, l2);
    }

    // UC3: Generic Equality and Comparison
    @Test
    void SameReference() 
    {
        Length l1 = new Length(3.0, LengthUnit.FEET);

        assertEquals(l1, l1);
    }

    @Test
    void NullComparison() 
    {
        Length l1 = new Length(3.0, LengthUnit.FEET);

        assertNotEquals(l1, null);
    }

    @Test
    void NullUnit() 
    {
        assertThrows(IllegalArgumentException.class, () -> {
            new Length(1.0, null);
        });
    }

    @Test
    void ConsistentResult() 
    {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
        assertTrue(l1.equals(l2));
    }


    // UC4: Yard and Centimeter Tests

    @Test
    void Yard_SameValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(1.0, LengthUnit.YARDS);

        assertTrue(l1.equals(l2));
    }

    @Test
    void Yard_DifferentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(2.0, LengthUnit.YARDS);

        assertFalse(l1.equals(l2));
    }

    @Test
    void YardToFeet_EquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(3.0, LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    @Test
    void FeetToYard_EquivalentValue() 
    {
        Length l1 = new Length(3.0, LengthUnit.FEET);
        Length l2 = new Length(1.0, LengthUnit.YARDS);

        assertTrue(l1.equals(l2));
    }

    @Test
    void YardToInches_EquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(36.0, LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    @Test
    void YardToFeet_NonEquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.YARDS);
        Length l2 = new Length(2.0, LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    // UC4 : Centimeter Tests
    @Test
    void CentimeterToCentimeter_SameValue() 
    {
        Length l1 = new Length(2.0, LengthUnit.CENTIMETERS);
        Length l2 = new Length(2.0, LengthUnit.CENTIMETERS);

        assertTrue(l1.equals(l2));
    }

    @Test
    void CentimeterToInches_EquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.CENTIMETERS);
        Length l2 = new Length(0.393701, LengthUnit.INCHES);

        assertFalse(l1.equals(l2));
    }

    @Test
    void CentimeterToFeet_NonEquivalentValue() 
    {
        Length l1 = new Length(1.0, LengthUnit.CENTIMETERS);
        Length l2 = new Length(1.0, LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    @Test
    void Transitive() 
    {
        Length yard = new Length(2.0, LengthUnit.YARDS);
        Length feet = new Length(6.0, LengthUnit.FEET);
        Length inches = new Length(72.0, LengthUnit.INCHES);

        assertTrue(yard.equals(feet));
        assertTrue(feet.equals(inches));
        assertTrue(yard.equals(inches));
    }

	
}
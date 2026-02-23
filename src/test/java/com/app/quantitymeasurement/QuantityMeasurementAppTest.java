package com.app.quantitymeasurement;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuantityMeasurementAppTest 
{

	//testinf features of UC1 Feet class
	
    @Test
    void testEqualValues() 
    {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);

        assertEquals(f1, f2);
    }

    @Test
    void testDifferentValues() 
    {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(6.0);

        assertNotEquals(f1, f2);
    }

    @Test
    void testEqualsWithNull() 
    {
        Feet f1 = new Feet(5.0);

        assertNotEquals(f1, null);
    }

    @Test
    void testEqualsWithDifferentType() 
    {
        Feet f1 = new Feet(5.0);
        String str = "5.0";

        assertNotEquals(f1, str);
    }

    @Test
    void testHashCodeConsistency() 
    {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);

        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    void testSameReference() 
    {
        Feet f1 = new Feet(5.0);
        Feet f2 = f1;

        assertEquals(f1, f2);
    }
    
    
    
    // Inches testinf for UC2
    
    @Test
    void Inches_SameValue() 
    {
        assertTrue(QuantityMeasurementApp.compareInches(5.0, 5.0));
    }

    @Test
    void Inches_DifferentValue() 
    {
        assertFalse(QuantityMeasurementApp.compareInches(5.0, 10.0));
    }

    @Test
    void Inches_NullComparison() 
    {
        Inches i = new Inches(2.0);
        assertFalse(i.equals(null));
    }

    @Test
    void Inches_SameReference() 
    {
        Inches i = new Inches(2.0);
        assertTrue(i.equals(i));
    }



    // Type Safety Testing
    @Test
    void testFeetNotEqualToInches() 
    {
        Feet f = new Feet(1.0);
        Inches i = new Inches(1.0);
        assertFalse(f.equals(i));
    }
}
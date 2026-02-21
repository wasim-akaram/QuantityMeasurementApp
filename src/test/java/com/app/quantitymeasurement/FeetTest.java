package com.app.quantitymeasurement;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FeetTest 
{

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
}
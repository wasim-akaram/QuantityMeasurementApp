package com.app.quantitymeasurement;

import java.util.Objects;


public  class Feet 
{
	
	// Immutable field
    private final double value; 

    public Feet(double value) 
    {
        this.value = value;
    }

    public double getValue() 
    {
        return value;
    }

    @Override
    public boolean equals(Object obj) 
    {

    
        if (this == obj) 
        {
            return true;
        }

        //Null and type check
        if (obj == null || getClass() != obj.getClass()) 
        {
            return false;
        }
        

        Feet other = (Feet) obj;

        return Double.compare(this.value, other.value) == 0;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(value);
    }
}
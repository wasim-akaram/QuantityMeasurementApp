package com.app.quantitymeasurement;

import java.util.Scanner;
public class QuantityMeasurementApp 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	Feet f1 = new Feet(sc.nextDouble());
    	Feet f2 = new Feet(sc.nextDouble());
    	
    	if(f1.equals(f2))
    	{
    		System.out.println("Both the values are equal");
    		
    	}
    	else
    	{
    		System.out.println("Both the values are not equal");
    	}
    	
       
    }
}

package com.app.quantitymeasurement.app;

import com.app.quantitymeasurement.controller.QuantityMeasurementController;
import com.app.quantitymeasurement.repository.IQuantityMeasurementRepository;
import com.app.quantitymeasurement.repository.QuantityMeasurementCacheRepository;
import com.app.quantitymeasurement.service.IQuantityMeasurementService;
import com.app.quantitymeasurement.service.QuantityMeasurementServiceImpl;


public class QuantityMeasurementApp 
{
	

    public static void main(String[] args) 
    {
    	
    	
    	
    	 // create repository
        IQuantityMeasurementRepository repository = QuantityMeasurementCacheRepository.getInstance();

        // create service
  
        IQuantityMeasurementService service = new QuantityMeasurementServiceImpl(repository);

        // create controller
        QuantityMeasurementController controller = new QuantityMeasurementController(service);

        // start demo
        controller.runDemo();
    	
    	
    	
    	
    }
}
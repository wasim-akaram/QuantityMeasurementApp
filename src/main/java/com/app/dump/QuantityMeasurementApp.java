package com.app.dump;

import com.app.quantitymeasurement.controller.QuantityMeasurementController;
import com.app.quantitymeasurement.service.IQuantityMeasurementService;
import com.app.quantitymeasurement.service.QuantityMeasurementServiceImpl;
import com.app.quantitymeasurement.util.ApplicationConfig;


public class QuantityMeasurementApp 
{
	

    public static void main(String[] args) 
    {
    	
    	
    	
    	 // create repository
    	IQuantityMeasurementRepository repository;

    	if (ApplicationConfig.getRepositoryType().equals("database")) {
    	    repository = new QuantityMeasurementDatabaseRepository();
    	} else {
    	    repository = QuantityMeasurementCacheRepository.getInstance();
    	}
        // create service
  
        IQuantityMeasurementService service = new QuantityMeasurementServiceImpl(repository);

        // create controller
        QuantityMeasurementController controller = new QuantityMeasurementController(service);

        // start demo
        controller.runDemo();
    	
    	
    	
    	
    }
}
package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.dto.QuantityDTO;
import com.app.quantitymeasurement.service.IQuantityMeasurementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/quantities")
public class QuantityMeasurementController {

    @Autowired
    private IQuantityMeasurementService service;

    //  Compare
    @PostMapping("/compare")
    public ResponseEntity<Boolean> compare(@RequestBody CompareRequest request) {
        boolean result = service.compare(request.getQ1(), request.getQ2());
        return ResponseEntity.ok(result);
    }

    //  Add
    @PostMapping("/add")
    public ResponseEntity<QuantityDTO> add(@RequestBody CompareRequest request) {
        return ResponseEntity.ok(service.add(request.getQ1(), request.getQ2()));
    }

    //  Subtract
    @PostMapping("/subtract")
    public ResponseEntity<QuantityDTO> subtract(@RequestBody CompareRequest request) {
        return ResponseEntity.ok(service.subtract(request.getQ1(), request.getQ2()));
    }

    //  Divide/
    @PostMapping("/divide")
    public ResponseEntity<Double> divide(@RequestBody CompareRequest request) {
        return ResponseEntity.ok(service.divide(request.getQ1(), request.getQ2()));
    }

    //  Convert
    @PostMapping("/convert")
    public ResponseEntity<QuantityDTO> convert(@RequestBody ConvertRequest request) {
        return ResponseEntity.ok(
                service.convert(request.getQuantity(), request.getTargetUnit())
        );
    }
}
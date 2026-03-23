package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.model.QuantityDTO;
import lombok.Data;

@Data
public class ConvertRequest {
    private QuantityDTO quantity;
    private String targetUnit;
}
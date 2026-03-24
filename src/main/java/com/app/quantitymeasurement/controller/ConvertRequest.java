package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.dto.QuantityDTO;

import lombok.Data;

@Data
public class ConvertRequest {
    private QuantityDTO quantity;
    private String targetUnit;
}
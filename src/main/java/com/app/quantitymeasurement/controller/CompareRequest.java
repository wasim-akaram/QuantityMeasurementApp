package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.dto.QuantityDTO;

import lombok.Data;

@Data
public class CompareRequest {
    private QuantityDTO q1;
    private QuantityDTO q2;
}
package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.model.QuantityDTO;
import lombok.Data;

@Data
public class CompareRequest {
    private QuantityDTO q1;
    private QuantityDTO q2;
}
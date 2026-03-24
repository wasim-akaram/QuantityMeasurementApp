package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.dto.QuantityDTO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuantityMeasurementServiceTest {

    @Autowired
    private QuantityMeasurementServiceImpl service;

    @Test
    void givenTwoLengths_whenAdded_shouldReturnCorrectResult() {

        QuantityDTO q1 = new QuantityDTO(1.0, "FEET", "LENGTH");
        QuantityDTO q2 = new QuantityDTO(12.0, "INCHES", "LENGTH");

        QuantityDTO result = service.add(q1, q2);

        assertEquals(2.0, result.getValue());
        assertEquals("FEET", result.getUnit());
    }

    @Test
    void givenTwoLengths_whenSubtracted_shouldReturnCorrectResult() {

        QuantityDTO q1 = new QuantityDTO(12.0, "INCHES", "LENGTH");
        QuantityDTO q2 = new QuantityDTO(10.0, "INCHES", "LENGTH");

        QuantityDTO result = service.subtract(q1, q2);

        assertEquals(2.0, result.getValue());
        assertEquals("INCHES", result.getUnit());
    }

    @Test
    void givenSameValues_whenCompared_shouldReturnTrue() {

        QuantityDTO q1 = new QuantityDTO(12.0, "INCHES", "LENGTH");
        QuantityDTO q2 = new QuantityDTO(1.0, "FEET", "LENGTH");

        boolean result = service.compare(q1, q2);

        assertTrue(result);
    }
}
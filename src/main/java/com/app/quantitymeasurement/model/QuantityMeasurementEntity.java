package com.app.quantitymeasurement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "quantity_measurements")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuantityMeasurementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double thisValue;
    private String thisUnit;
    private String thisMeasurementType;

    private Double thatValue;
    private String thatUnit;
    private String thatMeasurementType;

    private String operation;

    private Double resultValue;
    private String resultString;

    // ✅ ADD THESE TWO
    private String resultUnit;
    private String resultMeasurementType;

    private boolean isError;
    private String errorMessage;

    private LocalDateTime createdAt;
}
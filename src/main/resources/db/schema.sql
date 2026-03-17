CREATE TABLE quantity_measurement (
    id IDENTITY PRIMARY KEY,
    operation VARCHAR(50),
    operand1 VARCHAR(255),
    operand2 VARCHAR(255),
    result VARCHAR(255),
    error VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
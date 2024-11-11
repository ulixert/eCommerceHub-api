package com.ulixert.ecommercehub.model.enums;

public enum PaymentStatus {
    PENDING,            // PENDING is the default status
    PAID,               // PAID is the status after the payment is successful
    FAILED,             // FAILED is the status after the payment is failed
    CANCELLED           // CANCELLED is the status after the payment is cancelled
}

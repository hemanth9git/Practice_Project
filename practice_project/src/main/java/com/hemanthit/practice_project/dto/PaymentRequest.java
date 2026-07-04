package com.hemanthit.practice_project.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private String payerName;
    private int amount;
}

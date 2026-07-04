package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "payment_practice")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    private String payerName;
    private String transactionId;
    private int amount;
    private String status;
}

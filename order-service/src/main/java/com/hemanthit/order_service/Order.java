package com.hemanthit.order_service;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Orders_practice")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String orderId;
    private String itemName;
    private String orderStatus;
}

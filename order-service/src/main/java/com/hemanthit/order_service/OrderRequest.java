package com.hemanthit.order_service;

import lombok.Data;

@Data
public class OrderRequest {
    private int orderId;
    private String itemName;
}

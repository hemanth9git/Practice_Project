package com.hemanthit.Inventory_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "practice_Inventory")
public class Inventory {
    @Id
    @GeneratedValue
    private int id;
    private String itemName;
    private int quantity;
}

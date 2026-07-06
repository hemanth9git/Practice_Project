package com.hemanthit.practice_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "products_practice")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private int price;

    @JsonIgnore
    @ManyToMany
    private List<Customer> customer;
}

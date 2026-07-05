package com.hemanthit.practice_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders_practice")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String orderName;
    private String orderStatus;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "ord_fkid")
    private Customer custo;
}

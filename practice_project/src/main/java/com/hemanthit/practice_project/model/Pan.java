package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pan_practice")
public class Pan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int panId;
    @Column(unique = true)
    private String panNumber;

    @OneToOne
    @JoinColumn(name = "pn_fkid") // foreign key
    private Customer cust;
}

package com.hemanthit.practice_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "pn_fkid") // foreign key
    private Customer cust;
}

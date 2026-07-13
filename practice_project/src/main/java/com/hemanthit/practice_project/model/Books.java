package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "books_practice")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private double price;
}

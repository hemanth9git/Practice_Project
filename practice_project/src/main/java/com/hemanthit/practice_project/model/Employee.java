package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee_practice")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String empCode;
    private long empSalary;
}

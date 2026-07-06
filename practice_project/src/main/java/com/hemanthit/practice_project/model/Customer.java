package com.hemanthit.practice_project.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.spi.CascadeStyles;

import java.util.List;

@Data
@Entity
@Table(name="customer_practice")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String name;
    private int age;
    private long mobile;

    @OneToOne(mappedBy = "cust",cascade = CascadeType.ALL)//It only saves both the entities
    //or it won't be saved anyone. Either it saves both or it doesnot saves both.
    private Pan pan;

    @OneToMany(mappedBy = "custo",cascade = CascadeType.ALL)
    private List<Orders> orders;

    @ManyToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JoinTable(
            name = "practice_foreign",
            joinColumns = @JoinColumn(name = "cid"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Products> products;
}

package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.model.Products;
import com.hemanthit.practice_project.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductsService {

    ProductsRepository repository;

    public Products saveProduct(Products product) {
        return repository.save(product);
    }
}

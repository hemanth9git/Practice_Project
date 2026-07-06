package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.Products;
import com.hemanthit.practice_project.serviceImpl.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("products")
public class ProductsController {

    ProductsService service;

    @PostMapping("saveProduct")
    public ResponseEntity<Products> saveProducts(@RequestBody Products product){
        Products savedProduct =service.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.OK);
    }
}

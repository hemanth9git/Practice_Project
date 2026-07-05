package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.OrderRequestDto;
import com.hemanthit.practice_project.serviceImpl.OrdersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("orders")
public class OrderController {
    OrdersService service;

    @PostMapping("saveOrders")
    public ResponseEntity<OrderRequestDto> saveOrders(@RequestBody OrderRequestDto dto){
        OrderRequestDto savedDto =service.saveOrders(dto);
        return new ResponseEntity<>(savedDto, HttpStatus.OK);
    }
}

package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.model.Payment;
import com.hemanthit.practice_project.serviceImpl.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("payment")
public class PaymentController {

    PaymentService service;

   

}

package com.hemanthit.practice_project.controller;

import com.hemanthit.practice_project.dto.PaymentRequest;
import com.hemanthit.practice_project.model.Payment;
import com.hemanthit.practice_project.serviceImpl.PaymentService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("payment")
public class PaymentController {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentController.class);

    PaymentService service;

    @PostMapping("savePayment")
   public ResponseEntity<Payment> savePayment(@RequestBody PaymentRequest request){
        logger.info("Started the payment...");
        logger.info("Sending the req to payment service");
        Payment payment=service.savePayment(request);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
   }

}

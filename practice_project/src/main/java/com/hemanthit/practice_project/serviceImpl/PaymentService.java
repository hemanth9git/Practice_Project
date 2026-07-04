package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.controller.PaymentController;
import com.hemanthit.practice_project.dto.PaymentRequest;
import com.hemanthit.practice_project.model.Payment;
import com.hemanthit.practice_project.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class PaymentService {

    private static final Logger logger =
            LoggerFactory.getLogger(PaymentController.class);
    PaymentRepository repository;

    public Payment savePayment(PaymentRequest request) {

        Payment payment=new Payment();
        payment.setAmount(request.getAmount());
        payment.setPayerName(request.getPayerName());
        int balance=10000;
        logger.info("Received the payment request");
        if(request.getAmount()>100000){
            logger.warn("Fraud alert..");
        }
        if(request.getAmount()>balance){
            logger.error("Transaction amount greater than balance and payment failed..");
            payment.setTransactionId(UUID.randomUUID().toString());
            payment.setStatus("Payment failed..");
            return repository.save(payment);
        }else{
            logger.info("Payment in progress..");
            payment.setTransactionId(UUID.randomUUID().toString());
            payment.setStatus("Payment Success..");
            logger.info("Payment successs...");
            return repository.save(payment);
        }


    }
}

package com.hemanthit.order_service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.UUID;

@AllArgsConstructor
@Service
public class OrderService {

    OrderRepository repository;

    WebClient webClient;

    public Order giveOrder(OrderRequest request) {

        Order order = new Order();
        order.setItemName(request.getItemName());


        Boolean inventory=webClient.get()
                .uri("http://localhost:8080/inventory/getItem/"+request.getItemName()+"/"+request.getQuantity())
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();



        if(inventory){
            order.setOrderStatus("Order successfull");
            order.setOrderId(UUID.randomUUID().toString());
            return repository.save(order);
        }else {
            order.setOrderStatus("FAILED");
            order.setOrderId(UUID.randomUUID().toString());
            return repository.save(order);
        }

    }



}

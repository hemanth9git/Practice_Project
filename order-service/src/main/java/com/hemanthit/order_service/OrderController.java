package com.hemanthit.order_service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("orders")
public class OrderController {

    OrderService service;


    @GetMapping("placeOrder")
    public ResponseEntity<Order> giveOrder(@RequestBody OrderRequest request){
        Order savedOrder =service.giveOrder(request);
        return new ResponseEntity<>(savedOrder, HttpStatus.OK);
    }


}

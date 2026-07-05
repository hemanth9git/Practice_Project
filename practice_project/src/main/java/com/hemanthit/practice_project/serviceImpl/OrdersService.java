package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.exceptions.IdNotFoundException;
import com.hemanthit.practice_project.model.Customer;
import com.hemanthit.practice_project.model.OrderRequestDto;
import com.hemanthit.practice_project.model.Orders;
import com.hemanthit.practice_project.repository.CustomerRepository;
import com.hemanthit.practice_project.repository.OrdersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrdersService {

    OrdersRepository repository;
    CustomerRepository customerRepository;

    public OrderRequestDto saveOrders(OrderRequestDto dto) {

        int customerID=dto.getCid();
        Customer customer=customerRepository.findById(customerID).orElseThrow(IdNotFoundException::new);

        List<Orders> ordersList=dto.getOrders();

        for(Orders order:ordersList){
            order.setCusto(customer); // foreign key setting
        }

         java.util.List<Orders> savedOrders =repository.saveAll(ordersList);

        OrderRequestDto savedDto= new OrderRequestDto();

        savedDto.setCid(dto.getCid());
        savedDto.setOrders(savedOrders);

        return savedDto;





    }
}

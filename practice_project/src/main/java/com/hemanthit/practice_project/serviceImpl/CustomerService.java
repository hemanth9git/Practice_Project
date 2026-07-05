package com.hemanthit.practice_project.serviceImpl;

import com.hemanthit.practice_project.model.Customer;
import com.hemanthit.practice_project.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class CustomerService {

    CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        customer.getPan().setCust(customer);
        return repository.save(customer);
    }
}

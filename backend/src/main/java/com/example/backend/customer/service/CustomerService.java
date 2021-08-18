package com.example.backend.customer.service;

import com.example.backend.customer.dto.CustomerCreateDTO;
import com.example.backend.customer.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Customer getCustomerById(Long id);

    Customer createCustomer(CustomerCreateDTO customerCreateDTO);

    Customer updateCustomer(Customer customer);


}

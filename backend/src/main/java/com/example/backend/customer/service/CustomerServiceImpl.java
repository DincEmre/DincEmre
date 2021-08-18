package com.example.backend.customer.service;

import com.example.backend.customer.dto.CustomerCreateDTO;
import com.example.backend.customer.model.Customer;
import com.example.backend.customer.repository.CustomerRepository;
import com.example.backend.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Long id)  {
        try {
            return customerRepository.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not Found Exception.");
        }
      return null;
    }

    @Override
    public Customer createCustomer(CustomerCreateDTO customerCreateDTO) {
        final Customer customer = customerRepository
                .save(new Customer(customerCreateDTO.getMsidn(),customerCreateDTO.getFirstName(), customerCreateDTO.getLastName()));
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}


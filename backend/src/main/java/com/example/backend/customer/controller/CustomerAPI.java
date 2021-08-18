package com.example.backend.customer.controller;


import com.example.backend.customer.dto.CustomerCreateDTO;
import com.example.backend.customer.dto.CustomerDTO;
import com.example.backend.customer.model.Customer;
import com.example.backend.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomerAPI {

    private final CustomerService customerService;


    @GetMapping("v1/customer/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("id") Long id){
        final Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(CustomerDTO.of(customer));
    }

    @PostMapping("v1/customer")
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerCreateDTO customerCreateDTO){
        Customer customer = customerService.createCustomer(customerCreateDTO);
        return ResponseEntity.ok(CustomerDTO.of(customer));
    }
}

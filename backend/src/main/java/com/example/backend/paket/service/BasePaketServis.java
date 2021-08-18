package com.example.backend.paket.service;

import com.example.backend.customer.model.Customer;
import com.example.backend.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePaketServis {

    @Autowired private CustomerService customerService;

    public void paketTanimla(Customer customer, PaketServis paketServis) {
        Customer newCustomer = paketServis.paketTanimla(customer);
        customerService.updateCustomer(newCustomer);
    }

    public void paketIptal(Customer customer, PaketServis paketServis) {
        paketServis.paketIptal(customer);
    }
}

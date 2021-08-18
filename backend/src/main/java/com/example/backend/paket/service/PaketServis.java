package com.example.backend.paket.service;

import com.example.backend.customer.model.Customer;

public interface PaketServis {
    Customer paketTanimla(Customer customer);
    void paketIptal(Customer customer);
}

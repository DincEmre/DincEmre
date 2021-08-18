package com.example.backend.paket.service.gnc;

import com.example.backend.customer.model.Customer;
import com.example.backend.paket.service.PaketServis;
import org.springframework.stereotype.Service;

@Service
public class gnctrkcllImpl implements PaketServis {

    @Override
    public Customer paketTanimla(Customer customer) {
        customer.getPaketler().add("gnctrkcll");
        System.out.println(customer.getFirstName() + " müşterisine gnctrkcll paket tanımlandı!");
        return customer;
    }

    @Override
    public void paketIptal(Customer customer) {

    }
}

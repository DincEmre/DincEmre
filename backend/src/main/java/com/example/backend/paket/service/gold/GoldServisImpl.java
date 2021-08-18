package com.example.backend.paket.service.gold;

import com.example.backend.customer.model.Customer;
import com.example.backend.paket.service.PaketServis;
import org.springframework.stereotype.Service;

@Service
public class GoldServisImpl implements PaketServis {

    public Customer paketTanimla(Customer customer) {
        customer.getPaketler().add("gnctrkcll");
        System.out.println(customer.getFirstName() + " müşterisine gold paket tanımlandı!");
        return customer;
    }

    public void paketIptal(Customer customer) {
        System.out.println(customer.getFirstName() + " müşterisinden gold paket kaldırıldı!");
    }
}

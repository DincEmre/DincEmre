package com.example.backend.paket.controller;

import com.example.backend.customer.service.CustomerService;
import com.example.backend.enums.PaketTipi;
import com.example.backend.factory.PaketServisFaktory;
import com.example.backend.paket.service.BasePaketServis;
import com.example.backend.paket.service.PaketServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.customer.model.Customer;

@RestController
@RequestMapping("/paket")
public class PacketsAPI {
    @Autowired private BasePaketServis basePaketServis;
    @Autowired private PaketServisFaktory paketServisFaktory;
    @Autowired private CustomerService customerService;

    @GetMapping("/ekle")
    public void paketTanimla(Long customerId, PaketTipi paketTipi) {
        PaketServis paketServis = paketServisFaktory.getPaketServis(paketTipi);
        Customer customer = customerService.getCustomerById(customerId);
        basePaketServis.paketTanimla(customer, paketServis);
    }

    @GetMapping("/iptal")
    public void paketIptal(Long customerId, PaketTipi paketTipi) {
        PaketServis paketServis = paketServisFaktory.getPaketServis(paketTipi);
        Customer customer = customerService.getCustomerById(customerId);
        basePaketServis.paketIptal(customer, paketServis);
    }

}

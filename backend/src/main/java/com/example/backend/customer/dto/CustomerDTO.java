package com.example.backend.customer.dto;

import com.example.backend.customer.model.Customer;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
public final class CustomerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String firstName;

    private final String lastName;

    private final String msidn;

    private final List<String> paketler;

    private CustomerDTO(String firstName, String lastName, String msidn, List<String> paketler){
        this.firstName = firstName;
        this.lastName = lastName;
        this.msidn = msidn;
        this.paketler = paketler;
    }

    public static CustomerDTO of(Customer customer){
        return new CustomerDTO(customer.getFirstName(), customer.getLastName(), customer.getMsidn(), customer.getPaketler());
    }

}

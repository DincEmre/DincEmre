package com.example.backend.customer.dto;

import lombok.Data;

@Data
public class CustomerCreateDTO {

    private String firstName;
    private String lastName;
    private String msidn;
    private String packet;

}

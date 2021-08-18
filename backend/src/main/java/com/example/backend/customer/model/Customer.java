package com.example.backend.customer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "msidn", nullable = false, length = 50, unique = true)
    private String msidn;

    @Column(name = "first_name", nullable = false, length = 50, unique = true)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50, unique = true)
    private String lastName;

    @ElementCollection
    @Column(name = "packet", nullable = false, length = 50, unique = true)
    private List<String> paketler = new ArrayList<>();


    public Customer(String msidn, String firstName, String lastName){
        this.msidn = msidn;
        this.firstName = firstName;
        this.lastName = lastName;
    }


}

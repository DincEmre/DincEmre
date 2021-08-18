package com.example.backend.paket.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "packets")
public class Packets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "packet_name", nullable = false, length = 50)
    private String packetName;

    @Column(name = "price", nullable = false, length = 50)
    private long price;

    public Packets(String packetName, long price) {
        this.packetName = packetName;
        this.price = price;
    }
}

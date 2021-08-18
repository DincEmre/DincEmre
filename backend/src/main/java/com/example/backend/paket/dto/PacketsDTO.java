package com.example.backend.paket.dto;

import com.example.backend.paket.model.Packets;
import lombok.Getter;

import java.io.Serializable;

@Getter
public final class PacketsDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String packetName;

    private final long price;

    public PacketsDTO(String packetName, long price) {
        this.packetName = packetName;
        this.price = price;
    }

    public static PacketsDTO of(Packets packets){

        return new PacketsDTO(packets.getPacketName(), packets.getPrice());
    }
}

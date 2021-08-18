package com.example.backend.enums;

public enum PaketTipi {
    PLATINUM("platinum"), GOLD("gold"), SILVER("silver"), GNC("gnctrkcll");

    private final String name;

    PaketTipi(String name) {
        this.name = name;
    }
}

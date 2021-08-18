package com.example.backend.factory;

import com.example.backend.enums.PaketTipi;
import com.example.backend.paket.service.PaketServis;
import com.example.backend.paket.service.gnc.gnctrkcllImpl;
import com.example.backend.paket.service.gold.GoldServisImpl;
import com.example.backend.paket.service.platinum.PlatinumServisImpl;
import com.example.backend.paket.service.silver.SilverServisImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaketServisFaktory {

    @Autowired private PlatinumServisImpl platinumServis;
    @Autowired private GoldServisImpl goldServis;
    @Autowired private SilverServisImpl silverServis;
    @Autowired private gnctrkcllImpl gnctrkcllServis;

    public PaketServis getPaketServis(PaketTipi paketTipi) {
        switch (paketTipi) {
            case GNC: return gnctrkcllServis;
            case PLATINUM: return platinumServis;
            case GOLD: return goldServis;
            case SILVER: return silverServis;
            default: throw new IllegalStateException("Böyle bir paket servisi bulunmuyor! istenen PaketServis: " + paketTipi);
        }
    }
}

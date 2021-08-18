package com.example.backend.paket.repository;

import com.example.backend.paket.model.Packets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacketsRepository extends JpaRepository <Packets, Long> {
}

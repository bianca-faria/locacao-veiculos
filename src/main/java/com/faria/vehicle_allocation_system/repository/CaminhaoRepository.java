package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.CaminhaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CaminhaoRepository extends JpaRepository<CaminhaoEntity, Long> {
}

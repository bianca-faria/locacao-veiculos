package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.MotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotoRepository extends JpaRepository<MotoEntity, UUID> {
}

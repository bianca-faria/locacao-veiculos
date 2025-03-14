package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarroRepository extends JpaRepository<CarroEntity, UUID> {
}

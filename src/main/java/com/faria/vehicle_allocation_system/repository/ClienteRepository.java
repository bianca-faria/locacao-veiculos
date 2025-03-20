package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {
}

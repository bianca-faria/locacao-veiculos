package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}

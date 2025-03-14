package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {

}

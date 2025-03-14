package com.faria.vehicle_allocation_system.repository;
import com.faria.vehicle_allocation_system.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VeiculoRepository extends JpaRepository<VeiculoEntity, UUID> {

}

package com.faria.vehicle_allocation_system.repository;

import com.faria.vehicle_allocation_system.entity.LocacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface LocacaoRepository extends JpaRepository<LocacaoEntity, UUID> {
}

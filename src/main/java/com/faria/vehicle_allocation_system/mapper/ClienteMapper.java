package com.faria.vehicle_allocation_system.mapper;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    ClienteDTO toDTO(ClienteEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    ClienteEntity toEntity(ClienteDTO dto);
}

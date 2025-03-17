package com.faria.vehicle_allocation_system.mapper;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import com.faria.vehicle_allocation_system.util.Enum.TipoPessoa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(target = "tipoPessoa", source = "tipoPessoa", qualifiedByName = "tipoPessoaToString")
    ClienteDTO toDTO(ClienteEntity clienteEntity);

    @Mapping(target = "clienteId", ignore = true)
    @Mapping(target = "tipoPessoa", source = "tipoPessoa", qualifiedByName = "tipoPessoaFromString")
    ClienteEntity toEntity(ClienteDTO clienteDTO);

    @Named("tipoPessoaFromString")
    default TipoPessoa tipoPessoaFromString(String tipoPessoa) {
        return tipoPessoa != null ? TipoPessoa.valueOf(tipoPessoa.toUpperCase()) : null;
    }

    @Named("tipoPessoaToString")
    default String tipoPessoaToString(TipoPessoa tipoPessoa) {
        return tipoPessoa != null ? tipoPessoa.name() : null;
    }
}

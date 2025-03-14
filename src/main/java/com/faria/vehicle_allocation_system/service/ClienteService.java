package com.faria.vehicle_allocation_system.service;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import com.faria.vehicle_allocation_system.mapper.ClienteMapper;
import com.faria.vehicle_allocation_system.repository.ClienteRepository;
import com.faria.vehicle_allocation_system.util.ValidadorIdade;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;
    private final ValidadorIdade validadorIdade;

    public ClienteDTO buscarCliente(UUID clienteId) {
        return clienteRepository.findById(clienteId)
                .map(clienteMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + clienteId + " não encontrado."));
    }

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        validadorIdade.validarIdade(clienteDTO.getDataNascimento());

        ClienteEntity clienteEntity = clienteMapper.toEntity(clienteDTO);
        ClienteEntity savedEntity = clienteRepository.save(clienteEntity);

        return clienteMapper.toDTO(savedEntity);
    }

    public void deletarCliente(UUID clienteId) {
        ClienteEntity clienteExistente = clienteRepository.findById(clienteId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
        clienteRepository.delete(clienteExistente);
    }
}

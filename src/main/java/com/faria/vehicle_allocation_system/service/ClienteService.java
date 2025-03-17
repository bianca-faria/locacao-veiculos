package com.faria.vehicle_allocation_system.service;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import com.faria.vehicle_allocation_system.repository.ClienteRepository;
import com.faria.vehicle_allocation_system.util.ValidadorIdade;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ValidadorIdade validadorIdade;

    public ClienteDTO buscarCliente(Long id) {
        return clienteRepository.findById(id)
                .map(clienteMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + id + " não encontrado."));
    }

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        validadorIdade.validarIdade(clienteDTO.getDataNascimento());

        ClienteEntity clienteEntity = clienteMapper.toEntity(clienteDTO);
        ClienteEntity savedEntity = clienteRepository.save(clienteEntity);

        return clienteMapper.toDTO(savedEntity);
    }

    public void deletarCliente(Long id) {
        ClienteEntity clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
        clienteRepository.delete(clienteExistente);
    }
}

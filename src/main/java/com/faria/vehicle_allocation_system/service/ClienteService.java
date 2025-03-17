package com.faria.vehicle_allocation_system.service;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.entity.ClienteEntity;
import com.faria.vehicle_allocation_system.mapper.ClienteMapper;
import com.faria.vehicle_allocation_system.repository.ClienteRepository;
import com.faria.vehicle_allocation_system.util.ValidadorIdade;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ValidadorIdade validadorIdade;

    public ClienteService(ClienteRepository clienteRepository, ValidadorIdade validadorIdade) {
        this.clienteRepository = clienteRepository;
        this.validadorIdade = validadorIdade;
    }

    public ClienteDTO buscarCliente(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("O ID do cliente não pode ser nulo.");
        }

        ClienteEntity clienteEntity = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente com ID " + id + " não encontrado."));

        return ClienteMapper.INSTANCE.toDTO(clienteEntity); // MapStruct converte automaticamente
    }

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        validadorIdade.validarIdade(clienteDTO.getDataNascimento());

        ClienteEntity clienteEntity = ClienteMapper.INSTANCE.toEntity(clienteDTO);
        ClienteEntity savedEntity = clienteRepository.save(clienteEntity);

        return ClienteMapper.INSTANCE.toDTO(savedEntity);
    }

    public void deletarCliente(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("O ID do cliente não pode ser nulo.");
        }

        ClienteEntity clienteExistente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID: " + id));

        clienteRepository.delete(clienteExistente);
    }
}

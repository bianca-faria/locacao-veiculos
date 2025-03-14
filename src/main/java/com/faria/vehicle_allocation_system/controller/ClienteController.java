package com.faria.vehicle_allocation_system.controller;

import com.faria.vehicle_allocation_system.dto.ClienteDTO;
import com.faria.vehicle_allocation_system.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    private ClienteDTO clienteDTO;

    @Operation(summary = "Criar  cadastro do cliente")
    @PostMapping
    public ResponseEntity<ClienteDTO> cadastrarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        ClienteDTO clienteCadastrado = clienteService.cadastrarCliente(clienteDTO);
        return ResponseEntity.ok(clienteCadastrado);
    }

    @Operation(summary = "Exibir cliente cadastrado")
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscarCliente(@PathVariable UUID id) {
        return ResponseEntity.ok(clienteService.buscarCliente(id));
    }

    @Operation(summary = "Deletar cliente cadastrado")
    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteDTO> deletarCliente(@PathVariable UUID id){
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}

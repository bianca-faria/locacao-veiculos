package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class EnderecoDTO {

    private UUID id;

    @NotBlank(message = "Logradouro não pode ser vazio")
    private String logradouro;

    @NotBlank(message = "Número não pode ser vazio")
    private String numero;

    @NotBlank(message = "Cidade não pode ser vazia")
    private String cidade;

    @NotBlank(message = "Estado não pode ser vazio")
    private String estado;

    @NotBlank(message = "CEP não pode ser vazio")
    private String cep;
}

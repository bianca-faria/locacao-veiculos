package com.faria.vehicle_allocation_system.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
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

package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class VeiculoDTO {

    private UUID veiculoId;

    @NotBlank(message = "O modelo do veículo não pode estar vazio")
    private String modelo;

    @NotBlank(message = "A placa do veículo não pode estar vazia")
    private String placa;

    @NotBlank(message = "A marca do veículo não pode estar vazia")
    private String marca;
}

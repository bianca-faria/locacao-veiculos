package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroDTO {

    @Min(value = 1, message = "O carro deve ter pelo menos 1 passageiro")
    private int capacidadePassageiro;

    @NotNull(message = "Informação sobre ar-condicionado é obrigatória")
    private Boolean arCondicionado;
}

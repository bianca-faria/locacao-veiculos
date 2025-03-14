package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaminhaoDTO {

    @Min(value = 1, message = "A capacidade de carga deve ser pelo menos 1 tonelada")
    private int capacidadeCarga;

    @Min(value = 1, message = "O caminhão deve ter pelo menos 1 eixo")
    private int eixo;
}

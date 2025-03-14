package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MotoDTO {

    @Min(value = 50, message = "A moto deve ter pelo menos 50 cilindradas")
    private int cilindradas;

    @NotNull(message = "Informação sobre baú é obrigatória")
    private Boolean temBau;
}

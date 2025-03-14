package com.faria.vehicle_allocation_system.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

@Getter
@Setter
public class LocacaoDTO {

    private long diasAlugados;
    private BigDecimal valorTotal;

    @NotNull(message = "O ID do cliente é obrigatório")
    private UUID clienteId;

    @NotNull(message = "O ID do veículo é obrigatório")
    private UUID veiculoId;

    @NotNull(message = "A data de início é obrigatória")
    private LocalDate dataInicio;

    @NotNull(message = "A data de fim é obrigatória")
    @FutureOrPresent(message = "A data de fim deve ser hoje ou no futuro")
    private LocalDate dataFim;

    public void calcularDiaria(BigDecimal valorDiaria) {
        diasAlugados = ChronoUnit.DAYS.between(dataInicio, dataFim);
        valorTotal = valorDiaria.multiply(BigDecimal.valueOf(diasAlugados));
    }
}

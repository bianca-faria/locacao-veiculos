package com.faria.vehicle_allocation_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_carro")
public class CarroEntity extends VeiculoEntity {

    @Column(name = "capacidade_passageiro")
    private int capacidadePassageiro;

    @Column(name = "ar_condicionado")
    private Boolean arCondicionado;

    private static final BigDecimal TAXA_ADICIONAL_ARCONDICIONADO = BigDecimal.valueOf(50);

    @Override
    public void calcularValorTotal(int dias) {

//        BigDecimal taxaArCondicionado = Boolean.TRUE.equals(arCondicionado) ? TAXA_ADICIONAL_ARCONDICIONADO : BigDecimal.ZERO;
//        valorTaxaAdicional(taxaArCondicionado);
//
//        BigDecimal valorBase = getValorDiaria().add(taxaArCondicionado);
    }
}

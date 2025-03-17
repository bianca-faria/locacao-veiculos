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
@Table(name = "tb_moto")
public class MotoEntity extends VeiculoEntity {

    @Column(name = "cilindradas")
    private int cilindradas;

    @Column(name = "tem_bau")
    private boolean temBau;

    private static final BigDecimal TAXA_ADICIONAL_CILINDRADA = BigDecimal.valueOf(0.10);

    @Override
    public BigDecimal calcularValorTotal(int dias) {

        BigDecimal taxaCilindradas = BigDecimal.valueOf(cilindradas).multiply(TAXA_ADICIONAL_CILINDRADA);
        setValorTaxaAdicional(taxaCilindradas);

        BigDecimal valorBase = getValorDiaria().add(taxaCilindradas);
        return valorBase.multiply(BigDecimal.valueOf(dias));
    }
}

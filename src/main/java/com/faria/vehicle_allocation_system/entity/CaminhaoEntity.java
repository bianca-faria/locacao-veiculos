package com.faria.vehicle_allocation_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name = "tb_caminhao")
public class CaminhaoEntity extends VeiculoEntity {

    @Column(name = "capacidade_carga", nullable = false)
    private int capacidadeCarga;

    @Column(name = "num_eixos", nullable = false)
    private int eixo;

    private static final BigDecimal TAXA_POR_EIXO = BigDecimal.valueOf(20);

    @Override
    public BigDecimal calcularValorTotal(int dias) {

        BigDecimal taxaEixo = TAXA_POR_EIXO.multiply(BigDecimal.valueOf(eixo));
        setValorTaxaAdicional(taxaEixo);

        BigDecimal valorBase = getValorDiaria().add(taxaEixo);
        return valorBase.multiply(BigDecimal.valueOf(dias));
    }
}

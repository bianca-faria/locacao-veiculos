package com.faria.vehicle_allocation_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_veiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false, unique = true)
    private String placa;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private BigDecimal valorDiaria;

    @Column(nullable = false)
    private BigDecimal valorTaxaAdicional;

    public abstract BigDecimal calcularValorTotal(int dias);
}

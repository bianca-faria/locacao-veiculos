package com.faria.vehicle_allocation_system.entity;

import com.faria.vehicle_allocation_system.util.Enum.TipoPessoa;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private String documento;

    @Enumerated(EnumType.STRING)
    private TipoPessoa tipoPessoa;

    @Column(name = "data_criacao", updatable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();
}

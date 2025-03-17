package com.faria.vehicle_allocation_system.dto;

import com.faria.vehicle_allocation_system.entity.Endereco;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClienteDTO {

    private UUID clienteId;

    @NotBlank(message = "Nome não pode estar vazio")
    private String nome;

    @NotNull(message = "Data de nascimento é obrigatória")
    private LocalDate dataNascimento;

    @NotBlank(message = "Documento não pode ser vazio")
    @Pattern(regexp = "\\d{11}|\\d{14}", message = "Documento deve ter 11 (CPF) ou 14 (CNPJ) dígitos")
    private String documento;

    @NotBlank(message = "Tipo de pessoa não pode ser vazio")
    private String tipoPessoa;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataCriacao;

    @NotNull(message = "Endereço não pode ser vazio")
    private Endereco endereco;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}

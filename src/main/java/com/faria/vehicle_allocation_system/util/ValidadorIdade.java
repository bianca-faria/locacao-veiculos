package com.faria.vehicle_allocation_system.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class ValidadorIdade {

    public void validarIdade(LocalDate dataNascimento) {
        if (dataNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula.");
        }

        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

        if (idade < 18) {
            throw new IllegalArgumentException("Cliente deve ter pelo menos 18 anos!");
        }
    }
}

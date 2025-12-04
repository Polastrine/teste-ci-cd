package com.example.meu_app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com um valor x e um valor y diferentes de zero, deve retornar a divisão de x por y")
    public void testDividir() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double resultadoEsperado = 5;

        double resultado = calculadoraService.dividir(a, b);

        assertEquals(resultadoEsperado, resultado);
    }

}
package com.example.meu_app.service;

public class CalculadoraService {

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }

        return a / b;

    }

}

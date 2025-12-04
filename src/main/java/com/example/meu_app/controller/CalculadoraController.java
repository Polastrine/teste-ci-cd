package com.example.meu_app.controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.example.meu_app.service.CalculadoraService;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PathVariable;

public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/dividir/{a}/{b}")
    public ResponseEntity<Double> dividir(@PathVariable double a, @PathVariable double b) {
        try {
            return ResponseEntity.ok(calculadoraService.dividir(a, b));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}

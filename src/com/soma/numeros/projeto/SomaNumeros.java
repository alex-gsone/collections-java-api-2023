/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soma.numeros.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class SomaNumeros {

    List<NumerosInteiros> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosInteiros.add(new NumerosInteiros(numero));
    }

    public int calcularSoma() {
        int total = 0;
        if (!numerosInteiros.isEmpty()) {
            for (NumerosInteiros numero : numerosInteiros) {
                total += numero.getNumero();
            }
        }
        return total;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!numerosInteiros.isEmpty()) {
            for (NumerosInteiros numero : numerosInteiros) {
                if (numero.getNumero() >= maiorNumero) {
                    maiorNumero = numero.getNumero();
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 1;
        if (!numerosInteiros.isEmpty()) {
            for (NumerosInteiros numero : numerosInteiros) {
                if (numero.getNumero() <= menorNumero) {
                    menorNumero = numero.getNumero();
                }
            }
        }
        return menorNumero;
    }

    public List<NumerosInteiros> exibirNumeros() {
        return numerosInteiros;
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(0);
        soma.adicionarNumero(1);
        soma.adicionarNumero(2);
        soma.adicionarNumero(1100);
        soma.adicionarNumero(20000);
        
        System.out.println("O maior número da lista é: " + soma.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " + soma.encontrarMenorNumero());
        
        System.out.println("A soma de todos os números é: " + soma.calcularSoma());
        System.out.println("Lista de todos os números: " + soma.exibirNumeros());
    }
}

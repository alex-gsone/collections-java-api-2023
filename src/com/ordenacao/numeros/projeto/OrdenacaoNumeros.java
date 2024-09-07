/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordenacao.numeros.projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Autor: Alex G. Silva.
 *
 * Objetivo: Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de
 * números inteiros como atributo. Implemente os seguintes métodos:
 *
 * adicionarNumero(int numero): Adiciona um número à lista.
 *
 * ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a
 * interface Comparable e a class Collections.
 *
 * ordenarDescendente(): Ordena os números da lista em ordem descendente usando
 * um Comparable e a class Collections.
 *
 * Escrito em: 06/09/2024
 */
public class OrdenacaoNumeros {

    List<InteirosNumero> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(new InteirosNumero(numero));
    }

    public List<InteirosNumero> ordenarAscendente() {
        List<InteirosNumero> numerosAscendentes = new ArrayList<>(numeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<InteirosNumero> ordenarDescendente() {
        List<InteirosNumero> numerosDescendentes = new ArrayList<>(numeros);
        Collections.sort(numerosDescendentes);
        Collections.reverse(numerosDescendentes);
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(0);
        numeros.adicionarNumero(1200);
        numeros.adicionarNumero(50);
        numeros.adicionarNumero(78);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());

    }
}

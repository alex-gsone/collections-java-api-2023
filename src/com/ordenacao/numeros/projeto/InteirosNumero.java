/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordenacao.numeros.projeto;

import java.util.Comparator;

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
public class InteirosNumero implements Comparable<InteirosNumero> {

    int numero;

    public InteirosNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "InteirosNumero{" + "numero=" + numero + '}';
    }

    @Override
    public int compareTo(InteirosNumero t) {
        return Integer.compare(numero, t.getNumero());
    }

}

class OrdenarNumerosComparable implements Comparator<InteirosNumero> {

    @Override
    public int compare(InteirosNumero a1, InteirosNumero a2) {
        return Double.compare(a1.getNumero(), a2.getNumero());
    }
}

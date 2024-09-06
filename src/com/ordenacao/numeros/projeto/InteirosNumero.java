/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordenacao.numeros.projeto;

/**
 *
 * @author alex
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

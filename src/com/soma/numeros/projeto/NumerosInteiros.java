/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soma.numeros.projeto;

/**
 *
 * @author alex
 */
public class NumerosInteiros {

    private int numero;

    public NumerosInteiros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumerosInteiros{" + "numero=" + numero + '}';
    }

}

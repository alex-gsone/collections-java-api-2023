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
 *
 * @author alex
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

    public static void main(String[] args) {

    }
}

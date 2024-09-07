/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conjunto.palavras.unicas.set;

/**
 *
 * @author alex
 */
public class Palavras {
    String nome;

    public Palavras(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Palavras{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }
    
}

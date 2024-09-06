/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ordenacao.pessoas.projeto;

import java.util.Comparator;

/**
 *
 * @author alex
 */
public class Pessoa implements Comparable<Pessoa> {

    @Override
    public int compareTo(Pessoa t) {
        return Integer.compare(idade, t.getIdade());
    }

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }
}

    class ComparatorPorAltura implements Comparator<Pessoa> {

        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }
    }

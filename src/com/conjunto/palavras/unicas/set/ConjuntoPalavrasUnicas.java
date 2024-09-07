/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conjunto.palavras.unicas.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public class ConjuntoPalavrasUnicas {

    Set<Palavras> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavras palavrasParaRemover = null;
        for (Palavras p : palavrasUnicas) {
            if (p.getNome().equalsIgnoreCase(palavra)) {
                palavrasParaRemover = p;
                break;
            }
        }
        palavrasUnicas.remove(palavrasParaRemover);
    }

    public void verificarPalavra(String palavra) {
        String estaPresente = " não ";
        for (Palavras p : palavrasUnicas) {
            if (p.getNome().equalsIgnoreCase(palavra)) {
                estaPresente = " ";
            }
        }
        System.out.println("A palavra " + palavra + estaPresente + "está " + "presente!");
    }

    public Set<Palavras> exibirPalavrasUnicas() {
        return palavrasUnicas;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Elias");
        conjuntoPalavrasUnicas.adicionarPalavra("mesa");
        conjuntoPalavrasUnicas.adicionarPalavra("Tv");
        conjuntoPalavrasUnicas.adicionarPalavra("Smartphone");

        conjuntoPalavrasUnicas.removerPalavra("mesa");
        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());

        conjuntoPalavrasUnicas.verificarPalavra("TV");

    }
}

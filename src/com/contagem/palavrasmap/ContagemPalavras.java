/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contagem.palavrasmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alex
 */
public class ContagemPalavras {

    Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        Integer numeroPalavra;
        numeroPalavra = palavraMap.get(palavra);
        palavraMap.put(palavra, --numeroPalavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavraMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int chavePalavra = 0;
        for (String p : palavraMap.keySet()) {
            if (palavraMap.get(p) > chavePalavra) {
                palavraMaisFrequente = p;
                chavePalavra = palavraMap.get(p);
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("CASA", 5);
        contagemPalavras.adicionarPalavra("livro", 3);
        contagemPalavras.adicionarPalavra("bike", 2);
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("CASA");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}

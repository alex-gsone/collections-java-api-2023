/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicionario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alex
 */
public class Dicionario {

    Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraDefinicao = null;
        if (!dicionarioMap.isEmpty()) {
            palavraDefinicao = dicionarioMap.get(palavra);
        }
        return palavraDefinicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("casa", "construcão para abrigar pessoas");
        dicionario.adicionarPalavra("carro", "Qualquer veículo que se locomova sobre rodas; veículo, automóvel.");
        dicionario.adicionarPalavra("cachorro", "Cão novo");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("cachorro");
        dicionario.exibirPalavras();
        
        System.out.println(dicionario.pesquisarPorPalavra("casa"));
        System.out.println(dicionario.pesquisarPorPalavra("cachorro"));

    }
}

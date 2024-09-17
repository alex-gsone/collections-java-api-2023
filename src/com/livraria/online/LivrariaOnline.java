/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livraria.online;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alex
 */
public class LivrariaOnline {

    Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String chaveRemover = ;
        for (String l : livroMap.keySet()) {
            if (l.) {
//                System.out.println("kk");
//               livroMap.remove("www.amazon.com/5");
                
                System.out.println(livroMap.get(l));
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosExibirPorPreco = new TreeMap<>(livroMap);
        return livrosExibirPorPreco;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("www.amazon.com/5", "5 pontos do calvinismo", "Charles Spurgeon", 30.50);
        livrariaOnline.adicionarLivro("www.amazon.com/sousalvo", "Sou salvo?", "Augustos Nicodemos", 50.50);
        livrariaOnline.adicionarLivro("www.amazon.com/vocequerumamigo?", "Você quer um Amigo", " J.C. Ryle ", 1.99);

        livrariaOnline.removerLivro("5 pontos do calvinismo");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livraria.online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
//        String chaveRemover = null;
//        for (String l : livroMap.keySet()) {
//            if (livroMap.get(l).getTitulo().equalsIgnoreCase(titulo)) {
//                chaveRemover = l;
//            }
//        }
//        livroMap.remove(chaveRemover);
        String chaveRemover = null;
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chaveRemover = entry.getKey();
                break; // Saímos do loop assim que encontramos a chave
            }
        }
        if (chaveRemover != null) {
            livroMap.remove(chaveRemover);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        Map<String, Livro> livrosExibirPorPreco = new TreeMap<>(livroMap);
        return livrosExibirPorPreco;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroMap.values()) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        double maisCaro = 1;
        Livro livro = null;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() >= maisCaro) {
                maisCaro = l.getPreco();
                livro = l;
            }
        }
        return livro;
    }

    public Livro exibirLivroMaisBarato() {
        double maisBarato = 10000;
        Livro livro = null;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() <= maisBarato) {
                maisBarato = l.getPreco();
                livro = l;
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("www.amazon.com/5", "5 pontos do calvinismo", "Charles Spurgeon", 30.50);
        livrariaOnline.adicionarLivro("www.amazon.com/sousalvo", "Sou salvo?", "Augustos Nicodemos", 50.50);
        livrariaOnline.adicionarLivro("www.amazon.com/Cristianismodescomplicado", "Cristianismo descomplicado", "Augustos Nicodemos", 70.50);
        livrariaOnline.adicionarLivro("www.amazon.com/OpoderdeDeusparaasantificacao", "O poder de Deus para a santificação", "Augustos Nicodemos", 70.50);
        livrariaOnline.adicionarLivro("www.amazon.com/vocequerumamigo?", "Você quer um Amigo", " J.C. Ryle ", 1.99);

        livrariaOnline.removerLivro("5 pontos do calvinismo");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Augustos Nicodemos"));
        System.out.println("O livro mais caro é: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("O livro mais barato é: " + livrariaOnline.exibirLivroMaisBarato());

    }
}

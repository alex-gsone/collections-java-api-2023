/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catalogo.livros.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class CatalogoLivros {
    
    List<Livro> livros;
    
    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutores = new ArrayList<>();
        
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutores.add(livro);
                }
            }
        }
        return livrosAutores;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }      
        return livroPorTitulo;
    }
    
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Java", "godofredo", 1999);
        catalogo.adicionarLivro("Português para concursos", "godofredo", 1999);
        catalogo.adicionarLivro("Java2", "godoneno", 2007);
        catalogo.adicionarLivro("Java2", "alfred", 2007);
        
        System.out.println(catalogo.pesquisarPorAutor("godofredo"));
        
        System.out.println(catalogo.pesquisarPorIntervaloAnos(1999, 2007));
        System.out.println(catalogo.pesquisarPorTitulo("Java2"));
        
    }
}

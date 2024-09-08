/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadastro.produtos.ordenacao.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public class CadastroProdutos {

    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        
    }
    
}

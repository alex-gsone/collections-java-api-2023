/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrinho.compras.projeto;

/**
 *
 * @author alex
 */
public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Item{" + "nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
   
    
    
    
}

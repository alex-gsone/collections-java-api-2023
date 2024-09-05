/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrinho.compras.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class CarrinhoDeCompras {
    
    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }
    
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            } 
        }
        itens.removeAll(itensParaRemover);
    }
    
    public void calcularValorTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco()*item.getQuantidade();
        }
        System.out.println("O preço total é: "+total);
    }
    
    public String exibirItens() {
        return itens.toString();
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        System.out.println(carrinho.exibirItens());
        carrinho.adicionarItem("desodorante", 6.7, 1);
        carrinho.adicionarItem("calça", 100.0, 4);
        System.out.println(carrinho.exibirItens());
        
//        carrinho.removerItem("Desodorante");
//        carrinho.removerItem("Calça");
        System.out.println(carrinho.exibirItens());
        carrinho.calcularValorTotal();
    }
}

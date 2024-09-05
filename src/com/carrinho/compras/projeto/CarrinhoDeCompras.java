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

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
            itens.removeAll(itensParaRemover);
        }
    }
    
    

    public static void main(String[] args) {

    }
}

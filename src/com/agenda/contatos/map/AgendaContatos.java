/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.contatos.map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alex
 */
public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
//      Obs: o método put serve não só para adicionar, mas também para atualizar
//      o key é o nome e o value é o telefone
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Alex", 123456);
        agendaContatos.adicionarContato("Alex", 5665);
        agendaContatos.adicionarContato("Alex Silva", 111111);
        agendaContatos.adicionarContato("Alex Dio", 654987);
        agendaContatos.adicionarContato("charles usineiro", 1111111);
        agendaContatos.adicionarContato("Alex", 44444);
        agendaContatos.exibirContatos();
//        
        agendaContatos.removerContato("charles usineiro");
//        
        agendaContatos.exibirContatos();
//        
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Alex Dio"));
    }
}

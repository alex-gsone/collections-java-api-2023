/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.contatos.set.pesquisa;

import com.ordenacao.pessoas.projeto.Pessoa;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public class AgendaContatos {

    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("cantato1", 123456);
        agendaContatos.adicionarContato("contato1", 0);
        agendaContatos.adicionarContato("Godofredo silva", 111111);
        agendaContatos.adicionarContato("Godofredo Dio", 654987);
        agendaContatos.adicionarContato("Jack silva", 111111);
        
        agendaContatos.exibirContatos();
        
        System.out.println(agendaContatos.pesquisarPorNome("Godofredo"));
        
        System.out.println("Contato atualizado: "+agendaContatos.atualizarNumeroContato("Jack Silva", 55555));
        
        agendaContatos.exibirContatos();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lista.tarefa2.set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public class ListaTarefas {

    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, true));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
            tarefaConcluida = t;
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
            tarefaPendente = t;
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Lavar os pratos");
        listaTarefas.adicionarTarefa("Lavar os pratos");
        
        listaTarefas.exibirTarefas();
        System.out.println("Não há tarefas repetidas!\n");
//        listaTarefas.marcarTarefaPendente("Lavar o carro");
//        listaTarefas.exibirTarefas();

//        listaTarefas.marcarTarefaConcluida("Lavar o carro");
//        listaTarefas.exibirTarefas();
//        System.out.println(listaTarefas.obterTarefasConcluidas());
//        System.out.println(listaTarefas.obterTarefasPendentes());

//        listaTarefas.contarTarefas();
        listaTarefas.removerTarefa("Lavar os pratos");
        listaTarefas.exibirTarefas();

//        listaTarefas.limparListaTarefas();
//        listaTarefas.exibirTarefas();

    }
}

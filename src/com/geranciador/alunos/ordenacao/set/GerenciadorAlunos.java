/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geranciador.alunos.ordenacao.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alex
 */
public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    Set<Aluno> exibirAlunosPorNome() {
        /* Principais características do TreeSet:
        Ordenação natural: Os elementos são ordenados de acordo com a 
        ordem natural (definida pela interface Comparable) ou por um 
        comparador customizado (implementação de Comparator).       
         */
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparePorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunoSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Alex", 1111111L, 7.0);
        gerenciadorAlunos.adicionarAluno("Manuel", 1111111L, 7.0);
        gerenciadorAlunos.adicionarAluno("Godofredo", 1222222L, 8.0);
        gerenciadorAlunos.adicionarAluno("Kiko", 1444444L, 1.0);
        gerenciadorAlunos.adicionarAluno("Seu Madruga", 0003333L, 9.0);

        System.out.println(gerenciadorAlunos.exibirAlunos());
        gerenciadorAlunos.removerAluno(1111111);
        System.out.println(gerenciadorAlunos.exibirAlunos());
        
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        
    }
}

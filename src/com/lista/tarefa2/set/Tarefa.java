/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lista.tarefa2.set;

import java.util.Objects;

/**
 *
 * @author alex
 */
public class Tarefa {
    private String descricao;
    private boolean concluida; 

    public Tarefa(String descricao, boolean conclusao) {
        this.descricao = descricao;
        this.concluida = conclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", conclusao=" + concluida + '}';
    }
    
}

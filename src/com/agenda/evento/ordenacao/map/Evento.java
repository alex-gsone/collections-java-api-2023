/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.evento.ordenacao.map;

/**
 *
 * @author alex
 */
public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" + "nomeEvento=" + nomeEvento + ", nomeAtracao=" + nomeAtracao + '}';
    }
    
}

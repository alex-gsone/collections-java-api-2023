/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conjunto.convidados.set;

/**
 *
 * @author alex
 */
public class Convidado {

    private String nome;
    private int codigoConvite;

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.codigoConvite;
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
        final Convidado other = (Convidado) obj;
        if (this.codigoConvite != other.codigoConvite) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Convidado{" + "nome=" + nome + ", codigoConvite=" + codigoConvite + '}';
    }

}

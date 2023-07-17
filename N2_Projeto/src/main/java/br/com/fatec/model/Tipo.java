/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.model;

/**
 *
 * @author Aluno
 */
public class Tipo {
    private int tipoId;
    private String nomeTipo;

    public Tipo() {
    }

    public Tipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.tipoId;
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
        final Tipo other = (Tipo) obj;
        if (this.tipoId != other.tipoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomeTipo();
    }
    
    
}

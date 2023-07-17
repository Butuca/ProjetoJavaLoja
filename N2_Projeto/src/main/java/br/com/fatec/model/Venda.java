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
public class Venda {
    private int vendaId;
    private String horaVenda, nomeComprador, cpf;
    private float totalVenda;

    public Venda() {
    }

    public Venda(String horaVenda, String nomeComprador, String cpf, float totalVenda) {
        this.horaVenda = horaVenda;
        this.nomeComprador = nomeComprador;
        this.cpf = cpf;
        this.totalVenda = totalVenda;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.vendaId;
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
        final Venda other = (Venda) obj;
        if (this.vendaId != other.vendaId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomeComprador();
    }
    
    
}

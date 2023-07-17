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
public class Fornecedor {
    private int fornecedorId;
    private String nomeFornecedor, cnpj, razaoSocial, email, inscEstadual;

    public Fornecedor() {
    }

    public Fornecedor(String nomeFornecedor, String cnpj, String razaoSocial, String email, String inscEstadual) {
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.inscEstadual = inscEstadual;
    }

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.fornecedorId;
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.fornecedorId != other.fornecedorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomeFornecedor();
    }

    
}

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
public class Produto {
    private int produtoId;
    private Tipo tipo;
    private Fornecedor fornecedor;
    private String nomeProduto,  descricaoProduto;
    private String tamanho;
    private float preco;

    public Produto() {
    }

    public Produto(Fornecedor fornecedor, String nomeProduto, String descricaoProduto, String tamanho, float preco) {
        this.fornecedor = fornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.produtoId;
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
        final Produto other = (Produto) obj;
        if (this.produtoId != other.produtoId) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return getNomeProduto();
    }
            
    
    
}

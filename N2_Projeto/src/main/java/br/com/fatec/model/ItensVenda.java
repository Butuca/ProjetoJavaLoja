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
public class ItensVenda {
    private int itemVendaId, quantidade;
    private Venda venda;
    private Produto produto;
    private float precoUnit;

    public ItensVenda() {
    }

    public ItensVenda(int quantidade, Venda venda, Produto produto, float precoUnit) {
        this.quantidade = quantidade;
        this.venda = venda;
        this.produto = produto;
        this.precoUnit = precoUnit;
    }

    public int getItemVendaId() {
        return itemVendaId;
    }

    public void setItemVendaId(int itemVendaId) {
        this.itemVendaId = itemVendaId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.itemVendaId;
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
        final ItensVenda other = (ItensVenda) obj;
        if (this.itemVendaId != other.itemVendaId) {
            return false;
        }
        return true;
    }

    
}
    
    


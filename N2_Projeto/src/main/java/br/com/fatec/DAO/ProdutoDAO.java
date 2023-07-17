/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.model.Fornecedor;
import br.com.fatec.model.Produto;
import br.com.fatec.model.Tipo;
import br.com.fatec.persistencia.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Aluno
 */
public class ProdutoDAO implements DAO <Produto> {
    
    private Fornecedor fornecedor;
    private Produto produto;
    private Tipo tipo;
    
    //para conter os comandos DML
    private PreparedStatement pst; //pacote java.sql
    //para conter os dados vindos do BD
    private ResultSet rs; //pacote java.sql
    
    @Override
    public boolean insere(Produto dado) throws SQLException {
        boolean inseriu;
        
        //conectar com o banco
        Banco.conectar();
        
        //cria o comando SQL
        //as ? representam os dados para serem gravados
        String sql = "INSERT INTO Produto (produtoId, fornecedorId,tipo "
                   + "nome, descricao, preco, tamanho) values (?, ?, ?, ?,?,?,?)";
        
        //cria o preparedStatement
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //colocar os dados no PST
        pst.setInt(1, dado.getProdutoId()); //1º interrogação
        pst.setInt(2, dado.getFornecedor().getFornecedorId()); //2º interrogacao
        pst.setString(3, dado.getTipo().getNomeTipo()); //3º interrogacao
        pst.setString(4, dado.getNomeProduto());
        pst.setString(5, dado.getDescricaoProduto());
        pst.setFloat(6, dado.getPreco());
        pst.setString(7, dado.getTamanho());
        
        //executar o comando
        if(pst.executeUpdate() > 0)
            inseriu = true; //tudo certo com a inserção
        else
            inseriu = false; //ocorreu um erro na inserção
        
        //fecha a conexao
        Banco.desconectar();
        
        return inseriu;
    }

    @Override
    public boolean remove(Produto dado) throws SQLException {
          boolean removeu;
        
        //conectar com o banco
        Banco.conectar();
        
        //cria o comando SQL
        //as ? representam os dados para serem removidos
        String sql = "DELETE FROM Produto WHERE produtoId = ?";
        
        //cria o preparedStatement
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //colocar os dados no PST
        pst.setInt(1, dado.getProdutoId()); //1º interrogação
        
        //executar o comando
        if(pst.executeUpdate() > 0)
            removeu = true; //tudo certo com a inserção
        else
            removeu = false; //ocorreu um erro na inserção
        
        //fecha a conexao
        Banco.desconectar();
        
        return removeu;
    }

    @Override
    public boolean altera(Produto dado) throws SQLException {
        boolean alterou;
        
        //conectar com o banco
        Banco.conectar();
        
        //cria o comando SQL
        //as ? representam os dados para serem alterados
        String sql = "UPDATE Produto SET fornecedorId,tipo = ? "
                   + "nome = ?, descricao = ?, preco = ? , tamanho = ? WHERE produtoId = ?";
        
        //cria o preparedStatement
        pst = Banco.obterConexao().prepareStatement(sql);
        
        //colocar os dados no PST
        pst.setInt(1, dado.getProdutoId()); //1º interrogação
        pst.setInt(2, dado.getFornecedor().getFornecedorId()); //2º interrogacao
        pst.setString(3, dado.getTipo().getNomeTipo()); //3º interrogacao
        pst.setString(4, dado.getNomeProduto());
        pst.setString(5, dado.getDescricaoProduto());
        pst.setFloat(6, dado.getPreco());
        
        
        //executar o comando
        if(pst.executeUpdate() > 0)
            alterou = true; //tudo certo com a inserção
        else
            alterou = false; //ocorreu um erro na inserção
        
        //fecha a conexao
        Banco.desconectar();
        
        return alterou;
    }

    @Override
    public Produto buscaID(Produto model) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Produto> lista(String criterio) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

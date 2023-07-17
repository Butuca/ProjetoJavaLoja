/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class ProdutoViewController implements Initializable {

    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtPreco;
    @FXML
    private TextField txtTamanho;
    @FXML
    private TextField txtNomeProd;
    @FXML
    private TextField txtCodigoProd;
    @FXML
    private ComboBox<?> cbTipoProd;
    @FXML
    private ComboBox<?> cbFornecedorProd;
    @FXML
    private Button btnCadastrarProd;
    @FXML
    private Button btnEditarProd;
    @FXML
    private Button btnExcluirProd;
    @FXML
    private Button btnConsultaProd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

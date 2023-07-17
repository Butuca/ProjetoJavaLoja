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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class VendaBuscaViewController implements Initializable {

    @FXML
    private TableView<?> tvVendaConsulta;
    @FXML
    private TableColumn<?, ?> tbIDVenda;
    @FXML
    private TableColumn<?, ?> tbNomeProduto;
    @FXML
    private TableColumn<?, ?> tbFornecedor;
    @FXML
    private TableColumn<?, ?> tbPreçoProd;
    @FXML
    private TableColumn<?, ?> tbQtdProd;
    @FXML
    private TableColumn<?, ?> tbCpfCliente;
    @FXML
    private TableColumn<?, ?> tbNomeCliente;
    @FXML
    private Button btnVoltar;
    @FXML
    private Label txtCodForn;
    @FXML
    private TextField txtCodVenda;
    @FXML
    private Button btnPesqVenda;
    @FXML
    private Button btnSalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

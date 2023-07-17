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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class VendaViewController implements Initializable {

    @FXML
    private TextField txtCodProdVenda;
    @FXML
    private TextField txtNomeProdVenda;
    @FXML
    private TextField txtNomeFornecedorVenda;
    @FXML
    private TextField txtPrecoProdVenda;
    @FXML
    private TextField txtCodigoVenda;
    @FXML
    private Button btnCadastrarVenda;
    @FXML
    private Button btnEditarVenda;
    @FXML
    private Button btnExcluirVenda;
    @FXML
    private Button btnConsultaVenda;
    @FXML
    private TextField txtNomeCompradorVenda;
    @FXML
    private TextField txtCpfCompradorVenda;
    @FXML
    private TextField txtQtdProdVenda;
    @FXML
    private Button txtAdcProdVenda;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

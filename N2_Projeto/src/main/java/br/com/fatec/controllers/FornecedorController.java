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
public class FornecedorController implements Initializable {

    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtNomeFornecedor;
    @FXML
    private TextField txtRazaoSocial;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCodigoFornecedor;
    @FXML
    private Button btnCadastrarForn;
    @FXML
    private Button btnEditarForn;
    @FXML
    private Button btnExcluirForn;
    @FXML
    private Button btnConsultarForn;
    @FXML
    private TextField txtInsEstadual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

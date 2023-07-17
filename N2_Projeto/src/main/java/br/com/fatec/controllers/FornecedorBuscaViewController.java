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
public class FornecedorBuscaViewController implements Initializable {

    @FXML
    private TableView<?> tvFornConsulta;
    @FXML
    private TableColumn<?, ?> tbIDForn;
    @FXML
    private TableColumn<?, ?> tbNomeForn;
    @FXML
    private TableColumn<?, ?> tbRazaoSocForn;
    @FXML
    private TableColumn<?, ?> tbCNPJ;
    @FXML
    private TableColumn<?, ?> tbEmailForn;
    @FXML
    private TableColumn<?, ?> tbInscriçãoEstadualForn;
    @FXML
    private Button btnVoltar;
    @FXML
    private Label txtCodForn;
    @FXML
    private TextField txtCodProduto;
    @FXML
    private Button btnPesqForn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lucas
 */
public class ProdutoBuscaViewController implements Initializable {

    @FXML
    private TableView<?> tvProdConsulta;
    @FXML
    private TableColumn<?, ?> tbIDProd;
    @FXML
    private TableColumn<?, ?> tbNomeProd;
    @FXML
    private TableColumn<?, ?> tbDescProd;
    @FXML
    private TableColumn<?, ?> tbPrecoProd;
    @FXML
    private TableColumn<?, ?> tbTamanhoProd;
    @FXML
    private TableColumn<?, ?> tbFornecedorProd;
    @FXML
    private TableColumn<?, ?> tbTipoProd;
    @FXML
    private Button btnVoltar;
    @FXML
    private TextField txtCodProduto;
    @FXML
    private Button btnPesqProduto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

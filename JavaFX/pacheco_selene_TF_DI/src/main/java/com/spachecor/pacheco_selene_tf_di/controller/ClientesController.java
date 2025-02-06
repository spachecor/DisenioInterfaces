package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import com.spachecor.pacheco_selene_tf_di.model.entity.Cliente;
import com.spachecor.pacheco_selene_tf_di.model.service.repository.GenericRepositoryService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class ClientesController {
    @FXML
    private TableView<Cliente> clienteTableView;
    @FXML
    private TableColumn<Cliente, Integer> idTableColumn;
    @FXML
    private TableColumn<Cliente, String> nombreTableColumn;
    @FXML
    private TableColumn<Cliente, String> telefonoTablaColumn;
    @FXML
    private TableColumn<Cliente, String> direccionTablaColumn;
    private GenericRepositoryService<Cliente> clienteService;
    private ObservableList<Cliente> clientesObservableList;

    @FXML
    protected void initialize() {
        this.clienteService = new GenericRepositoryService<>(Cliente.class);
        //inicializamos las columnas
        this.idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nombreTableColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.telefonoTablaColumn.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        this.direccionTablaColumn.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        this.cargarListaTable();
    }


    @FXML
    private void onClickSalirButton(){
        FXService.cambiarVentana(FXService.MAIN_VIEW);
    }

    private void cargarListaTable() {
        List<Cliente> clientes = this.clienteService.listar();
        this.clientesObservableList = FXCollections.observableArrayList();
        this.clientesObservableList.addAll(clientes);
        this.clienteTableView.setItems(this.clientesObservableList);
    }
}

package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import com.spachecor.pacheco_selene_tf_di.model.entity.Cliente;
import com.spachecor.pacheco_selene_tf_di.model.service.repository.GenericRepositoryService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
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
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField telefonoTextField;
    @FXML
    private TextField direccionTextField;

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
    @FXML
    private void onAniadirClick(){
        this.errorLabel.setText("");
        String nombre = nombreTextField.getText();
        String telefono = telefonoTextField.getText();
        String direccion = direccionTextField.getText();
        if(!nombre.isEmpty() || !telefono.isEmpty() || !direccion.isEmpty()){
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setDireccion(direccion);
            if(!this.clientesObservableList.contains(cliente)){
                this.clientesObservableList.add(cliente);
                this.clienteService.guardar(cliente);
                this.clienteTableView.setItems(clientesObservableList);
                this.limpiarCampos();
            }else this.errorLabel.setText("El cliente ya existe(Su teléfono ya está registrado)");
        }else this.errorLabel.setText("Por favor ingrese todos los campos");
    }
    @FXML
    private void onModificarClick(){
        this.errorLabel.setText("");
        Cliente cliente = this.clienteTableView.getSelectionModel().getSelectedItem();
        if(cliente != null&&cliente.getId()!=null
                &&cliente.getNombre()!=null&&cliente.getTelefono()!=null&&cliente.getDireccion()!=null
                &&!cliente.getNombre().isEmpty()&&!cliente.getTelefono().isEmpty()&&!cliente.getDireccion().isEmpty()
        ){
            if(!this.nombreTextField.getText().isEmpty()&&!this.telefonoTextField.getText().isEmpty()
                    &&!this.direccionTextField.getText().isEmpty()
            ){
                Cliente clienteAux = new Cliente();
                clienteAux.setNombre(this.nombreTextField.getText());
                clienteAux.setTelefono(this.telefonoTextField.getText());
                clienteAux.setDireccion(this.direccionTextField.getText());
                //modificamos en bbdd
                this.clienteService.guardar(clienteAux);
                //modificamos el cliente de la tabla
                cliente.setNombre(clienteAux.getNombre());
                cliente.setTelefono(clienteAux.getTelefono());
                cliente.setDireccion(clienteAux.getDireccion());
                //refrescamos la tabla
                this.clienteTableView.refresh();
                this.limpiarCampos();
                this.clienteTableView.getSelectionModel().clearSelection();
            }else this.errorLabel.setText("No puede haber campos vacíos.");
        }else this.errorLabel.setText("Fallo terrible al seleccionar el cliente.");
    }
    @FXML
    private void onEliminarClick(){
        this.errorLabel.setText("");
        Cliente cliente = this.clienteTableView.getSelectionModel().getSelectedItem();
        if(cliente != null&&cliente.getId()!=null
                &&cliente.getNombre()!=null&&cliente.getTelefono()!=null&&cliente.getDireccion()!=null
                &&!cliente.getNombre().isEmpty()&&!cliente.getTelefono().isEmpty()&&!cliente.getDireccion().isEmpty()
        ){
            this.clienteService.eliminar(cliente);
            this.clientesObservableList.remove(cliente);
            this.clienteTableView.refresh();
            this.limpiarCampos();
            this.clienteTableView.getSelectionModel().clearSelection();
        }else this.errorLabel.setText("Debe seleccionar el cliente.");
    }
    @FXML
    private void onBuscarClick(){
        this.errorLabel.setText("");
        List<Cliente> clientes = clienteService.listar();
        if(clientes != null && !clientes.isEmpty()){
            List<Cliente> clientesEncontrados = new ArrayList<>();
            //1º campos ingresados vacíos
            if(
                    this.nombreTextField.getText().isEmpty()
                    &&this.telefonoTextField.getText().isEmpty()
                    &&this.direccionTextField.getText().isEmpty()){
                this.errorLabel.setText("Debes introducir un valor para buscar.");
            }else if(//buscar por nombre
                    !this.nombreTextField.getText().isEmpty()
                    &&this.telefonoTextField.getText().isEmpty()
                    &&this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(cliente.getNombre().equals(this.nombreTextField.getText()))clientesEncontrados.add(cliente);
                }
            }else if(//buscar por nombre y telefono
                    !this.nombreTextField.getText().isEmpty()
                    &&!this.telefonoTextField.getText().isEmpty()
                    &&this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(
                            cliente.getNombre().equals(this.nombreTextField.getText())
                            &&cliente.getTelefono().equals(this.telefonoTextField.getText())
                    )clientesEncontrados.add(cliente);
                }
            }else if(//buscar por nombre, telefono y direccion
                    !this.nombreTextField.getText().isEmpty()
                    &&!this.telefonoTextField.getText().isEmpty()
                    &&!this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(
                            cliente.getNombre().equals(this.nombreTextField.getText())
                            &&cliente.getTelefono().equals(this.telefonoTextField.getText())
                            &&cliente.getDireccion().equals(this.direccionTextField.getText())
                    )clientesEncontrados.add(cliente);
                }
            }else if(//buscar por telefono
                    this.nombreTextField.getText().isEmpty()
                    &&!this.telefonoTextField.getText().isEmpty()
                    &&this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(cliente.getTelefono().equals(this.telefonoTextField.getText()))clientesEncontrados.add(cliente);
                }
            }else if(//buscar por telefono y direccion
                    this.nombreTextField.getText().isEmpty()
                    &&!this.telefonoTextField.getText().isEmpty()
                    &&!this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(
                            cliente.getTelefono().equals(this.telefonoTextField.getText())
                            &&cliente.getDireccion().equals(this.direccionTextField.getText())
                    )clientesEncontrados.add(cliente);
                }
            }else if(//buscar por direccion
                    this.nombreTextField.getText().isEmpty()
                    &&this.telefonoTextField.getText().isEmpty()
                    &&!this.direccionTextField.getText().isEmpty()
            ){
                for(Cliente cliente : clientes){
                    if(cliente.getDireccion().equals(this.direccionTextField.getText()))clientesEncontrados.add(cliente);
                }
            }
            if(!clientesEncontrados.isEmpty()){
                this.clientesObservableList.clear();
                this.clientesObservableList.addAll(clientesEncontrados);
                this.clienteTableView.setItems(this.clientesObservableList);
                this.limpiarCampos();
            }else this.errorLabel.setText("Cliente no encontrado");
        }
    }
    @FXML
    private void onListarClick(){
        this.cargarListaTable();
        this.limpiarCampos();
    }
    @FXML
    private void onGenerarInformeClick(){
        //todo
    }

    /**
     * Método que selecciona el producto que hemos seleccionado en la tabla de la vista
     */
    @FXML
    private void seleccionar(){
        this.errorLabel.setText("");
        //tomamos el producto que se ha seleccionado
        Cliente cliente = this.clienteTableView.getSelectionModel().getSelectedItem();
        //siempre que no sea null, asignamos los valores en los inputs
        if(cliente != null){
            this.nombreTextField.setText(cliente.getNombre());
            this.telefonoTextField.setText(cliente.getTelefono());
            this.direccionTextField.setText(cliente.getDireccion());
        }
    }

    private void cargarListaTable() {
        List<Cliente> clientes = this.clienteService.listar();
        this.clientesObservableList = FXCollections.observableArrayList();
        this.clientesObservableList.addAll(clientes);
        this.clienteTableView.setItems(this.clientesObservableList);
    }
    private void limpiarCampos(){
        this.nombreTextField.setText("");
        this.telefonoTextField.setText("");
        this.direccionTextField.setText("");
        this.errorLabel.setText("");
    }
}

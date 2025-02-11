package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import com.spachecor.pacheco_selene_tf_di.model.entity.Producto;
import com.spachecor.pacheco_selene_tf_di.model.service.repository.GenericRepositoryService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.math.BigDecimal;
import java.util.List;

public class ProductosController {
    @FXML
    private TableView<Producto> productoTableView;
    @FXML
    private TableColumn<Producto, Integer> idTableColumn;
    @FXML
    private TableColumn<Producto, String> nombreTableColumn;
    @FXML
    private TableColumn<Producto, String> categoriaTablaColumn;
    @FXML
    private TableColumn<Producto, BigDecimal> precioTablaColumn;
    @FXML
    private TableColumn<Producto, Boolean> disponibilidadTablaColumn;
    @FXML
    private Label errorLabel;
    @FXML
    private TextField nombreTextField;
    @FXML
    private TextField categoriaTextField;
    @FXML
    private TextField precioTextField;
    @FXML
    private TextField disponibilidadTextField;

    private GenericRepositoryService<Producto> productoService;
    private ObservableList<Producto> productoObservableList;

    @FXML
    protected void initialize() {
        this.productoService = new GenericRepositoryService<>(Producto.class);
        System.out.println(productoService.listar());
        //inicializamos las columnas
        this.idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.nombreTableColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.categoriaTablaColumn.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        this.precioTablaColumn.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.disponibilidadTablaColumn.setCellValueFactory(new PropertyValueFactory<>("disponibilidad"));
        this.cargarListaTable();
    }

    @FXML
    private void onClickSalirButton(){
        FXService.cambiarVentana(FXService.MAIN_VIEW);
    }

    @FXML
    private void onAniadirClick(){
        this.errorLabel.setText("");
        String nombre = this.nombreTextField.getText();
        String categoria = this.categoriaTextField.getText();
        if(!nombre.isEmpty() && !categoria.isEmpty() && !this.precioTextField.getText().isEmpty() && !this.disponibilidadTextField.getText().isEmpty()){
            BigDecimal precio = new BigDecimal(this.precioTextField.getText());
            Boolean disponibilidad = this.disponibilidadTextField.getText().equals("true");
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setCategoria(categoria);
            producto.setPrecio(precio);
            producto.setDisponibilidad(disponibilidad);
            if(!productoObservableList.contains(producto)){
                this.productoObservableList.add(producto);
                this.productoService.guardar(producto);
                this.productoTableView.setItems(productoObservableList);
                this.limpiarCampos();
            }else this.errorLabel.setText("El producto ya existe(Comparte el mismo nombre con otro producto)");
        }else this.errorLabel.setText("Por favor ingrese todos los campos");
    }

    @FXML
    private void onModificarClick(){
        this.errorLabel.setText("");
        Producto producto = this.productoTableView.getSelectionModel().getSelectedItem();
        if(producto != null && producto.getId() != null){
            if(!this.nombreTextField.getText().isEmpty() && !this.categoriaTextField.getText().isEmpty()
                    && !this.precioTextField.getText().isEmpty() && !this.disponibilidadTextField.getText().isEmpty()){
                Producto productoAux = new Producto();
                productoAux.setId(producto.getId());
                productoAux.setNombre(this.nombreTextField.getText());
                productoAux.setCategoria(this.categoriaTextField.getText());
                productoAux.setPrecio(new BigDecimal(this.precioTextField.getText()));
                productoAux.setDisponibilidad(this.disponibilidadTextField.getText().equals("true"));
                this.productoService.guardar(productoAux);
                producto.setNombre(productoAux.getNombre());
                producto.setCategoria(productoAux.getCategoria());
                producto.setPrecio(productoAux.getPrecio());
                producto.setDisponibilidad(productoAux.getDisponibilidad());
                this.productoTableView.refresh();
                this.limpiarCampos();
                this.productoTableView.getSelectionModel().clearSelection();
            }else this.errorLabel.setText("Por favor ingrese todos los campos");
        }else this.errorLabel.setText("Fallo terrible al seleccionar el producto.");
    }

    @FXML
    private void onEliminarClick(){}

    @FXML
    private void onBuscarClick(){}

    @FXML
    private void onListarClick(){}

    /**
     * Método que selecciona el producto que hemos seleccionado en la tabla de la vista
     */
    @FXML
    private void seleccionar(){
        this.errorLabel.setText("");
        //tomamos el producto que se ha seleccionado
        Producto producto = this.productoTableView.getSelectionModel().getSelectedItem();
        //siempre que no sea null, asignamos los valores en los inputs
        if(producto != null){
            this.nombreTextField.setText(producto.getNombre());
            this.categoriaTextField.setText(producto.getCategoria());
            this.precioTextField.setText(producto.getPrecio().toString());
            this.disponibilidadTextField.setText(producto.getDisponibilidad().toString());
        }
    }

    private void cargarListaTable() {
        List<Producto> productos = this.productoService.listar();
        this.productoObservableList = FXCollections.observableArrayList();
        this.productoObservableList.addAll(productos);
        this.productoTableView.setItems(this.productoObservableList);
    }
    private void limpiarCampos(){
        this.nombreTextField.setText("");
        this.categoriaTextField.setText("");
        this.precioTextField.setText("");
        this.disponibilidadTextField.setText("");
        this.errorLabel.setText("");
    }
}

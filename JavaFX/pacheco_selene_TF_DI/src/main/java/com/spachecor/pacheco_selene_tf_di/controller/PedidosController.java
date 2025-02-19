package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import com.spachecor.pacheco_selene_tf_di.model.entity.Cliente;
import com.spachecor.pacheco_selene_tf_di.model.entity.DetallePedido;
import com.spachecor.pacheco_selene_tf_di.model.entity.Pedido;
import com.spachecor.pacheco_selene_tf_di.model.entity.Producto;
import com.spachecor.pacheco_selene_tf_di.model.service.repository.GenericRepositoryService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidosController {
    @FXML
    private ChoiceBox<Cliente> clienteChoiceBox;
    @FXML
    private DatePicker fechaDatePicker;
    @FXML
    private ChoiceBox<String> estadoChoiceBox;
    @FXML
    private TextField totalTextField;
    @FXML
    private TextField pedidoTextField;
    @FXML
    private ChoiceBox<Producto> productoChoiceBox;
    @FXML
    private TextField cantidadTextField;
    @FXML
    private TextField subtotalTextField;
    @FXML
    private TableView<Pedido> pedidoTableView;
    @FXML
    private TableColumn<Pedido, Integer> idPedidoTableColumn;
    @FXML
    private TableColumn<Pedido, Cliente> clientePedidoTableColumn;
    @FXML
    private TableColumn<Pedido, LocalDateTime> fechaPedidoTableColumn;
    @FXML
    private TableColumn<Pedido, String> estadoPedidoTableColumn;
    @FXML
    private TableColumn<Pedido, BigDecimal> totalPedidoTableColumn;
    @FXML
    private TableView<DetallePedido> detallePedidoTableView;
    @FXML
    private TableColumn<DetallePedido, Integer> idDetallePedidoTableColumn;
    @FXML
    private TableColumn<DetallePedido, Pedido> pedidoDetallePedidoTableColumn;
    @FXML
    private TableColumn<DetallePedido, Producto> productoDetallePedidoTableColumn;
    @FXML
    private TableColumn<DetallePedido, Integer> cantidadDetallePedidoTableColumn;
    @FXML
    private TableColumn<DetallePedido, BigDecimal> subtotalDetallePedidoTableColumn;
    private GenericRepositoryService<Pedido> pedidoService;
    private GenericRepositoryService<Cliente> clienteService;
    private GenericRepositoryService<Producto> productoService;
    private GenericRepositoryService<DetallePedido> detallePedidoService;
    private ObservableList<Pedido> pedidosObservableList;
    private ObservableList<DetallePedido> detallePedidosObservableList;
    @FXML
    protected void initialize(){
        //deshabilitamos los campos necesarios
        this.totalTextField.setEditable(false);
        this.pedidoTextField.setEditable(false);
        this.subtotalTextField.setEditable(false);
        //inicializamos los servicios de repositorio
        this.pedidoService = new GenericRepositoryService<>(Pedido.class);
        this.clienteService = new GenericRepositoryService<>(Cliente.class);
        this.productoService = new GenericRepositoryService<>(Producto.class);
        this.detallePedidoService = new GenericRepositoryService<>(DetallePedido.class);
        //rellenamos los choiceboxs
        List<String> estados = new ArrayList<>();
        estados.add("pendiente");
        estados.add("en preparación");
        estados.add("entregado");
        this.clienteChoiceBox.setItems(FXCollections.observableList(clienteService.listar()));
        this.productoChoiceBox.setItems(FXCollections.observableList(productoService.listar()));
        this.estadoChoiceBox.setItems(FXCollections.observableList(estados));
        //inicializamos las columnas
        this.idPedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.clientePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        this.fechaPedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("fecha_pedido"));
        this.estadoPedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("estado"));
        this.totalPedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        this.idDetallePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.pedidoDetallePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("pedido"));
        this.productoDetallePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("producto"));
        this.cantidadDetallePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        this.subtotalDetallePedidoTableColumn.setCellValueFactory(new PropertyValueFactory<>("subtotal"));
        this.cargarListaPedidoTable();
    }
    @FXML
    private void onClickSalirButton(){
        FXService.cambiarVentana(FXService.MAIN_VIEW);
    }
    @FXML
    private void onClickAniadirPedidoButton(){
        if(this.clienteChoiceBox.getValue()!=null&&this.fechaDatePicker.getValue()!=null&&this.estadoChoiceBox.getValue()!=null){
            Cliente cliente = this.clienteChoiceBox.getValue();
            LocalDateTime fecha = this.fechaDatePicker.getValue().atStartOfDay();
            String estado = this.estadoChoiceBox.getValue();
            BigDecimal total = new BigDecimal(0);
            Pedido pedido = new Pedido();
            pedido.setCliente(cliente);
            pedido.setFecha_pedido(fecha);
            pedido.setEstado(estado);
            pedido.setTotal(total);
            this.pedidosObservableList.add(pedido);
            this.pedidoService.guardar(pedido);
            this.pedidoTableView.setItems(this.pedidosObservableList);
            this.limpiarCamposPedido();
        }else JOptionPane.showMessageDialog(null, "Terrible, no puede haber campos vacíos.");
    }
    @FXML
    private void onClickModificarPedidoButton(){
        Pedido pedido = this.pedidoTableView.getSelectionModel().getSelectedItem();
        if(pedido!=null){
            if(this.clienteChoiceBox.getValue()!=null&&this.fechaDatePicker.getValue()!=null&&this.estadoChoiceBox.getValue()!=null){
                pedido.setCliente(this.clienteChoiceBox.getValue());
                pedido.setFecha_pedido(this.fechaDatePicker.getValue().atStartOfDay());
                pedido.setEstado(this.estadoChoiceBox.getValue());
                this.pedidoService.guardar(pedido);
                this.pedidoTableView.refresh();
            }else JOptionPane.showMessageDialog(null, "Terrible, no puede haber campos vacíos.");
        }else JOptionPane.showMessageDialog(null, "Terrible, debes seleccionar un pedido.");
    }
    @FXML
    private void onClickEliminarPedidoButton(){
        Pedido pedido = this.pedidoTableView.getSelectionModel().getSelectedItem();
        if(pedido!=null){
            this.pedidoService.eliminar(pedido);
            this.pedidosObservableList.remove(pedido);
            this.pedidoTableView.refresh();
            this.detallePedidoTableView.getItems().clear();
            this.limpiarCamposPedido();
            this.limpiarCamposDetallePedido();
        }else JOptionPane.showMessageDialog(null, "Terrible, debes seleccionar un pedido.");
    }
    @FXML
    private void onClickAniadirDetallePedidoButton(){
        if(this.pedidoTableView.getSelectionModel().getSelectedItem()!=null){
            if(this.productoChoiceBox.getValue()!=null&&!this.cantidadTextField.getText().isEmpty()){
                DetallePedido detallePedido = new DetallePedido();
                Pedido pedido = this.pedidoTableView.getSelectionModel().getSelectedItem();
                BigDecimal subtotal = new BigDecimal(this.cantidadTextField.getText()).multiply(this.productoChoiceBox.getValue().getPrecio());
                detallePedido.setPedido(pedido);
                detallePedido.setProducto(this.productoChoiceBox.getValue());
                detallePedido.setCantidad(Integer.valueOf(this.cantidadTextField.getText()));
                detallePedido.setSubtotal(subtotal);
                this.detallePedidosObservableList.add(detallePedido);
                this.detallePedidoService.guardar(detallePedido);
                this.detallePedidoTableView.setItems(this.detallePedidosObservableList);
                pedido.setTotal(pedido.getTotal().add(subtotal));
                pedido.getDetallesPedido().add(detallePedido);
                this.pedidoService.guardar(pedido);
                this.pedidoTableView.refresh();
                this.limpiarCamposDetallePedido();
            }else JOptionPane.showMessageDialog(null, "Terrible, no puede haber campos vacíos.");
        }else JOptionPane.showMessageDialog(null, "Terrible, debes seleccionar un pedido.");
    }
    @FXML
    private void onClickModificarDetallePedidoButton(){
        DetallePedido detallePedido = this.detallePedidoTableView.getSelectionModel().getSelectedItem();
        if(detallePedido!=null){
            if(this.productoChoiceBox.getValue()!=null&&!this.cantidadTextField.getText().isEmpty()){
                //primero restamos el anterior precio al pedido
                detallePedido.getPedido().setTotal(detallePedido.getPedido().getTotal().subtract(detallePedido.getProducto().getPrecio().multiply(new BigDecimal(detallePedido.getCantidad()))));
                //ahora modificamos y guardamos el producto
                detallePedido.setProducto(this.productoChoiceBox.getValue());
                detallePedido.setCantidad(Integer.valueOf(this.cantidadTextField.getText()));
                detallePedido.setSubtotal(this.productoChoiceBox.getValue().getPrecio().multiply(new BigDecimal(this.cantidadTextField.getText())));
                this.detallePedidoService.guardar(detallePedido);
                this.detallePedidoTableView.refresh();
                //ahora modificamos el pedido para actualizar el nuevo precio
                detallePedido.getPedido().setTotal(detallePedido.getPedido().getTotal().add(this.productoChoiceBox.getValue().getPrecio().multiply(new BigDecimal(this.cantidadTextField.getText()))));
                pedidoService.guardar(detallePedido.getPedido());
                this.pedidoTableView.refresh();
            }else JOptionPane.showMessageDialog(null, "Terrible, no puede haber campos vacíos.");
        }else JOptionPane.showMessageDialog(null, "Terrible, debes seleccionar un detalle de pedido.");
    }
    @FXML
    private void onClickEliminarDetallePedidoButton(){
        DetallePedido detallePedido = this.detallePedidoTableView.getSelectionModel().getSelectedItem();
        if(detallePedido!=null){
            //restamos el valor del detalle de pedido al pedido
            Pedido pedido = this.pedidoTableView.getSelectionModel().getSelectedItem();
            pedido.setTotal(pedido.getTotal().subtract(detallePedido.getSubtotal()));
            this.pedidoService.guardar(pedido);
            this.pedidoTableView.refresh();
            //eliminamos el detalle de pedido
            this.detallePedidoService.eliminar(detallePedido);
            this.detallePedidosObservableList.remove(detallePedido);
            pedido.getDetallesPedido().remove(detallePedido);
            this.detallePedidoTableView.refresh();
            this.limpiarCamposPedido();
            this.limpiarCamposDetallePedido();
        }else JOptionPane.showMessageDialog(null, "Terrible, debes seleccionar un detalle de pedido.");
    }
    @FXML
    private void onClickPedidoTableView(){
        this.limpiarCamposDetallePedido();
        Pedido pedido = this.pedidoTableView.getSelectionModel().getSelectedItem();
        this.pedidoTextField.setText(pedido.toString());
        this.clienteChoiceBox.setValue(pedido.getCliente());
        this.fechaDatePicker.setValue(pedido.getFecha_pedido().toLocalDate());
        this.estadoChoiceBox.setValue(pedido.getEstado());
        this.totalTextField.setText(pedido.getTotal().toString());
        this.cargarListaDetallePedidoTable(pedido);
    }
    @FXML
    private void onClickDetallePedidoTableView(){
        DetallePedido detallePedido = this.detallePedidoTableView.getSelectionModel().getSelectedItem();
        if(detallePedido!=null){
            this.productoChoiceBox.setValue(detallePedido.getProducto());
            this.cantidadTextField.setText(detallePedido.getCantidad().toString());
            this.subtotalTextField.setText(detallePedido.getSubtotal().toString());
        }
    }

    private void cargarListaPedidoTable(){
        List<Pedido> pedidos = this.pedidoService.listar();
        this.pedidosObservableList = FXCollections.observableArrayList();
        this.pedidosObservableList.addAll(pedidos);
        this.pedidoTableView.setItems(this.pedidosObservableList);
    }

    private void cargarListaDetallePedidoTable(Pedido pedido){
        List<DetallePedido> detallesPedido = pedido.getDetallesPedido().stream().toList();
        this.detallePedidosObservableList = FXCollections.observableArrayList();
        this.detallePedidosObservableList.addAll(detallesPedido);
        this.detallePedidoTableView.setItems(this.detallePedidosObservableList);
    }

    private void limpiarCamposPedido(){
        this.clienteChoiceBox.setValue(null);
        this.fechaDatePicker.setValue(null);
        this.estadoChoiceBox.setValue(null);
        this.totalTextField.setText(null);
        this.pedidoTableView.getSelectionModel().clearSelection();
    }

    private void limpiarCamposDetallePedido(){
        this.pedidoTextField.setText(null);
        this.productoChoiceBox.setValue(null);
        this.cantidadTextField.setText(null);
        this.subtotalTextField.setText(null);
        this.detallePedidoTableView.getSelectionModel().clearSelection();
    }
}

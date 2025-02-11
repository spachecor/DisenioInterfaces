package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private void onGestionClientesButton(){
        FXService.cambiarVentana(FXService.CLIENTES_VIEW);
    }
    @FXML
    private void onGestionProductosButton(){
        FXService.cambiarVentana(FXService.PRODUCTOS_VIEW);
    }
    @FXML
    private void onGestionPedidosButton(){

    }
    @FXML
    private void onInformesButton(){

    }
}
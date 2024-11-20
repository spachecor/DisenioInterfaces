package com.spacrod.pacheco_selene_t5_di.controller;

import com.spacrod.pacheco_selene_t5_di.service.FXService;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class PaginaPrincipalController {
    @FXML
    private Label labelError;

    @FXML
    protected void onClickMenuItemCocheElectrico() {
        FXService.cambiarVentana(FXService.COCHE_ELECTRICO);
        limpiarLabelError();
    }
    @FXML
    protected void onClickMenuItemBicicletaElectrica() {
        labelError.setText("NO DISPONEMOS DE BICICLETAS EN ESTE MOMENTO.");
    }
    @FXML
    protected void onClickButtonSalir(){
        Platform.exit();
    }
    private void limpiarLabelError(){
        labelError.setText("");
    }
}
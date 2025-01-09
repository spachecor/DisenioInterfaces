package com.spacrod.pacheco_selene_examen_di.controllers;

import com.spacrod.pacheco_selene_examen_di.services.FXService;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuPrincipalController {
    @FXML
    protected void onClickMenuIniciar(){
        FXService.cambiarVentana(FXService.LOGIN);
    }
    @FXML
    protected void onClickMenuCitas(){
        FXService.cambiarVentana(FXService.CITAS);
    }
    @FXML
    protected void onClickMenuSalir(){
        Platform.exit();
    }
}
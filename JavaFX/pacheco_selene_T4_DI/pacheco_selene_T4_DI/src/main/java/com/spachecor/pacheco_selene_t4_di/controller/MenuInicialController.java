package com.spachecor.pacheco_selene_t4_di.controller;

import com.spachecor.pacheco_selene_t4_di.util.AppNavigationService;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.spachecor.pacheco_selene_t4_di.Main.*;

public class MenuInicialController {
    @FXML
    private Button botonReservas;
    @FXML
    private Button botonSalir;

    @FXML
    public void initialize() {
        AppNavigationService.setFont(customFontButton, botonReservas);
        AppNavigationService.setFont(customFontButton, botonSalir);
        AppNavigationService.setTooltipWithFont(botonReservas, "Púlsame para ir a reservas", customFontNormal);
        AppNavigationService.setTooltipWithFont(botonSalir, "Púlsame para salir de la aplicación", customFontNormal);
    }

    @FXML
    protected void onBotonReservas() {
        AppNavigationService.cargarVista(AppNavigationService.reservasVista);
    }
    @FXML
    protected void onBotonSalir() {
        Platform.exit();
    }
}
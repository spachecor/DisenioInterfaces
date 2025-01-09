package com.spacrod.pacheco_selene_t6_di.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FormularioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
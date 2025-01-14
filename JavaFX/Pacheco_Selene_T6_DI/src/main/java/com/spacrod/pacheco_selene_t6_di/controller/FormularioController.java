package com.spacrod.pacheco_selene_t6_di.controller;

import com.spacrod.pacheco_selene_t6_di.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class FormularioController {
    @FXML
    private VBox relojVBox;

    @FXML
    protected void initialize() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/reloj.fxml"));
        VBox vbox = new VBox();
        vbox.getChildren().add(fxmlLoader.load());
        this.relojVBox.getChildren().add(vbox);
    }
}
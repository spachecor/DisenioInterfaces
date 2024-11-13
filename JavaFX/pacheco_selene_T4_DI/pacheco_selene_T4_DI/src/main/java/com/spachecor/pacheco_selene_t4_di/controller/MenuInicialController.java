package com.spachecor.pacheco_selene_t4_di.controller;

import com.spachecor.pacheco_selene_t4_di.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import static com.spachecor.pacheco_selene_t4_di.Main.*;

public class MenuInicialController {
    @FXML
    private Button botonReservas;
    @FXML
    private Button botonSalir;

    @FXML
    public void initialize() {
        botonReservas.setFont(customFontButton);
        botonSalir.setFont(customFontButton);
    }

    @FXML
    protected void onBotonReservas() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/reservas.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            primaryStage.setTitle("My Cat Yugawara Hostal");
            primaryStage.getIcons().add(icono);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e){
            System.out.println("Imposible cargar la vista");
            Platform.exit();
        }
    }
    @FXML
    protected void onBotonSalir() {
        Platform.exit();
    }
}
package com.spacrod.ejerciciouno.controller;

import com.spacrod.ejerciciouno.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import static com.spacrod.ejerciciouno.Main.stage;
import static com.spacrod.ejerciciouno.Main.icono;

public class PantallaPrincipalController {
    @FXML
    private Button reservas;
    @FXML
    private Button salir;

    @FXML
    protected void onReservasButtonClicked() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/reservas.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            stage.setTitle("Hotel Canfranc Estación - Reservas");
            stage.getIcons().add(icono);
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            System.out.println("Imposible cargar la vista");
            Platform.exit();
        }
    }
    @FXML
    protected void onSalirButtonClicked() {
        Platform.exit();
    }
}
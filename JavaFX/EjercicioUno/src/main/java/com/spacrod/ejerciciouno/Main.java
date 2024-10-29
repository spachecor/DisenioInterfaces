package com.spacrod.ejerciciouno;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static Stage stage;
    public static Image icono;
    @Override
    public void start(Stage stage) throws IOException {
        Main.stage = stage;
        Main.icono = new Image(Objects.requireNonNull(getClass().getResourceAsStream("img/iconoHotel.png")));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("fxml/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Hotel Canfranc Estación");
        stage.getIcons().add(icono);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
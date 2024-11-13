package com.spachecor.pacheco_selene_t4_di;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    public static Stage primaryStage;
    public static Image icono;
    public static Font customFontButton;
    public static Font customFontNormal;
    public static Font customFontMedium;
    @Override
    public void start(Stage stage) throws IOException {
        customFontButton = Font.loadFont(Main.class.getResourceAsStream("/com/spachecor/pacheco_selene_t4_di/fonts/AustieBostKittenKlub.ttf"), 24);
        customFontNormal = Font.loadFont(Main.class.getResourceAsStream("/com/spachecor/pacheco_selene_t4_di/fonts/AustieBostKittenKlub.ttf"), 14);
        customFontMedium = Font.loadFont(Main.class.getResourceAsStream("/com/spachecor/pacheco_selene_t4_di/fonts/AustieBostKittenKlub.ttf"), 18);
        primaryStage = stage;
        icono = new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/com/spachecor/pacheco_selene_t4_di/img/icono.png")));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/menu-principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("My Cat Yugawara Hostal");
        stage.getIcons().add(icono);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
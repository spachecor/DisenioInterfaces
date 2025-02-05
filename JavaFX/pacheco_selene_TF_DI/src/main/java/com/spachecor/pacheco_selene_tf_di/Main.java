package com.spachecor.pacheco_selene_tf_di;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        Main.stage = stage;
        FXService.cambiarVentana(FXService.MAIN_VIEW);
    }

    public static void main(String[] args) {
        launch();
    }
}
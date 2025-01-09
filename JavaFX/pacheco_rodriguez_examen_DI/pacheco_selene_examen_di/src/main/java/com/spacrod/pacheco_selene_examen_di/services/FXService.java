package com.spacrod.pacheco_selene_examen_di.services;

import com.spacrod.pacheco_selene_examen_di.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

public class FXService {
    public static final String VENTANA_MAIN;
    public static final String LOGIN;
    public static final String CITAS;
    static {
        VENTANA_MAIN = "menu-principal.fxml";
        LOGIN = "login.fxml";
        CITAS = "citas.fxml";
    }
    public static void cambiarVentana(String ventana){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/"+ventana));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Main.stage.setTitle("Virgen del Rocío - Gestiones");
            Main.
            Main.stage.setScene(scene);stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/com/spacrod/pacheco_selene_examen_di/img/icono.png"))));
            Main.stage.show();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("No se puede cambiar la ventana: "+e.getMessage());
            System.exit(1);
        }
    }
    public static void configureLabelWithMnemonic(Label label, Control control) {label.setLabelFor(control);}
}

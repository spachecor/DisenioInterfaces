package com.spacrod.pacheco_selene_t5_di.service;

import com.spacrod.pacheco_selene_t5_di.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;

public class FXService {
    public static final String VENTANA_MAIN;
    public static final String COCHE_ELECTRICO;
    static {
        VENTANA_MAIN = "pagina-principal.fxml";
        COCHE_ELECTRICO = "coche-electrico.fxml";
    }
    public static void cambiarVentana(String ventana){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/"+ventana));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Main.stage.setTitle("CarroCómico - Alquiler de Vehículos");
            Main.stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/com/spacrod/pacheco_selene_t5_di/img/icono.png"))));
            Main.stage.setScene(scene);
            Main.stage.show();
        }catch(IOException e){
            System.out.println("No se puede cambiar la ventana: "+e.getMessage());
            System.exit(1);
        }
    }
    public static void configureLabelWithMnemonic(Label label, Control control) {label.setLabelFor(control);}
}

package com.spachecor.pacheco_selene_tf_di.controller.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.io.IOException;
import java.util.Objects;
import com.spachecor.pacheco_selene_tf_di.Main;

public class FXService {
    public static final String MAIN_VIEW;
    public static final String CLIENTES_VIEW;
    public static final String PRODUCTOS_VIEW;
    static {
        MAIN_VIEW = "main-view.fxml";
        CLIENTES_VIEW = "clientes-view.fxml";
        PRODUCTOS_VIEW = "productos-view.fxml";
    }
    /**
     * Método que se encarga de cambiar las ventanas según el nombre de la vista que le pasemos.
     * @param ventana El nombre del fichero .fxml que le pasamos.
     */
    public static void cambiarVentana(String ventana){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/"+ventana));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            Main.stage.setTitle("Gestión del restaurante");
            Main.stage.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("/com/spachecor/pacheco_selene_tf_di/img/icon.png"))));
            Main.stage.setScene(scene);
            Main.stage.show();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("No se puede cambiar la ventana: "+e.getMessage());
            System.exit(1);
        }
    }
}

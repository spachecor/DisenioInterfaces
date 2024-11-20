package com.spacrod.pacheco_selene_t5_di.service;

import com.spacrod.pacheco_selene_t5_di.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;

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
            Main.stage.setScene(scene);
            Main.stage.show();
        }catch(IOException e){
            System.out.println("No se puede cambiar la ventana: "+e.getMessage());
            System.exit(1);
        }
    }
    public static void configureLabelWithMnemonic(Label label, String textWithMnemonic, Control control) {
        label.setText(textWithMnemonic);
        label.setMnemonicParsing(true);
        label.setLabelFor(control);

        if (control instanceof TextField) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof DatePicker) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof CheckBox) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof ChoiceBox) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof RadioButton) {
            label.setOnKeyPressed(event -> control.requestFocus());
        }
    }
}

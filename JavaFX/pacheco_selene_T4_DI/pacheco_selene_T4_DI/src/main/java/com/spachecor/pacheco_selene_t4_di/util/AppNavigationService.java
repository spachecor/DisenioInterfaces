package com.spachecor.pacheco_selene_t4_di.util;

import com.spachecor.pacheco_selene_t4_di.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Font;

import java.io.IOException;

import static com.spachecor.pacheco_selene_t4_di.Main.*;

public class AppNavigationService {
    public final static String menuPrincipalVista;
    public final static String reservasVista;
    static{
        menuPrincipalVista = "menu-principal";
        reservasVista = "reservas";
    }

    public static boolean cargarVista(String vista){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/"+vista+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            primaryStage.setTitle("My Cat Yugawara Hostal");
            primaryStage.getIcons().add(icono);
            primaryStage.setScene(scene);
            primaryStage.show();
            return true;
        }catch(IOException e){
            return false;
        }
    }

    public static void setFont(Font font, Control... controls) {
        for (Control control : controls) {
            if (control instanceof Labeled) {
                ((Labeled) control).setFont(font);
            } else if (control instanceof TextField) {
                ((TextField) control).setFont(font);
            }
        }
    }

    public static void setTooltipWithFont(Control control, String tooltipText, Font font) {
        Tooltip tooltip = new Tooltip(tooltipText);
        tooltip.setFont(font);
        control.setTooltip(tooltip);
    }
}

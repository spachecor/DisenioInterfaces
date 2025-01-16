package com.spacrod.pacheco_selene_t6_di.creacion;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public class NuevoComponente {
    public static String RELOJ_COMPONENTE;
    static {
        RELOJ_COMPONENTE = "reloj.fxml";
    }

    /**
     * Método que carga un nuevo componente en el contenedor enviado.
     * @param contenedor El contenedor donde se cargará el componente
     * @param componente El componente a cargar. Se sugiere usar los componentes definidos en esta clase.
     * @param <T> Un contenedor que extienda Pane
     * @throws IOException Excepcion que puede saltar
     */
    public static <T extends Pane> void cargarComponente(T contenedor, String componente) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(
                NuevoComponente.class.getResource("/com/spacrod/pacheco_selene_t6_di/view/"+componente)
        ));
        VBox vbox = new VBox();
        vbox.getChildren().add(fxmlLoader.load());
        contenedor.getChildren().add(vbox);
    }
}

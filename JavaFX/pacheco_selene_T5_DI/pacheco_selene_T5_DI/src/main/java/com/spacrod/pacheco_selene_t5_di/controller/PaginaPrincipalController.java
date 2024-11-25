package com.spacrod.pacheco_selene_t5_di.controller;

import com.spacrod.pacheco_selene_t5_di.service.FXService;
import com.spacrod.pacheco_selene_t5_di.service.FontService;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PaginaPrincipalController {
    @FXML
    private Label labelError;
    @FXML
    private Label labelElegir;
    @FXML
    private MenuBar menuBarOpciones;
    @FXML
    private Button buttonSalir;
    @FXML
    private Button buttonCocheElectrico;
    @FXML
    private Button buttonBicicletaElectrica;
    @FXML
    private Tooltip toolTipSalir;
    @FXML
    private Tooltip toolTipCocheElectrico;
    @FXML
    private Tooltip toolTipBicicletaElectrica;

    @FXML
    public void initialize() {
        FontService.applyFont(
                FontService.CUSTOM_PUMA_FONT_NORMAL,
                toolTipSalir,
                toolTipCocheElectrico,
                toolTipBicicletaElectrica
        );
        FontService.applyFont(//fuente grande
                FontService.CUSTOM_PUMA_FONT_BIG,
                menuBarOpciones,
                buttonSalir,
                buttonCocheElectrico,
                buttonBicicletaElectrica,
                labelError
        );
        FontService.applyFont(
                FontService.CUSTOM_PUMA_FONT_MEDIUM,
                labelElegir
        );
    }

    @FXML
    protected void onClickMenuItemCocheElectrico() {
        FXService.cambiarVentana(FXService.COCHE_ELECTRICO);
        limpiarLabelError();
    }
    @FXML
    protected void onClickMenuItemBicicletaElectrica() {
        labelError.setText("NO DISPONEMOS DE BICICLETAS EN ESTE MOMENTO.");
    }
    @FXML
    protected void onClickButtonSalir(){
        Platform.exit();
    }
    private void limpiarLabelError(){
        labelError.setText("");
    }
}
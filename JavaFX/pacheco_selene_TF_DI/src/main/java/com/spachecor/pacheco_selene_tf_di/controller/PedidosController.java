package com.spachecor.pacheco_selene_tf_di.controller;

import com.spachecor.pacheco_selene_tf_di.controller.service.FXService;
import javafx.fxml.FXML;

public class PedidosController {

    @FXML
    private void onClickSalirButton(){
        FXService.cambiarVentana(FXService.MAIN_VIEW);
    }
}

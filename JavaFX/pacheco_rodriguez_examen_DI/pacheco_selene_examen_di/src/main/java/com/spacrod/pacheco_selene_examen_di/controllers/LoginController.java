package com.spacrod.pacheco_selene_examen_di.controllers;

import com.spacrod.pacheco_selene_examen_di.services.FXService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField textFieldUsuario;
    @FXML
    private TextField textFieldContrasena;
    @FXML
    private Label labelError;
    @FXML
    protected void onClickButtonAceptar(){
        if(validarCampos()){
            FXService.cambiarVentana(FXService.CITAS);
        }
    }
    @FXML
    protected void onClickButtonCancelar(){
        FXService.cambiarVentana(FXService.VENTANA_MAIN);
    }
    private boolean validarCampos(){
        String error = "";
        boolean correcto = false;
        String usuario = textFieldUsuario.getText();
        String contrasena = textFieldContrasena.getText();
        if(usuario.isEmpty() || contrasena.isEmpty()){
            error="Introduzca Usuario o Contraseña";
        }else if (!usuario.equals("admin") || !contrasena.equals("1234")){
            error="Usuario o contraseña incorrectas";
        }else correcto = true;
        if(!error.isEmpty())labelError.setText(error);
        return correcto;
    }
}

package com.spachecor.pacheco_selene_t4_di.controller;

import com.spachecor.pacheco_selene_t4_di.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;

import static com.spachecor.pacheco_selene_t4_di.Main.*;

public class ReservasController {
    @FXML
    private Label labelDatosReserva;
    @FXML
    private Label labelDatosCliente;
    @FXML
    private Label labelDNI;
    @FXML
    private TextField textFieldDNI;
    @FXML
    private Label labelNombre;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private Label labelDireccion;
    @FXML
    private TextField textFieldDireccion;
    @FXML
    private Label labelLocalidad;
    @FXML
    private TextField textFieldLocalidad;
    @FXML
    private Label labelProvincia;
    @FXML
    private TextField textFieldProvincia;
    @FXML
    private Label labelFechaEntrada;
    @FXML
    private DatePicker datePickerFechaEntrada;
    @FXML
    private Label labelFechaSalida;
    @FXML
    private DatePicker datePickerFechaSalida;
    @FXML
    private Label labelNumeroHabitaciones;
    @FXML
    private TextField textFieldNumeroHabitaciones;
    @FXML
    private Label labelTipoHabitacion;
    @FXML
    private ChoiceBox<String> choiceBoxTipoHabitacion;
    @FXML
    private CheckBox checkBoxfumador;
    @FXML
    private Label labelRegimen;
    @FXML
    private ToggleGroup toggleGroupRegimen;
    @FXML
    private RadioButton radioButtonAlojamientoPension;
    @FXML
    private RadioButton radioButtonMediaPension;
    @FXML
    private RadioButton radioButtonPensionCompleta;
    @FXML
    private Label labelFumador;
    @FXML
    private Label labelAviso;
    @FXML
    private Button buttonLimpiar;
    @FXML
    private Button buttonAceptar;
    @FXML
    private Button buttonCancelar;
    @FXML
    public void initialize(){
        //aplicamos la fuente
        labelDatosReserva.setFont(customFontButton);
        labelDatosCliente.setFont(customFontButton);
        labelDNI.setFont(customFontNormal);
        textFieldDNI.setFont(customFontNormal);
        labelNombre.setFont(customFontNormal);
        textFieldNombre.setFont(customFontNormal);
        labelDireccion.setFont(customFontNormal);
        textFieldDireccion.setFont(customFontNormal);
        labelLocalidad.setFont(customFontNormal);
        textFieldLocalidad.setFont(customFontNormal);
        labelProvincia.setFont(customFontNormal);
        textFieldProvincia.setFont(customFontNormal);
        labelFechaEntrada.setFont(customFontNormal);
        labelFechaSalida.setFont(customFontNormal);
        labelNumeroHabitaciones.setFont(customFontNormal);
        textFieldNumeroHabitaciones.setFont(customFontNormal);
        labelTipoHabitacion.setFont(customFontNormal);
        choiceBoxTipoHabitacion.setStyle("-fx-font-family: '" + customFontNormal.getFamily() + "'; -fx-font-size: " + customFontNormal.getSize() + ";");
        checkBoxfumador.setFont(customFontNormal);
        labelRegimen.setFont(customFontMedium);
        radioButtonAlojamientoPension.setFont(customFontNormal);
        radioButtonMediaPension.setFont(customFontNormal);
        radioButtonPensionCompleta.setFont(customFontNormal);
        labelFumador.setFont(customFontMedium);
        labelAviso.setFont(customFontMedium);
        buttonLimpiar.setFont(customFontNormal);
        buttonAceptar.setFont(customFontNormal);
        buttonCancelar.setFont(customFontNormal);
    }
    @FXML
    protected void onButtonLimpiar(){
        textFieldDNI.setText("");
        textFieldNombre.setText("");
        textFieldDireccion.setText("");
        textFieldLocalidad.setText("");
        textFieldProvincia.setText("");
        datePickerFechaEntrada.getEditor().clear();
        datePickerFechaSalida.getEditor().clear();
        textFieldNumeroHabitaciones.setText("");
        choiceBoxTipoHabitacion.setValue("");//todo cambiar a primera opcion del array de opciones de tipo de habitacion
        checkBoxfumador.setSelected(false);
        radioButtonAlojamientoPension.setSelected(true);
        labelFumador.setText("");
        labelAviso.setText("");
    }
    @FXML
    protected void onButtonCancelar(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/menu-principal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
            primaryStage.setTitle("My Cat Yugawara Hostal");
            primaryStage.getIcons().add(icono);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e){
            System.out.println("Imposible cargar la vista");
            Platform.exit();
        }
    }
    @FXML
    protected void onButtonAceptar(){
        //todo
    }
    @FXML
    protected void onCheckBoxfumador(){
        if(checkBoxfumador.isSelected()){
            labelFumador.setText("En virtud de la Ley de Sanidad se informa a los clientes de que sólo podrán fumar en las habitaciones\n" +
                    "reservadas para tal fin.");
        }else labelFumador.setText("");
    }
}

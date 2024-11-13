package com.spachecor.pacheco_selene_t4_di.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    public void initialize(){
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
    }
}

package com.spacrod.pacheco_selene_t5_di.controller;

import com.spacrod.pacheco_selene_t5_di.service.FXService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;


public class CocheElectricoController {
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellidos;
    @FXML
    private Label labelTelefono;
    @FXML
    private Label labelDNI;
    @FXML
    private Label labelFechaInicio;
    @FXML
    private Label labelFechaFin;
    @FXML
    private Label labelTipoVehiculo;
    @FXML
    private Label labelEdadConductor;
    @FXML
    private Label labelKM;
    @FXML
    private Label labelError;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidos;
    @FXML
    private TextField textFieldTelefono;
    @FXML
    private TextField textFieldDNI;
    @FXML
    private DatePicker datePickerFechaInicio;
    @FXML
    private DatePicker datePickerFechaFin;
    @FXML
    private ChoiceBox<String> choiceBoxTipoVehiculo;
    @FXML
    private ChoiceBox<Integer> choiceBoxEdadConductor;
    @FXML
    private ChoiceBox<String> choiceBoxKM;
    @FXML
    private CheckBox checkBoxNoPrecisa;
    @FXML
    private Button buttonConfirmar;

    @FXML
    public void initialize(){
        //rellenamos los choiocebox
        List<String> vehiculos = new ArrayList<>();
        vehiculos.add("4x4");
        vehiculos.add("SUV");
        vehiculos.add("Pequeño");
        vehiculos.add("Mediano");
        vehiculos.add("Grande");
        List<Integer> edades = new ArrayList<>();
        for(int i = 18;i<=100;i++){
            edades.add(i);
        }
        List<String> kms = new ArrayList<>();
        kms.add("500-1000");
        kms.add("1000-1500");
        kms.add("1500-2500");
        kms.add("2500-5000");
        kms.add("5000+");
        choiceBoxTipoVehiculo.getItems().addAll(vehiculos);
        choiceBoxEdadConductor.getItems().addAll(edades);
        choiceBoxKM.getItems().addAll(kms);
        //ponemos los tooltips en los campos
        FXService.configureLabelWithMnemonic(labelNombre, "_Nombre", textFieldNombre);
        FXService.configureLabelWithMnemonic(labelApellidos, "_Apellidos", textFieldApellidos);
        FXService.configureLabelWithMnemonic(labelTelefono, "_Telefono", textFieldTelefono);
        FXService.configureLabelWithMnemonic(labelDNI, "_DNI", textFieldDNI);
        FXService.configureLabelWithMnemonic(labelFechaInicio, "_FechaInicio", datePickerFechaInicio);
        FXService.configureLabelWithMnemonic(labelFechaFin, "_FechaFin", datePickerFechaFin);
        FXService.configureLabelWithMnemonic(labelTipoVehiculo, "_Tipo de Vehículo", choiceBoxTipoVehiculo);
        FXService.configureLabelWithMnemonic(labelEdadConductor, "_Edad del conductor", choiceBoxEdadConductor);
        FXService.configureLabelWithMnemonic(labelKM, "Nª de _kilómetros que realizará", choiceBoxKM);

        //ponemos los predefinidos
        choiceBoxTipoVehiculo.setValue(vehiculos.getFirst());
        choiceBoxEdadConductor.setValue(edades.getFirst());
        choiceBoxKM.setValue(kms.getFirst());
        checkBoxNoPrecisa.setSelected(true);
    }

    @FXML
    protected void onClickButtonSalir(){
        FXService.cambiarVentana(FXService.VENTANA_MAIN);
    }
    @FXML
    protected void onClickButtonConfirmar(){

    }
}

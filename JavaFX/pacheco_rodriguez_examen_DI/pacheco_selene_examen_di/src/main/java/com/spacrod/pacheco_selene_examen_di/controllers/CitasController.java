package com.spacrod.pacheco_selene_examen_di.controllers;

import com.spacrod.pacheco_selene_examen_di.services.FXService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CitasController {
    @FXML
    private Label labelError;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellidos;
    @FXML
    private Label labelDNI;
    @FXML
    private Label labelEspecialidad;
    @FXML
    private Label labelFechaCita;
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidos;
    @FXML
    private TextField textFieldDNI;
    @FXML
    private ChoiceBox<String> choiceBoxEspecialidad;
    @FXML
    private DatePicker datePickerFechaCita;
    private List<String> especialidades;

    @FXML
    public void initialize(){
        especialidades = new ArrayList<>();
        especialidades.add("Seleccione una especialidad");
        especialidades.add("Traumatología");
        especialidades.add("Dermatología");
        especialidades.add("Cardiología");
        especialidades.add("Ginecología");
        especialidades.add("Urología");
        choiceBoxEspecialidad.getItems().addAll(especialidades);
        limpiarCampos();
        FXService.configureLabelWithMnemonic(labelNombre, textFieldNombre);
        FXService.configureLabelWithMnemonic(labelApellidos, textFieldApellidos);
        FXService.configureLabelWithMnemonic(labelDNI, textFieldDNI);
        FXService.configureLabelWithMnemonic(labelEspecialidad, choiceBoxEspecialidad);
        FXService.configureLabelWithMnemonic(labelFechaCita, datePickerFechaCita);
    }

    @FXML
    protected void onClickConfirmar(){
        if(validarCampos()){
            limpiarCampos();
            labelError.setText("Cita concertada");
        }
    }
    @FXML
    protected void onClickLimpiar(){
        limpiarCampos();
    }
    @FXML
    protected void onClickAtras(){
        FXService.cambiarVentana(FXService.VENTANA_MAIN);
    }
    private void limpiarCampos(){
        textFieldNombre.setText("");
        textFieldApellidos.setText("");
        textFieldDNI.setText("");
        choiceBoxEspecialidad.setValue(especialidades.getFirst());
        datePickerFechaCita.setValue(LocalDate.now());
        labelError.setText("");
    }
    private boolean validarCampos(){
        boolean correcto = false;
        String error = "";
        String nombre = textFieldNombre.getText();
        String apellidos = textFieldApellidos.getText();
        String dni = textFieldDNI.getText();
        String especialidad = choiceBoxEspecialidad.getValue();
        LocalDate fechaCita = datePickerFechaCita.getValue();
        if(nombre.isEmpty()||apellidos.isEmpty()||dni.isEmpty()||especialidad.isEmpty()||especialidad.equals(especialidades.getFirst())){
            error = "Debe rellenar todos los campos";
        }else if(fechaCita.isBefore(LocalDate.now())){
            error="La cita no puede ser anterior a la fecha actual";
        }else correcto = true;
        if(!error.isEmpty())labelError.setText(error);
        return correcto;
    }
}

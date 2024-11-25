package com.spacrod.pacheco_selene_t5_di.controller;

import com.spacrod.pacheco_selene_t5_di.service.FXService;
import com.spacrod.pacheco_selene_t5_di.service.FontService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class CocheElectricoController {
    @FXML
    private Label labelDatosCliente;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelApellidos;
    @FXML
    private Label labelTelefono;
    @FXML
    private Label labelDNI;
    @FXML
    private Label labelDatosReserva;
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
    private CheckBox checkBoxCableCarga;
    @FXML
    private ChoiceBox<String> choiceBoxKM;
    @FXML
    private Label labelServiciosExtra;
    @FXML
    private CheckBox checkBoxNoPrecisa;
    @FXML
    private CheckBox checkBoxSillaInfantil;
    @FXML
    private CheckBox checkBoxSeguroTodoRiesgo;
    @FXML
    private CheckBox checkBoxCancelacionGratuita;
    @FXML
    private CheckBox checkBoxCadenas;
    @FXML
    private Button buttonConfirmar;
    @FXML
    private Button buttonLimpiar;
    @FXML
    private Button buttonSalir;
    @FXML
    private Tooltip toolTipNombre;
    @FXML
    private Tooltip toolTipApellidos;
    @FXML
    private Tooltip toolTipTelefono;
    @FXML
    private Tooltip toolTipDNI;
    @FXML
    private Tooltip toolTipFechaInicio;
    @FXML
    private Tooltip toolTipFechaFin;
    @FXML
    private Tooltip toolTipTipoVehiculo;
    @FXML
    private Tooltip toolTipEdadConductor;
    @FXML
    private Tooltip toolTipCableCarga;
    @FXML
    private Tooltip toolTipKM;
    @FXML
    private Tooltip toolTipServiciosExtraUno;
    @FXML
    private Tooltip toolTipServiciosExtraDos;
    @FXML
    private Tooltip toolTipServiciosExtraTres;
    @FXML
    private Tooltip toolTipServiciosExtraCuatro;
    @FXML
    private Tooltip toolTipServiciosExtraCinco;
    @FXML
    private Tooltip toolTipLimpiar;
    @FXML
    private Tooltip toolTipSalir;
    @FXML
    private Tooltip toolTipConfirmar;

    private List<String> vehiculos;
    private List<Integer> edades;
    private List<String> kms;

    @FXML
    public void initialize(){
        //rellenamos los choiocebox
        vehiculos = new ArrayList<>();
        vehiculos.add("4x4");
        vehiculos.add("SUV");
        vehiculos.add("Pequeño");
        vehiculos.add("Mediano");
        vehiculos.add("Grande");
        edades = new ArrayList<>();
        for(int i = 18;i<=100;i++){
            edades.add(i);
        }
        kms = new ArrayList<>();
        kms.add("500-1000");
        kms.add("1000-1500");
        kms.add("1500-2500");
        kms.add("2500-5000");
        kms.add("5000+");
        choiceBoxTipoVehiculo.getItems().addAll(vehiculos);
        choiceBoxEdadConductor.getItems().addAll(edades);
        choiceBoxKM.getItems().addAll(kms);
        //ponemos los tooltips en los campos
        FXService.configureLabelWithMnemonic(labelNombre, textFieldNombre);
        FXService.configureLabelWithMnemonic(labelApellidos, textFieldApellidos);
        FXService.configureLabelWithMnemonic(labelTelefono, textFieldTelefono);
        FXService.configureLabelWithMnemonic(labelDNI, textFieldDNI);
        FXService.configureLabelWithMnemonic(labelFechaInicio, datePickerFechaInicio);
        FXService.configureLabelWithMnemonic(labelFechaFin, datePickerFechaFin);
        FXService.configureLabelWithMnemonic(labelTipoVehiculo, choiceBoxTipoVehiculo);
        FXService.configureLabelWithMnemonic(labelEdadConductor, choiceBoxEdadConductor);
        FXService.configureLabelWithMnemonic(labelKM, choiceBoxKM);

        //ponemos los predefinidos
        choiceBoxTipoVehiculo.setValue(vehiculos.getFirst());
        choiceBoxEdadConductor.setValue(edades.getFirst());
        choiceBoxKM.setValue(kms.getFirst());
        checkBoxNoPrecisa.setSelected(true);
        datePickerFechaInicio.setValue(LocalDate.now());
        datePickerFechaFin.setValue(LocalDate.now().plusDays(1));

        //aplicamos las fuentes
        FontService.applyFont(//fuente normal
                FontService.CUSTOM_PUMA_FONT_NORMAL,
                labelNombre,
                textFieldNombre,
                labelApellidos,
                textFieldApellidos,
                labelTelefono,
                textFieldTelefono,
                labelDNI,
                textFieldDNI,
                labelFechaInicio,
                datePickerFechaInicio,
                labelFechaFin,
                datePickerFechaFin,
                labelTipoVehiculo,
                choiceBoxTipoVehiculo,
                labelEdadConductor,
                choiceBoxEdadConductor,
                checkBoxCableCarga,
                labelKM,
                choiceBoxKM,
                checkBoxCadenas,
                checkBoxCancelacionGratuita,
                checkBoxSeguroTodoRiesgo,
                checkBoxSillaInfantil,
                checkBoxNoPrecisa,
                toolTipNombre,
                toolTipApellidos,
                toolTipTelefono,
                toolTipDNI,
                toolTipFechaInicio,
                toolTipFechaFin,
                toolTipTipoVehiculo,
                toolTipEdadConductor,
                toolTipCableCarga,
                toolTipKM,
                toolTipServiciosExtraUno,
                toolTipServiciosExtraDos,
                toolTipServiciosExtraTres,
                toolTipServiciosExtraCuatro,
                toolTipServiciosExtraCinco,
                toolTipLimpiar,
                toolTipSalir,
                toolTipConfirmar
        );
        FontService.applyFont(//fuente mediana
                FontService.CUSTOM_PUMA_FONT_MEDIUM,
                labelServiciosExtra,
                labelError
        );
        FontService.applyFont(//fuente grande
                FontService.CUSTOM_PUMA_FONT_BIG,
                labelDatosCliente,
                labelDatosReserva,
                buttonConfirmar,
                buttonLimpiar,
                buttonSalir
        );
    }
    @FXML
    protected void onClickCheckBoxNoPrecisa(){
        if(checkBoxNoPrecisa.isSelected()){
            checkBoxCadenas.setSelected(false);
            checkBoxCancelacionGratuita.setSelected(false);
            checkBoxSeguroTodoRiesgo.setSelected(false);
            checkBoxSillaInfantil.setSelected(false);
        }
    }
    @FXML
    protected void onClickOthersCheckBoxs(){
        checkBoxNoPrecisa.setSelected(false);
    }
    @FXML
    protected void onClickButtonSalir(){
        FXService.cambiarVentana(FXService.VENTANA_MAIN);
    }
    @FXML
    protected void onClickButtonConfirmar(){
        if(validateFields()){
            labelError.setText("Formulario enviado con éxito.");
            onClickButtonLimpiar();
        }
    }
    @FXML
    protected void onClickButtonLimpiar(){
        textFieldNombre.setText("");
        textFieldApellidos.setText("");
        textFieldTelefono.setText("");
        textFieldDNI.setText("");
        datePickerFechaInicio.setValue(LocalDate.now());
        datePickerFechaFin.setValue(LocalDate.now().plusDays(1));
        choiceBoxTipoVehiculo.setValue(vehiculos.getFirst());
        choiceBoxEdadConductor.setValue(edades.getFirst());
        checkBoxCableCarga.setSelected(false);
        choiceBoxKM.setValue(kms.getFirst());
        checkBoxNoPrecisa.setSelected(true);
        onClickCheckBoxNoPrecisa();
        labelError.setText("");
    }
    private boolean validateFields(){
        String warningMessage = "";
        if(!isValidDNI(textFieldDNI.getText())){
            warningMessage="DNI INVÁLIDO.";
        }
        if(containsNumbers(textFieldNombre.getText())){
            warningMessage="EL CAMPO NOMBRE NO PUEDE CONTENER NÚMEROS.";
        }
        if(containsNumbers(textFieldApellidos.getText())){
            warningMessage="EL CAMPO APELLIDOS NO PUEDE CONTENER NÚMEROS.";
        }
        if(!containsNumbers(textFieldTelefono.getText())){
            warningMessage="EL CAMPO TELÉFONO DEBE CONTENER NÚMEROS.";
        }

        if(!warningMessage.trim().isEmpty()){
            labelError.setText(warningMessage);
            return false;
        }
        return true;
    }
    private boolean isValidDNI(String dni) {
        String dniPattern = "\\d{8}[A-HJ-NP-TV-Z]";
        return Pattern.matches(dniPattern, dni);
    }
    private boolean containsNumbers(String input) {
        return input.matches(".*\\d.*");
    }
}

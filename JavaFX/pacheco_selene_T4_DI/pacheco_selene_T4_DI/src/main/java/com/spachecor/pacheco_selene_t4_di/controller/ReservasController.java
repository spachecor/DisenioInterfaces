package com.spachecor.pacheco_selene_t4_di.controller;

import com.spachecor.pacheco_selene_t4_di.util.AppNavigationService;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;

import java.util.regex.Pattern;

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
    private Label labelNumeroPersonas;
    @FXML
    private TextField textFieldNumeroPersonas;
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
    public void initialize() {
        AppNavigationService.setFont(customFontButton, labelDatosReserva, labelDatosCliente);
        AppNavigationService.setFont(customFontNormal, labelDNI, textFieldDNI, labelNombre, textFieldNombre,
                labelDireccion, textFieldDireccion, labelLocalidad, textFieldLocalidad,
                labelProvincia, textFieldProvincia, labelFechaEntrada, labelFechaSalida,
                labelNumeroHabitaciones, textFieldNumeroHabitaciones, labelNumeroPersonas, textFieldNumeroPersonas,
                labelTipoHabitacion, checkBoxfumador, radioButtonAlojamientoPension,
                radioButtonMediaPension, radioButtonPensionCompleta, buttonLimpiar,
                buttonAceptar, buttonCancelar);

        AppNavigationService.setFont(customFontMedium, labelRegimen, labelFumador, labelAviso);

        choiceBoxTipoHabitacion.setStyle("-fx-font-family: '" + customFontNormal.getFamily() + "'; -fx-font-size: " + customFontNormal.getSize() + ";");

        choiceBoxTipoHabitacion.getItems().addAll("Doble de uso individual", "Doble", "Junior Suite", "Suite");
        choiceBoxTipoHabitacion.setValue("Doble de uso individual");

        AppNavigationService.setTooltipWithFont(textFieldDNI, "Ingrese el DNI del cliente en formato correcto", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldNombre, "Ingrese el nombre completo del cliente", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldDireccion, "Ingrese la dirección de residencia del cliente", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldLocalidad, "Ingrese la localidad de residencia del cliente", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldProvincia, "Ingrese la provincia de residencia del cliente", customFontNormal);
        AppNavigationService.setTooltipWithFont(datePickerFechaEntrada, "Seleccione la fecha de entrada", customFontNormal);
        AppNavigationService.setTooltipWithFont(datePickerFechaSalida, "Seleccione la fecha de salida", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldNumeroHabitaciones, "Ingrese el número de habitaciones (máximo 10)", customFontNormal);
        AppNavigationService.setTooltipWithFont(textFieldNumeroPersonas, "Ingrese el número de personas (máximo 4)", customFontNormal);
        AppNavigationService.setTooltipWithFont(choiceBoxTipoHabitacion, "Seleccione el tipo de habitación", customFontNormal);
        AppNavigationService.setTooltipWithFont(checkBoxfumador, "Marque si el cliente es fumador", customFontNormal);
        AppNavigationService.setTooltipWithFont(radioButtonAlojamientoPension, "Seleccione si el régimen es Alojamiento y Desayuno", customFontNormal);
        AppNavigationService.setTooltipWithFont(radioButtonMediaPension, "Seleccione si el régimen es Media Pensión", customFontNormal);
        AppNavigationService.setTooltipWithFont(radioButtonPensionCompleta, "Seleccione si el régimen es Pensión Completa", customFontNormal);
        AppNavigationService.setTooltipWithFont(buttonLimpiar, "Limpia todos los campos", customFontNormal);
        AppNavigationService.setTooltipWithFont(buttonAceptar, "Confirma la reserva", customFontNormal);
        AppNavigationService.setTooltipWithFont(buttonCancelar, "Cancela y regresa al menú principal", customFontNormal);

        configureLabelWithMnemonic(labelDNI, "_DNI", textFieldDNI);// Alt+D para DNI
        configureLabelWithMnemonic(labelNombre, "_Nombre", textFieldNombre);// Alt+N para Nombre
        configureLabelWithMnemonic(labelDireccion, "Di_rección", textFieldDireccion);// Alt+R para Dirección
        configureLabelWithMnemonic(labelLocalidad, "_Localidad", textFieldLocalidad);// Alt+L para Localidad
        configureLabelWithMnemonic(labelProvincia, "_Provincia", textFieldProvincia);// Alt+P para Provincia
        configureLabelWithMnemonic(labelFechaEntrada, "F_echa de entrada", datePickerFechaEntrada);// Alt+E para Fecha de entrada
        configureLabelWithMnemonic(labelFechaSalida, "Fecha de _salida", datePickerFechaSalida);// Alt+S para Fecha de salida
        configureLabelWithMnemonic(labelNumeroHabitaciones, "_Número de habitaciones", textFieldNumeroHabitaciones);// Alt+H para Número de habitaciones
        configureLabelWithMnemonic(labelNumeroPersonas, "_Número de personas", textFieldNumeroPersonas);// Alt+U para Número de personas
        configureLabelWithMnemonic(labelTipoHabitacion, "_Tipo de habitación", choiceBoxTipoHabitacion);// Alt+T para Tipo de habitación
        configureLabelWithMnemonic(labelRegimen, "_Regimen", radioButtonAlojamientoPension);// Alt+G para Regimen
    }

    private void configureLabelWithMnemonic(Label label, String textWithMnemonic, Control control) {
        label.setText(textWithMnemonic);
        label.setMnemonicParsing(true);
        label.setLabelFor(control);

        if (control instanceof TextField) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof DatePicker) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof CheckBox) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof ChoiceBox) {
            label.setOnKeyPressed(event -> control.requestFocus());
        } else if (control instanceof RadioButton) {
            label.setOnKeyPressed(event -> control.requestFocus());
        }
    }

    @FXML
    protected void onButtonLimpiar() {
        textFieldDNI.setText("");
        textFieldNombre.setText("");
        textFieldDireccion.setText("");
        textFieldLocalidad.setText("");
        textFieldProvincia.setText("");
        datePickerFechaEntrada.getEditor().clear();
        datePickerFechaSalida.getEditor().clear();
        textFieldNumeroHabitaciones.setText("");
        textFieldNumeroPersonas.setText("");
        choiceBoxTipoHabitacion.setValue("");
        checkBoxfumador.setSelected(false);
        radioButtonAlojamientoPension.setSelected(true);
        labelFumador.setText("");
        labelAviso.setText("");
    }

    @FXML
    protected void onButtonCancelar() {
        AppNavigationService.cargarVista(AppNavigationService.menuPrincipalVista);
    }

    @FXML
    protected void onButtonAceptar() {
        if (validateFields()) {
            onButtonLimpiar();
            labelAviso.setText("La reserva ha sido realizada correctamente.");
        }
    }

    @FXML
    protected void onCheckBoxfumador() {
        if (checkBoxfumador.isSelected()) {
            labelFumador.setText("En virtud de la Ley de Sanidad se informa a los clientes de que sólo podrán fumar en las habitaciones\n" +
                    "reservadas para tal fin.");
        } else labelFumador.setText("");
    }

    private boolean validateFields() {
        String warningMessage = "";
        if (!isValidDNI(textFieldDNI.getText())) {
            warningMessage = "DNI inválido.";
        }
        if (containsNumbers(textFieldNombre.getText())) {
            warningMessage = "El campo Nombre no puede contener números.";
        }
        if (containsNumbers(textFieldLocalidad.getText())) {
            warningMessage = "El campo Localidad no puede contener números.";
        }
        if (containsNumbers(textFieldProvincia.getText())) {
            warningMessage = "El campo Provincia no puede contener números.";
        }
        if (datePickerFechaEntrada.getValue() == null || datePickerFechaSalida.getValue() == null ||
                datePickerFechaSalida.getValue().isBefore(datePickerFechaEntrada.getValue())) {
            warningMessage = "Fechas de entrada y salida inválidas.";
        }
        if (!isNumeric(textFieldNumeroHabitaciones.getText()) || Integer.parseInt(textFieldNumeroHabitaciones.getText()) > 10) {
            warningMessage = "Número de habitaciones inválido (máximo 10).";
        }
        if (textFieldNumeroPersonas.getText().isEmpty() || !isNumeric(textFieldNumeroPersonas.getText())) {
            warningMessage = "El campo Número de personas no puede estar vacío y debe contener solo números.";
        }
        if (textFieldDNI.getText().isEmpty() || textFieldNombre.getText().isEmpty() ||
                textFieldDireccion.getText().isEmpty() || textFieldLocalidad.getText().isEmpty() ||
                textFieldProvincia.getText().isEmpty() || datePickerFechaEntrada.getValue() == null ||
                datePickerFechaSalida.getValue() == null || textFieldNumeroHabitaciones.getText().isEmpty()) {
            warningMessage = "Todos los campos deben estar completos.";
        }

        if (!warningMessage.isEmpty()) {
            labelAviso.setText(warningMessage.toString());
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

    private boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
}

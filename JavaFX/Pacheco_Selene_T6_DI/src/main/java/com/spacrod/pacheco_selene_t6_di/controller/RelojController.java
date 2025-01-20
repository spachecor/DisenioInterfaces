package com.spacrod.pacheco_selene_t6_di.controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.*;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.util.Duration;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelojController {

    private final BooleanProperty is24HourFormat = new SimpleBooleanProperty(true);
    private final BooleanProperty isAlarmEnabled = new SimpleBooleanProperty(false);
    private final IntegerProperty alarmHour = new SimpleIntegerProperty();
    private final IntegerProperty alarmMinute = new SimpleIntegerProperty();
    private final StringProperty alarmMessage = new SimpleStringProperty("Alarm!");

    @FXML
    private Label timeLabel;
    @FXML
    private ToggleButton formatoToggleButton;
    @FXML
    private ToggleButton alarmToggleButton;
    @FXML
    private ChoiceBox<Integer> horaChoiceBox;
    @FXML
    private ChoiceBox<Integer> minutoChoiceBox;
    @FXML
    private TextField mensajeTextField;
    private Timeline clockTimeline;

    @FXML
    protected void initialize() {
        // Actualizar el reloj cada segundo
        clockTimeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateClock()));
        clockTimeline.setCycleCount(Animation.INDEFINITE);
        clockTimeline.play();

        // Establecer el formato inicial
        updateClock();

        // Configurar las propiedades del reloj
        this.set24HourFormat(false); // Formato de 12 horas
        this.setAlarmEnabled(false); // Desactivar la alarma
        this.rellenarChoiceBoxs();
    }

    @FXML
    private void onClickFormatoToggleButton(){
        if(this.is24HourFormat.get()) {
            this.set24HourFormat(false);
            this.formatoToggleButton.setText("Formato 12 horas");
        }else{
            this.set24HourFormat(true);
            this.formatoToggleButton.setText("Formato 24 horas");
        }
        this.rellenarChoiceBoxs();
    }

    @FXML
    private void onClickAlarmToggleButton(){
        if(this.isAlarmEnabled()){
            this.setAlarmEnabled(false);
            this.alarmToggleButton.setText("Alarma desactivada");
        }else{
            if(!this.mensajeTextField.getText().isEmpty()){
                this.setAlarmEnabled(true);
                this.setAlarmHour(this.horaChoiceBox.getValue());
                this.setAlarmMinute(this.minutoChoiceBox.getValue());
                this.setAlarmMessage(this.mensajeTextField.getText());
                this.alarmToggleButton.setText("Alarma activada");
            }else{
                JOptionPane.showMessageDialog(null, "Debes introducir un mensaje!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void updateClock() {
        LocalTime now = LocalTime.now();
        String pattern = this.is24HourFormat() ? "HH:mm:ss" : "hh:mm:ss a";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        timeLabel.setText(now.format(formatter));

        // Verificar si la alarma está activada
        if (isAlarmEnabled.get()) {
            int currentHour = now.getHour();
            int alarmHourValue = alarmHour.get();

            if (!this.is24HourFormat()) {
                String period = now.getHour() >= 12 ? "PM" : "AM";
                if (period.equals("PM") && alarmHourValue < 12) {
                    alarmHourValue += 12; // Convertir a formato de 24 horas
                } else if (period.equals("AM") && alarmHourValue == 12) {
                    alarmHourValue = 0; // Medianoche
                }
            }

            if (currentHour == alarmHourValue && now.getMinute() == alarmMinute.get()) {
                triggerAlarm();
            }
        }
    }

    private void rellenarChoiceBoxs() {
        List<Integer> horas = new ArrayList<>();
        List<Integer> minutos = new ArrayList<>();
        if (this.is24HourFormat()) {
            for (int i = 0; i < 24; i++) {
                horas.add(i);
            }
        } else {
            for (int i = 0; i <= 12; i++) {
                horas.add(i);
            }
        }
        for (int i = 0; i < 60; i++) {
            minutos.add(i);
        }

        this.horaChoiceBox.getItems().clear();
        this.horaChoiceBox.getItems().addAll(horas);
        this.horaChoiceBox.setValue(horas.get(0));
        this.minutoChoiceBox.getItems().clear();
        this.minutoChoiceBox.getItems().addAll(minutos);
        this.minutoChoiceBox.setValue(minutos.get(0));
    }

    private void triggerAlarm() {
        JOptionPane.showMessageDialog(null, this.getAlarmMessage(), "Alarma", JOptionPane.INFORMATION_MESSAGE);
        this.onClickAlarmToggleButton();
        this.horaChoiceBox.getSelectionModel().select(0);
        this.minutoChoiceBox.getSelectionModel().select(0);
        this.mensajeTextField.clear();
    }

    // Getters y setters para las propiedades

    public boolean is24HourFormat() {
        return is24HourFormat.get();
    }

    public void set24HourFormat(boolean is24HourFormat) {
        this.is24HourFormat.set(is24HourFormat);
    }

    public BooleanProperty is24HourFormatProperty() {
        return is24HourFormat;
    }

    public boolean isAlarmEnabled() {
        return isAlarmEnabled.get();
    }

    public void setAlarmEnabled(boolean isAlarmEnabled) {
        this.isAlarmEnabled.set(isAlarmEnabled);
    }

    public BooleanProperty isAlarmEnabledProperty() {
        return isAlarmEnabled;
    }

    public int getAlarmHour() {
        return alarmHour.get();
    }

    public void setAlarmHour(int alarmHour) {
        this.alarmHour.set(alarmHour);
    }

    public IntegerProperty alarmHourProperty() {
        return alarmHour;
    }

    public int getAlarmMinute() {
        return alarmMinute.get();
    }

    public void setAlarmMinute(int alarmMinute) {
        this.alarmMinute.set(alarmMinute);
    }

    public IntegerProperty alarmMinuteProperty() {
        return alarmMinute;
    }

    public String getAlarmMessage() {
        return alarmMessage.get();
    }

    public void setAlarmMessage(String alarmMessage) {
        this.alarmMessage.set(alarmMessage);
    }

    public StringProperty alarmMessageProperty() {
        return alarmMessage;
    }
}

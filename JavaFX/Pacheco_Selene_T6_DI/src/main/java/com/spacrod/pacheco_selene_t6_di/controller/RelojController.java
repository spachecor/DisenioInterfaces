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
        this.rellenarChoiceBoxs();
        // Actualizar el reloj cada segundo
        clockTimeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateClock()));
        clockTimeline.setCycleCount(Animation.INDEFINITE);
        clockTimeline.play();

        // Establecer el formato inicial
        updateClock();

        // Configurar las propiedades del reloj
        this.set24HourFormat(false); // Formato de 12 horas
        this.setAlarmEnabled(false); // Desactivar la alarma
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
                System.out.println("NO SE PUEDE PUTO");
            }
        }
    }

    private void updateClock() {
        LocalTime now = LocalTime.now();
        String pattern = this.is24HourFormat()?"hh:mm:ss":"hh:mm:ss a";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        timeLabel.setText(now.format(formatter));

        // Verificar si la alarma está activada
        if (isAlarmEnabled.get() && now.getHour() == alarmHour.get() && now.getMinute() == alarmMinute.get()) {
            triggerAlarm();
        }
    }

    private void triggerAlarm() {
        System.out.println(this.getAlarmMessage());
        this.onClickAlarmToggleButton();
        this.horaChoiceBox.getSelectionModel().select(0);
        this.minutoChoiceBox.getSelectionModel().select(0);
        this.mensajeTextField.clear();
    }

    private void rellenarChoiceBoxs() {
        List<Integer> horas = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            horas.add(i);
        }
        List<Integer> minutos = new ArrayList<>();
        for (int i = 1; i <= 59; i++) {
            minutos.add(i);
        }
        this.horaChoiceBox.getItems().clear();
        this.horaChoiceBox.getItems().addAll(horas);
        this.horaChoiceBox.setValue(horas.getFirst());
        this.minutoChoiceBox.getItems().clear();
        this.minutoChoiceBox.getItems().addAll(minutos);
        this.minutoChoiceBox.setValue(minutos.getFirst());
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

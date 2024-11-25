package com.spacrod.pacheco_selene_t5_di.service;

import javafx.scene.control.*;
import javafx.scene.text.Font;

public class FontService {
    public static final Font CUSTOM_PUMA_FONT_NORMAL = Font.loadFont(FontService.class.getResourceAsStream("/com/spacrod/pacheco_selene_t5_di/fonts/mypuma.ttf"), 14);
    public static final Font CUSTOM_PUMA_FONT_MEDIUM = Font.loadFont(FontService.class.getResourceAsStream("/com/spacrod/pacheco_selene_t5_di/fonts/mypuma.ttf"), 18);
    public static final Font CUSTOM_PUMA_FONT_BIG = Font.loadFont(FontService.class.getResourceAsStream("/com/spacrod/pacheco_selene_t5_di/fonts/mypuma.ttf"), 24);

    public static void applyFont(Font font, Object... nodes) {
        for(Object node : nodes) {
            if (node == null || font == null) {
                throw new IllegalArgumentException("El nodo o la fuente no pueden ser nulos.");
            }
            //verificamos el tipo del nodo y aplica la fuente correspondiente
            switch (node) {
                case Labeled labeled ->  //Labels, Buttons, CheckBox, RadioButton, etc.
                        labeled.setFont(font);
                case TextInputControl textInputControl ->  //TextField, TextArea, etc.
                        textInputControl.setFont(font);
                case ChoiceBox<?> choiceBox ->  //ChoiceBox
                        choiceBox.setStyle("-fx-font-family: '" + font.getFamily() + "'; -fx-font-size: " + font.getSize() + "px;");
                case ComboBox<?> comboBox ->  //ComboBox
                        comboBox.setStyle("-fx-font-family: '" + font.getFamily() + "'; -fx-font-size: " + font.getSize() + "px;");
                case Tooltip tooltip ->  //Tooltip
                        tooltip.setFont(font);
                case DatePicker datePicker ->  //DatePicker
                        datePicker.setStyle("-fx-font-family: '" + font.getFamily() + "'; -fx-font-size: " + font.getSize() + "px;");
                case MenuBar menuBar ->
                        menuBar.setStyle("-fx-font-family: '" + font.getFamily() + "'; -fx-font-size: " + font.getSize() + "px;");
                default ->
                        throw new IllegalArgumentException("El tipo de nodo no es compatible: " + node.getClass().getSimpleName());
            }
        }
    }
}

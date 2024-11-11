module com.spachecor.pacheco_selene_t4_di {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spachecor.pacheco_selene_t4_di to javafx.fxml;
    exports com.spachecor.pacheco_selene_t4_di;
    exports com.spachecor.pacheco_selene_t4_di.controller;
    opens com.spachecor.pacheco_selene_t4_di.controller to javafx.fxml;
}
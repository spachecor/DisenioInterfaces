module com.spacrod.pacheco_selene_examen_di {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spacrod.pacheco_selene_examen_di to javafx.fxml;
    exports com.spacrod.pacheco_selene_examen_di;
    exports com.spacrod.pacheco_selene_examen_di.controllers;
    opens com.spacrod.pacheco_selene_examen_di.controllers to javafx.fxml;
}
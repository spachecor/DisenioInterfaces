module com.spacrod.ejerciciouno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spacrod.ejerciciouno to javafx.fxml;
    exports com.spacrod.ejerciciouno;
    exports com.spacrod.ejerciciouno.controller;
    opens com.spacrod.ejerciciouno.controller to javafx.fxml;
}
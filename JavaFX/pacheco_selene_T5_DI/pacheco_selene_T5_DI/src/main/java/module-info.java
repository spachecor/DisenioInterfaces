module com.spacrod.pacheco_selene_t5_di {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spacrod.pacheco_selene_t5_di to javafx.fxml;
    exports com.spacrod.pacheco_selene_t5_di;
    exports com.spacrod.pacheco_selene_t5_di.controller;
    opens com.spacrod.pacheco_selene_t5_di.controller to javafx.fxml;
}
module com.spacrod.pacheco_selene_t6_di {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.spacrod.pacheco_selene_t6_di to javafx.fxml;
    exports com.spacrod.pacheco_selene_t6_di;
    exports com.spacrod.pacheco_selene_t6_di.controller;
    opens com.spacrod.pacheco_selene_t6_di.controller to javafx.fxml;
}
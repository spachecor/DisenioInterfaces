module com.spacrod.pacheco_selene_t6_di {
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.controls;


    opens com.spacrod.pacheco_selene_t6_di.creacion to javafx.fxml;
    exports com.spacrod.pacheco_selene_t6_di.creacion;
    opens com.spacrod.pacheco_selene_t6_di.controller to javafx.fxml;
}
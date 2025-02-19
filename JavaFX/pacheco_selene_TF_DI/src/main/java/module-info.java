module com.spachecor.pacheco_selene_tf_di {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.desktop;

    opens com.spachecor.pacheco_selene_tf_di to javafx.fxml;
    exports com.spachecor.pacheco_selene_tf_di;
    exports com.spachecor.pacheco_selene_tf_di.controller;
    opens com.spachecor.pacheco_selene_tf_di.controller to javafx.fxml;
    exports com.spachecor.pacheco_selene_tf_di.model.entity;
    opens com.spachecor.pacheco_selene_tf_di.model.entity;
}
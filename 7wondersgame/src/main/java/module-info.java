module com.example.sevenwondersgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.sevenwondersgame to javafx.fxml;
    exports com.example.sevenwondersgame;
    exports com.example.sevenwondersgame.controller;
    opens com.example.sevenwondersgame.controller to javafx.fxml;
    exports com.example.sevenwondersgame.models;
    opens com.example.sevenwondersgame.models to javafx.fxml;
}
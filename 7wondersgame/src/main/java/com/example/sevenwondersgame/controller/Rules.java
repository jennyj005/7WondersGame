package com.example.sevenwondersgame.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Rules {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
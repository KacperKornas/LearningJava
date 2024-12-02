package com.example.section25javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setTextFill(Color.GREEN);
        welcomeText.setText("Welcome to JavaFX!");
        welcomeText.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
    }
}
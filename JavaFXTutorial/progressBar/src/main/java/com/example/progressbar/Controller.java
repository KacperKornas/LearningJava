package com.example.progressbar;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller {

    @FXML
    Label myLabel;
    @FXML
    ProgressBar myProgressBar;
    @FXML
    Button myButton;
    double progress = 0;

    public void increaseProgress(){
        if (progress < 0.99) {
            myProgressBar.setProgress(progress += 0.1);
            myLabel.setText(String.format("%.0f", progress * 100) + "%");
            myProgressBar.setStyle("-fx-accent: green;");
        } else {
            myButton.setDisable(true);
        }
    }

}

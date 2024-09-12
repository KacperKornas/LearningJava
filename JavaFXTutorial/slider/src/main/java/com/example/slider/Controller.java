package com.example.slider;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Label myLabel;
    @FXML
    Slider mySlider;

    public void getTemperature() {
        String temperature = String.format("%.1f",mySlider.getValue()) + " °C";
        myLabel.setText(temperature);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            getTemperature();
        });
        getTemperature();
    }
}

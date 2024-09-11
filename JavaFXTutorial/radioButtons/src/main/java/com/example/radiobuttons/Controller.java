package com.example.radiobuttons;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    RadioButton radio1, radio2, radio3;
    @FXML
    Label myLabel;

    public void select() {

        if (radio1.isSelected()) {
            myLabel.setText("pizza");
        } else if (radio2.isSelected()) {
            myLabel.setText("sushi");
        } else if (radio3.isSelected()) {
            myLabel.setText("ramen");
        }
    }
}

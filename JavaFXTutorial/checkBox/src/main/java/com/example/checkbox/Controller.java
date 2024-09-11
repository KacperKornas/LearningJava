package com.example.checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    ImageView myImageView;
    @FXML
    CheckBox myCheckBox;
    @FXML
    Label myLabel;

    Image imageON = new Image(getClass().getResourceAsStream("on.png"));
    Image imageOFF = new Image(getClass().getResourceAsStream("off.png"));

    public void displayImageON() {
        myImageView.setImage(imageON);
    }

    public void displayImageOFF() {
        myImageView.setImage(imageOFF);
    }

    public void change () {
        if (myCheckBox.isSelected()) {
            displayImageON();
            myLabel.setText("ON");
        }
        else {
            displayImageOFF();
            myLabel.setText("OFF");
        }
    }
}

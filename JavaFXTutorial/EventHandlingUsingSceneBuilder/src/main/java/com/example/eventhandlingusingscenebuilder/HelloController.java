package com.example.eventhandlingusingscenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class HelloController {

    int pixels = 10;

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    @FXML
    public void UP(ActionEvent e) {
        //System.out.println("UP");
        myCircle.setCenterY(y -= pixels);
    }
    public void DOWN(ActionEvent e) {
        myCircle.setCenterY(y += pixels);
        //System.out.println("down");}
    }
    public void RIGHT(ActionEvent e) {
        myCircle.setCenterX(x += pixels);
        //System.out.println("RIGHT");
    }
    public void LEFT(ActionEvent e) {
        myCircle.setCenterX(x -= pixels);
        //System.out.println("LEFT");
    }

}
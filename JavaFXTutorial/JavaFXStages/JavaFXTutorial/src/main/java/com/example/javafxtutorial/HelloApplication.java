package com.example.javafxtutorial;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root, Color.PINK);


        Image icon = new Image("Kilo_flag.svg.png");
        stage.getIcons().addAll(icon);
        stage.setTitle("MKS");
        stage.setWidth(1020);
        stage.setHeight(820);
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }
}

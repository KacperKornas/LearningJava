package com.example.mediaview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.MediaView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button playButton, pauseButton, resetButton;
    @FXML
    private MediaView mediaView;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        file = new File("C:\\Users\\Kacper\\Desktop\\java_work\\JavaFXTutorial\\mediaView\\src\\main\\resources\\com\\example\\mediaview\\videoplayback.mp4");
        media = new Media(file.toURI().toString());


    }

    public void playMedia() {

    }
    public void pauseMedia() {

    }
    public void resetMedia() {

    }
}

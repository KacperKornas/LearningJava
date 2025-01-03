package com.example.webbrowser;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private WebView webView;
    @FXML
    private TextField textField;
    private WebEngine engine;
    private WebHistory history;
    private String homePage;
    private double webZoom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            engine = webView.getEngine();
            homePage = "www.google.com";
            textField.setText(homePage);
            webZoom = 1;
            loadPage();
        }
        public void loadPage() {

//        engine.load("http://www.google.com");
        engine.load("http://" + textField.getText());
    }

        public void refreshPage() {
            engine.reload();
        }

        public void zoomIN() {
            webView.setZoom(webZoom += 0.25);
        }
        public void zoomOut() {
            webView.setZoom(webZoom -= 0.25);
        }
        public void displayHistory() {

            history = engine.getHistory();
            ObservableList<WebHistory.Entry> entries = history.getEntries();

            for(WebHistory.Entry entry : entries) {

//                System.out.println(entry);
                System.out.println(entry.getUrl() + " " + entry.getLastVisitedDate());
            }
        }
        public void back() {

            history = engine.getHistory();
            ObservableList<WebHistory.Entry> entries = history.getEntries();
            history.go(-1);
            textField.setText(entries.get(history.getCurrentIndex()).getUrl());
        }
        public void forward() {

            history = engine.getHistory();
            ObservableList<WebHistory.Entry> entries = history.getEntries();
            history.go(1);
            textField.setText(entries.get(history.getCurrentIndex()).getUrl());
        }

        public void executeJS() {

            engine.executeScript("window.location = \"https://www.youtube.com\";");
        }
}

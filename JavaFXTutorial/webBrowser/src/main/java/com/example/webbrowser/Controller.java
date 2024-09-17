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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

            engine = webView.getEngine();
            loadPage();
        }
        public void loadPage() {

    }
}

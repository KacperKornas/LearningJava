module com.example.webbrowser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.web;


    opens com.example.webbrowser to javafx.fxml;
    exports com.example.webbrowser;
}
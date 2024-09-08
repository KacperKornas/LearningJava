module com.example.eventhandlingusingscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventhandlingusingscenebuilder to javafx.fxml;
    exports com.example.eventhandlingusingscenebuilder;
}
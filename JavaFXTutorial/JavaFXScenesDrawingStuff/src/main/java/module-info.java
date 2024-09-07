module com.example.javafxscenesdrawingstuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxscenesdrawingstuff to javafx.fxml;
    exports com.example.javafxscenesdrawingstuff;
}
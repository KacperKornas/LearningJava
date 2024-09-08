module com.example.switchscenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.switchscenes to javafx.fxml;
    exports com.example.switchscenes;
}
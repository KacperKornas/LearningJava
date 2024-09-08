module com.example.installscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.installscenebuilder to javafx.fxml;
    exports com.example.installscenebuilder;
}
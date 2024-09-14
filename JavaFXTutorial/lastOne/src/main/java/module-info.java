module com.example.lastone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lastone to javafx.fxml;
    exports com.example.lastone;
}
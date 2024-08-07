module com.example.section25javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section25javafx to javafx.fxml;
    exports com.example.section25javafx;
}
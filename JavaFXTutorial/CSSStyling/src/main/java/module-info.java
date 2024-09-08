module com.example.cssstyling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cssstyling to javafx.fxml;
    exports com.example.cssstyling;
}
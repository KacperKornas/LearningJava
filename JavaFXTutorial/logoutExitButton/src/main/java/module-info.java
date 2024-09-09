module com.example.logoutexitbutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logoutexitbutton to javafx.fxml;
    exports com.example.logoutexitbutton;
}
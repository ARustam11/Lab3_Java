module com.example.lab3_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab3_java to javafx.fxml;
    exports com.example.lab3_java;
}
package com.example.lab3_java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField contactNumberField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private Label validationResultLabel;

    @FXML
    public void validateInput() {
        String username = nameField.getText().trim();
        String contactNumber = contactNumberField.getText().trim();
        String postalCode = postalCodeField.getText().trim();

        if (!isValidUsername(username)) {
            validationResultLabel.setText("The first character must be an uppercase letter ([A-Z])\nand username should contain only letters");
            return;
        }

        if (!isValidContactNumber(contactNumber)) {
            validationResultLabel.setText("The contact number must be exactly 10 digits long\nand contain only numeric characters");
            return;
        }

        if (!isValidPostalCode(postalCode)) {
            validationResultLabel.setText("Postal code must be in valid Canadian format");
            return;
        }

        validationResultLabel.setText("Validation Successful");
    }

    private boolean isValidUsername(String username) {
        return username.matches("[A-Z][a-zA-Z]*");
    }

    private boolean isValidContactNumber(String contactNumber) {
        return contactNumber.matches("\\d{10}") || contactNumber.matches("\\(\\d{3}\\) \\d{3} \\d{4}") || contactNumber.matches("\\d{3} \\d{3} \\d{4}");
    }

    private boolean isValidPostalCode(String postalCode) {
        return postalCode.matches("[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d");
    }
}
package com.nvt.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class MyAlert {
    private static MyAlert instance;
    private final Alert alert = new Alert(Alert.AlertType.INFORMATION);

    private MyAlert() {
        this.alert.setTitle("Quiz App");
        this.alert.setHeaderText(null);
    }

    public static MyAlert getInstance() {
        if (instance == null)
            instance = new MyAlert();
        return instance;
    }

    public void showMsg(String msg) {
        this.alert.setContentText(msg);
        this.alert.showAndWait();
    }

    public Optional<ButtonType> showMsg(String msg, Alert.AlertType alertType) {
        this.alert.setAlertType(alertType);
        this.alert.setContentText(msg);
        return this.alert.showAndWait();
    }
}
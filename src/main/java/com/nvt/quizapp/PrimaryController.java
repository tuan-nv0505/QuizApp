package com.nvt.quizapp;

import com.nvt.utils.MyAlert;
import com.nvt.utils.MyStage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import com.nvt.quizapp.AppJavaFX;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class PrimaryController {
    @FXML
    public void handleButtonManageQuestion(javafx.event.ActionEvent actionEvent) throws IOException {
        MyStage.getInstance().show("ManageQuestion.fxml");
    }

    @FXML
    public void handleButtonPractice(javafx.event.ActionEvent actionEvent) {
        Optional<ButtonType> result = MyAlert.getInstance().showMsg("Tiếp tục!!", Alert.AlertType.CONFIRMATION);
    }
}
package com.nvt.utils;

import com.nvt.quizapp.AppJavaFX;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MyStage {
    private static MyStage instance;
    private final Stage stage = new Stage();
    private Scene scene;

    private MyStage() {
        this.stage.setTitle("Quiz App");
    }

    public static MyStage getInstance() {
        if (instance == null)
            instance = new MyStage();
        return instance;
    }

    public void show(String fxml) throws IOException {
        if (scene == null)
            scene = new Scene(new FXMLLoader(AppJavaFX.class.getResource(fxml)).load());
        else
            scene.setRoot(new FXMLLoader(AppJavaFX.class.getResource(fxml)).load());
        this.stage.setScene(scene);
        this.stage.show();
    }
}

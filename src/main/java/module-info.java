module com.nvt.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.nvt.quizapp to javafx.fxml;
    exports com.nvt.quizapp;
}
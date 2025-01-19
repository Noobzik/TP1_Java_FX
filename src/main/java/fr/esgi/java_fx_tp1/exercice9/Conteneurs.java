package fr.esgi.java_fx_tp1.exercice9;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Conteneurs extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            BorderPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/exercice10/ConteneursView.fxml")));
            stage.setScene(new Scene(root));
            stage.setTitle("Premier exemple manipulant les conteneurs");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package fr.esgi.java_fx_tp1.exercice6;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class CounterController implements Initializable {

    int counter = 0;

    public void increment() {
    }

    public void decrement() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing CounterController...");
    }
}
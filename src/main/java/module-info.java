module fr.esgi.java_fx_tp1 {
    requires javafx.controls;
    requires javafx.fxml;


    exports fr.esgi.java_fx_tp1.exercice1;
    exports fr.esgi.java_fx_tp1.exercice2;
    exports fr.esgi.java_fx_tp1.exercice3;
    exports fr.esgi.java_fx_tp1.exercice4;
    exports fr.esgi.java_fx_tp1.exercice5;
    exports fr.esgi.java_fx_tp1.exercice6;
    exports fr.esgi.java_fx_tp1.exercice7;
    exports fr.esgi.java_fx_tp1.exercice8;
    exports fr.esgi.java_fx_tp1.exercice9;


    opens fr.esgi.java_fx_tp1.exercice1 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice2 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice3 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice4 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice5 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice6 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice7 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice8 to javafx.fxml;
    opens fr.esgi.java_fx_tp1.exercice9 to javafx.fxml;
}
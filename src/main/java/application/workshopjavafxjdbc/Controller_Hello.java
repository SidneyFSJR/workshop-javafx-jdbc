package application.workshopjavafxjdbc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller_Hello {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
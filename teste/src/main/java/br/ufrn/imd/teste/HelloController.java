package br.ufrn.imd.teste;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to my application!");
    }

    @FXML
    private javafx.scene.control.Button closeButton;

    @FXML
    public void close() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}
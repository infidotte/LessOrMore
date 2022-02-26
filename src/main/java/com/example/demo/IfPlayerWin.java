package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IfPlayerWin {

    @FXML
    private Button exit;

    @FXML
    private Button newGame;

    @FXML
    private AnchorPane scenePaneWin;

    @FXML
    private Label text;

    Stage stageWin;

    @FXML
    protected void onExitButton(){
        javafx.application.Platform.exit();
    }

    @FXML
    protected void onNewGameButton(){
        stageWin = (Stage) scenePaneWin.getScene().getWindow();
        stageWin.close();
        System.out.println("Winer is closed and start new game");
    }
}

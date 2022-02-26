package com.example.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.example.demo.HelloController;
import javafx.stage.WindowEvent;

public class IfPlayerLie {

    @FXML
    private Label text;

    @FXML
    private Button exit;

    @FXML
    private Button newGame;

    @FXML
    private AnchorPane scenePaneLier;
    
    Stage stageLier;

    @FXML
    protected void onNewGameButton(){
        stageLier = (Stage) scenePaneLier.getScene().getWindow();
        stageLier.close();
        System.out.println("Lier is closed and start new game");
    }

    @FXML
    protected void onExitButton(){
        javafx.application.Platform.exit();
    }
}

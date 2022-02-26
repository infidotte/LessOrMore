package com.example.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.css.Stylesheet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class HelloController {

    @FXML
    private MenuButton themeMenu;

    @FXML
    private MenuItem themeOne;

    @FXML
    protected void onThemeOneButton(){
        stage = (Stage) scenePane.getScene().getWindow();
        colorPane.setStyle("-fx-background-color: #79553D");
        stage.getScene().getStylesheets().clear();
        stage.getScene().getStylesheets().add("theme1.css");

    }

    @FXML
    private MenuItem themeTwo;

    @FXML
    protected void onThemeTwoButton(){
        colorPane.setStyle("-fx-background-color: #44944A");
        stage.getScene().getStylesheets().clear();
        stage.getScene().getStylesheets().add("theme2.css");

    }

    @FXML
    private MenuItem themeThree;

    @FXML
    protected void onThemeThreeButton(){

        colorPane.setStyle("-fx-background-color: #fafafa");
        stage = (Stage) scenePane.getScene().getWindow();
        stage.getScene().getStylesheets().clear();
    }
//#44944A
//        scenePane.setStyle("-fx-background-color: #44944A");
    @FXML
    private Button equal;

    @FXML
    private Pane colorPane;

    @FXML
    private TextField lb;

    @FXML
    private Button less;

    @FXML
    private Button more;

    @FXML
    private TextField num;

    @FXML
    private TextField rb;

    @FXML
    private Button start;

    @FXML
    private TextField text;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    @FXML
    protected void onEqualButton() throws IOException {
        if(num.getText() == "" || lb.getText() == "" || rb.getText() == ""){
            text.setText("Set numbers");
            rb.setText("");
            lb.setText("");
            num.setText("");
        }else {
            if (Integer.parseInt(num.getText()) != Integer.parseInt(text.getText())) {
                FXMLLoader loader = new FXMLLoader(IfPlayerLie.class.getResource("if-player-lie.fxml"));
                Scene secondScene = new Scene(loader.load());
                Stage newWindow = new Stage();
                newWindow.initModality(Modality.WINDOW_MODAL);
                newWindow.initOwner(scenePane.getScene().getWindow());
                newWindow.setTitle("You're lier!");
                newWindow.setScene(secondScene);
                newWindow.show();
                text.setText("Set numbers");
                rb.setText("");
                lb.setText("");
                num.setText("");
            } else {
                FXMLLoader loader = new FXMLLoader(IfPlayerLie.class.getResource("if-player-win.fxml"));
                Scene secondScene = new Scene(loader.load());
                Stage newWindow = new Stage();
                newWindow.initModality(Modality.WINDOW_MODAL);
                newWindow.initOwner(scenePane.getScene().getWindow());
                newWindow.setTitle("You're win!");
                newWindow.setScene(secondScene);
                newWindow.show();
                text.setText("Set numbers");
                rb.setText("");
                lb.setText("");
                num.setText("");
            }
        }
    }
    @FXML
    protected void onStartButton(){
        if(num.getText() == "" || lb.getText() == "" || rb.getText() == ""){
            text.setText("Set number");
            rb.setText("");
            lb.setText("");
            num.setText("");
        }else {
            int getNum = Integer.parseInt(num.getText());
            int getLb = Integer.parseInt(lb.getText());
            int getRb = Integer.parseInt(rb.getText());
            if (getNum > getLb && getNum < getRb) {
                int result = Integer.parseInt(lb.getCharacters().toString()) + (Integer.parseInt(rb.getCharacters().toString()) - Integer.parseInt(lb.getCharacters().toString())) / 2;
                text.setText(Integer.toString(result));
            } else {
                text.setText("Wrong number");
                rb.setText("");
                lb.setText("");
                num.setText("");
            }
        }
    }

    @FXML
    protected void onLessButton(){
        if(num.getText() == "" || lb.getText() == "" || rb.getText() == ""){
            text.setText("Set numbers");
            rb.setText("");
            lb.setText("");
            num.setText("");
        }else {
            int getNum = Integer.parseInt(num.getText());
            int getText = Integer.parseInt(text.getText());
            if(getNum!=getText){
                rb.setText(text.getText());
                int result = Integer.parseInt(lb.getCharacters().toString()) + (Integer.parseInt(rb.getCharacters().toString()) - Integer.parseInt(lb.getCharacters().toString())) / 2;
                text.setText(Integer.toString(result));
            }else{
                text.setText("Lier");
                rb.setText("");
                lb.setText("");
                num.setText("");
            }

        }
    }

    @FXML
    protected void onMoreButton(){
        if(num.getText() == "" || lb.getText() == "" || rb.getText() == ""){
            text.setText("Set numbers");
            rb.setText("");
            lb.setText("");
            num.setText("");
        }else {
            int getNum = Integer.parseInt(num.getText());
            int getText = Integer.parseInt(text.getText());
            if(getNum!=getText){
                lb.setText(text.getText());
                int result = Integer.parseInt( lb.getCharacters().toString()) + (Integer.parseInt( rb.getCharacters().toString()) - Integer.parseInt( lb.getCharacters().toString()))/2;
                text.setText(Integer.toString(result));
            }else{
                text.setText("Lier");
                rb.setText("");
                lb.setText("");
                num.setText("");
            }

        }
    }
    @FXML
    protected void onExitButton(ActionEvent event){
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
        System.out.println("Application is closed");
    }

}
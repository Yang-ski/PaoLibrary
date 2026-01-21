package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class initialNavBar {

    @FXML
    private Button aboutButton;

    @FXML
    private Button branchesButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button loginButton;

    @FXML
    private StackPane nestedUI;

    @FXML
    public void initialize() {
        try {
            AnchorPane nestedHome = FXMLLoader.load(getClass().getResource("/com/example/fxml/nestedInitialHome.fxml"));
            nestedUI.getChildren().add(nestedHome);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void returnAbout(ActionEvent event) {
        try {
            nestedUI.getChildren().clear();
            AnchorPane aboutPane = FXMLLoader.load(getClass().getResource("/com/example/fxml/nestedAbout.fxml"));
            nestedUI.getChildren().add(aboutPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void returnBranches(ActionEvent event) {
        try {
            nestedUI.getChildren().clear();
            AnchorPane branchesPane = FXMLLoader.load(getClass().getResource("/com/example/fxml/nestedBranches.fxml"));
            nestedUI.getChildren().add(branchesPane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void returnHome(ActionEvent event) {
        try {
            nestedUI.getChildren().clear();
            AnchorPane homePane = FXMLLoader.load(getClass().getResource("/com/example/fxml/nestedInitialHome.fxml"));
            nestedUI.getChildren().add(homePane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void returnLogin(ActionEvent event) {
        try {
            App.setRoot("fxml/memberNavBar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

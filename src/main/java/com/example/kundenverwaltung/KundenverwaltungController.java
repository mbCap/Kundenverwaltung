package com.example.kundenverwaltung;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class KundenverwaltungController implements Initializable {
    @FXML
    Button ende;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ende.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                System.exit(0);
            }
        });

    }
}
package com.example.projecttesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ZoneNameController {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private TextField filterField;
    private TableView<Plant> tableView;
    private TableColumn<Plant, String> plantName;
    private TableColumn<Plant, String> zone;
    private TableColumn<Plant, String> height;
    private TableColumn<Plant, String> width;
    private TableColumn<Plant, String> sunlight;


    public void back(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ZonePick.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have gone back");
    }



}

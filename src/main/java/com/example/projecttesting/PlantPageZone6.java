package com.example.projecttesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

////Controller for showing Plants for Zone 6

public class PlantPageZone6 {
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    ImageView flowerPic;


    //Display Plant Image
    public void displayPicture(Image flower) {
        flowerPic.setImage(flower);
    }


    //Back Button
    public void back(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ZoneSixScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

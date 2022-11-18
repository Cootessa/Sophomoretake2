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

public class PlantPage {


    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML ImageView flowerPic;



    public void displayPicture(Image flower) {
        flowerPic.setImage(flower);
    }



    public void back(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ZoneTwoScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have gone back");
    }
}

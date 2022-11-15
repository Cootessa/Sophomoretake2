package com.example.projecttesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class TestPlantPage {


    @FXML Label plantTitle;
    @FXML Label plantHeight;
    @FXML Label plantWidth;
    @FXML Label plantSun;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    ImageView flowerPic;

    Image marigoldImage = new Image(getClass().getResourceAsStream("Marigold.jpg"));
    Image begoniaImage = new Image(getClass().getResourceAsStream("Begonia.jpg"));

    public void displayNames(String name, String height, String width, String sun){
        plantTitle.setText(name);
        plantHeight.setText("Height: " + height);
        plantWidth.setText("Width: " + width);
        plantSun.setText("Sunlight: " + sun);
    }

    public void displayPicture() {
        if () {
            flowerPic.setImage(marigoldImage);
        }
        if (plantTitle.equals("Begonia")){
            flowerPic.setImage(begoniaImage);
        }
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

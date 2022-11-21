package com.example.projecttesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class ZoneController {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void zone2(ActionEvent e) throws IOException {
       root = FXMLLoader.load(getClass().getResource("ZoneTwoScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 2");


    }


    public void zone3(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneThreeScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 3");

    }

    public void zone4(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneFourScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 4");

    }

    public void zone5(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneFiveScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 5");
    }

    public void zone6(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneSixScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 6");
    }

    public void zone7(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneSevenScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 7");
    }

    public void zone8(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneEightScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 8");
    }

    public void zone9(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneNineScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 9");
    }

    public void zone10(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("ZoneTenScreen.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have picked Zone 10");
    }



    public void exit(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You're about to exit!");
        alert.setContentText("Do you really want to exit?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            stage.close();
        }
    }
}

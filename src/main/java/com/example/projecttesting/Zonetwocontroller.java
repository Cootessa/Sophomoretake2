package com.example.projecttesting;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Zonetwocontroller implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Label label;
    private Label invalid;
    @FXML private TextField filterField;
    @FXML private TableView<Plant> tableView;
    @FXML private TableColumn<Plant, String> plantName;

    Image marigoldImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marigold.jpg")));
    Image begoniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Begonia.jpg")));

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException{
        String inputSearch = filterField.getText();
        if (inputSearch.equalsIgnoreCase("Marigold")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestPlantPage.fxml"));
            root = loader.load();
            TestPlantPage testPlantPage = loader.getController();
            testPlantPage.displayPicture(marigoldImage);
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if (inputSearch.equalsIgnoreCase("Begonia")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TestPlantPage.fxml"));
            root = loader.load();
            TestPlantPage testPlantPage = loader.getController();
            testPlantPage.displayPicture(begoniaImage);
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }


    //Back Button Controller
    public void back(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ZonePick.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("You have gone back");
    }


    //Initializes Columns
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Sets up Columns
        plantName.setCellValueFactory(new PropertyValueFactory<Plant, String>("plantName"));
        tableView.setItems(getPlant());

    }
    //Add to Table
   public ObservableList<Plant> getPlant(){
        ObservableList<Plant> plant = FXCollections.observableArrayList();
        plant.add(new Plant("Marigold"));
        plant.add(new Plant("Begonia"));
        return plant;
    }

}

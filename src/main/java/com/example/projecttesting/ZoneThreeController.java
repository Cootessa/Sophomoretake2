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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ZoneThreeController implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Label label;
    @FXML private TextField filterField;
    @FXML private TableView<Plant> tableView;
    @FXML private TableColumn<Plant, String> plantName;

    //Search text field
    public void search(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        if (inputSearch.equalsIgnoreCase("Alchemilla")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            root = loader.load();
            TestPlantPage testPlantPage = loader.getController();
            //testPlantPage.displayPicture();
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (inputSearch.equalsIgnoreCase("")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            root = loader.load();
            TestPlantPage testPlantPage = loader.getController();
            //testPlantPage.displayPicture();
            stage = (Stage)((Node)e.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    //Search button
    public void buttonSearch(ActionEvent e) throws IOException{

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
        plant.addAll(new Plant("Alchemilla"), new Plant("Allium"), new Plant("Anemone"), new Plant("Aster"),
        new Plant("Bachelor's Button"), new Plant("Balloon Flower"), new Plant("Bee Balm"), new Plant("Begonia"),
        new Plant("Bergamot"),new Plant("Bergenia"), new Plant("Black-eyed Susan"), new Plant("Blanket Flower"), new Plant("Blazing Star"),
        new Plant("Bleeding Heart"), new Plant("Bluestar Flower"), new Plant("Blue-eyed Grass"), new Plant("Borage"), new Plant("Candytuft"),
        new Plant("Cardinal Flower"), new Plant("Catmint"), new Plant("Cerastium Tomentosum"), new Plant("Chicory"), new Plant("Clarkia"),
        new Plant("Clover"), new Plant("Columbine"), new Plant("Cornflower"), new Plant("Cosmos"), new Plant("Crocus"), new Plant("Daffodil"),
                new Plant("Delphinium"), new Plant("Dianthus Barbatus"), new Plant("Geranium"), new Plant("Hollyhock"),
                new Plant("Lilac"), new Plant("Lily"), new Plant("Marigold"), new Plant("Morning Glory"), new Plant("Tulip"));
        return plant;
    }
}

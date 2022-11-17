package com.example.projecttesting;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
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


    private ObservableList<Plant> plant = FXCollections.observableArrayList();

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TestPlantPage.fxml"));
        root = loader.load();
        TestPlantPage testPlantPage = loader.getController();
         if (inputSearch.equalsIgnoreCase("Begonia")) {
            testPlantPage.displayPicture(begoniaImage);

        } else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            testPlantPage.displayPicture(begoniaImage); //need to change picture

        } else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            testPlantPage.displayPicture(begoniaImage); //need to change picture

        } else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            testPlantPage.displayPicture(begoniaImage); //need to change image

        } else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            testPlantPage.displayPicture(begoniaImage); //need to change image

        }
        else if (inputSearch.equalsIgnoreCase("Marigold")) {
            testPlantPage.displayPicture(marigoldImage);
            }

        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

        //Below is what makes the table searchable
            //Filtered List
            FilteredList<Plant> plantFilteredList = new FilteredList<>(plant, b -> true);
            filterField.textProperty().addListener((observable, oldValue, newValue) -> {
                plantFilteredList.setPredicate(plant -> {
                    if (newValue == null || newValue.isEmpty()) {
                    return true;
                    }
                    String lowerCaseFilter = newValue.toLowerCase();
                    if (plant.getPlantName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }

                });
            });
            //Sorted List
            SortedList<Plant> sortedList = new SortedList<>(plantFilteredList);
            sortedList.comparatorProperty().bind(tableView.comparatorProperty());
            tableView.setItems(sortedList);
    }


    //Add to Table
   public ObservableList<Plant> getPlant(){
        plant.addAll(new Plant("Begonia"), new Plant("Blue-eyed Grass"), new Plant("Clarkia"), new Plant("Cornflower"), new Plant("Cosmos"), new Plant("Marigold"));
        return plant;
    }


}

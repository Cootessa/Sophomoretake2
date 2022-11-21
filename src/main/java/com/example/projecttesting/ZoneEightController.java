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

public class ZoneEightController implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Label label;
    private Label invalid;
    @FXML private TextField filterField;
    @FXML private TableView<Plant> tableView;
    @FXML private TableColumn<Plant, String> plantName;

    //Plant info card
    Image agapanthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Agapanthus.jpg")));
    Image alchemillaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alchemilla.jpg")));
    Image alliumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Allium.jpg")));
    Image alstroemeriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alstroemeria.jpg")));
    Image alyssumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alyssum.jpg")));
    Image anemoneImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Anemone.jpg")));

    private ObservableList<Plant> plant = FXCollections.observableArrayList();

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPage.fxml"));
        root = loader.load();
        PlantPage testPlantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Agapanthus")) {
            testPlantPage.displayPicture(agapanthusImage);

        } else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            testPlantPage.displayPicture(alchemillaImage);
        } else if (inputSearch.equalsIgnoreCase("Allium")) {
            testPlantPage.displayPicture(alliumImage);
        } else if (inputSearch.equalsIgnoreCase("Alstroemeria")) {
            testPlantPage.displayPicture(alstroemeriaImage);
        } else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            testPlantPage.displayPicture(alyssumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Anemone")) {
            testPlantPage.displayPicture(anemoneImage);
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
        //ObservableList<Plant> plant = FXCollections.observableArrayList();
        plant.addAll(new Plant("Agapanthus"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alstroemeria"),new Plant("Alyssum"), new Plant("Anemone"));
        return plant;
    }
}

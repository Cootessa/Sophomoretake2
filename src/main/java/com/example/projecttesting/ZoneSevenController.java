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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ZoneSevenController implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Label label;
    private Label invalid;
    @FXML private TextField filterField;
    @FXML private TableView<Plant> tableView;
    @FXML private TableColumn<Plant, String> plantName;
    private ObservableList<Plant> plant = FXCollections.observableArrayList();


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
        plant.addAll(new Plant("Aconite"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alstroemeria"), new Plant("Alyssum"),
                new Plant("Anemone"), new Plant("Anise Hyssop"), new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Azalea"),
                new Plant("Baby's Breath"), new Plant("Bachelor's Button"), new Plant("Balloon Flower"), new Plant("Ballota"), new Plant("Bee Balm"),
                new Plant("Begonia"), new Plant("Bergamot"), new Plant("Bergenia"), new Plant("Black-eyed Susan"), new Plant("Blanket Flower"),
                new Plant("Blazing Star"), new Plant("Bleeding Heart"), new Plant("Bletilla"), new Plant("Blue-eyed Grass"), new Plant("Bluestar Flower"),
                new Plant("Borage"), new Plant("Brassica"), new Plant("Butterfly Bush"), new Plant("Camellia"), new Plant("Candytuft"),
                new Plant("Cardinal Flower"), new Plant("Carnation"), new Plant("Catmint"), new Plant("Cerastium Tomentosum"), new Plant("Chicory"),
                new Plant("Chionodoxa"), new Plant("Chrysanthemum"), new Plant("Clarkia"), new Plant("Clematis"), new Plant("Clover"), new Plant("Columbine"),
                new Plant("Coneflower"), new Plant("Coral Bells"), new Plant("Coreopsis"), new Plant("Cornflower"), new Plant("Corydalis"),
                new Plant("Cosmos"), new Plant("Cotoneaster"), new Plant("Crocosmia"), new Plant("Crocus"), new Plant("Crow Imperial"), new Plant("Cuckoo Flower"),
                new Plant("Daffodil"), new Plant("Daisy"), new Plant("Daphne"), new Plant("Daylily"), new Plant("Decumaria"), new Plant("Delphinium"),
                new Plant("Deutzia"), new Plant("Dianthus Barbatus"), new Plant("Dutch Iris"), new Plant("Geranium"), new Plant("Hollyhock"),
                new Plant("Lavender"), new Plant("Lilac"), new Plant("Lily"), new Plant("Marigold"), new Plant("Morning Glory"), new Plant("Primrose"),
                new Plant("Rose"), new Plant("Tulip"), new Plant("Wisteria"));
        return plant;
    }

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("TestPlantPage.fxml"));
        root = loader.load();
        TestPlantPage testPlantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Aconite")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Allium")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Alstroemeria")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Anemone")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Anise Hyssop")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Armeria Maritima")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Aster")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Azalea")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Baby's Breath")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bachelor's Button")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Balloon Flower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Ballota")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bee Balm")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Begonia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bergamot")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bergenia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Blanket Flower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bleeding Heart")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bletilla")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Bluestar Flower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Borage")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Brassica")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Butterfly Bush")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Camellia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Carnation")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Catmint")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cerastium Tomentosum")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Chicory")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Chionodoxa")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Chrysanthemum")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Clematis")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Clover")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Columbine")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Coneflower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Coral Bells")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Coreopsis")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Corydalis")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cotoneaster")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Crocosmia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Crocus")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Crown Imperial")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cuckoo Flower")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Cyclamen")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Daffodil")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Daisy")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Daphne")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Daylily")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Decumaria")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Delphinium")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Deutzia")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Dianthus Barbatus")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Dutch Iris")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Geranium")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Hollyhock")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Lavender")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Lilac")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Lily")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Marigold")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Morning Glory")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Rose")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Tulip")) {
            //testPlantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            //testPlantPage.displayPicture();
        }
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

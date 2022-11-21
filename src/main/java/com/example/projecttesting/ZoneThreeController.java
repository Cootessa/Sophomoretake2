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

public class ZoneThreeController implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Label label;
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

    //Images of plants for zone
    Image alchemillaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alchemilla.jpg")));
    Image alliumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Allium.jpg")));
    Image anemoneImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Anemone.jpg")));
    Image asterImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aster.jpg")));
    Image bachelorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bachelor's Button.jpg")));
    Image balloonImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Balloon Flower.jpg")));
    Image beeImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bee Balm.jpg")));
    Image begoniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Begonia.jpg")));
    Image bergamotImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bergamot.jpg")));
    Image bergeniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bergenia.jpg")));
    Image susanImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Black-eyed Susan.jpg")));
    Image blanketImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blanket Flower.jpg")));
    Image blazingImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blazing Star.jpg")));
    Image bleedingImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bleeding Heart.jpg")));
    Image bluegrassImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blue-eyed Grass.jpg")));
    Image bluestarImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bluestar Flower.jpg")));
    Image borageImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Borage.jpg")));
    Image candytuftImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Candytuft.jpg")));
    Image cardinalImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cardinal Flower.jpg")));
    Image catmintImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Catmint.jpg")));
    Image cerastiumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cerastium Tomentosum.jpg")));
    Image chicoryImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chicory.jpg")));
    Image clarkiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clarkia.jpg")));
    Image cloverImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clover.jpg")));
    Image columbineImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Columbine.jpg")));
    Image cornflowerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cornflower.jpg")));
    Image cosmosImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cosmos.jpg")));
    Image crocusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crocus.jpg")));
    Image daffodilImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daffodil.jpg")));
    Image delphiniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Delphinium.jpg")));
    Image dianthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dianthus Barbatus.jpg")));
    Image geraniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Geranium.jpg")));
    Image hollyhockImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Hollyhock.jpg")));
    Image lilacImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lilac.jpg")));
    Image lilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lily.jpg")));
    Image marigoldImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marigold.jpg")));
    Image morningImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Morning Glory.jpg")));
    Image tulipImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Tulip.jpg")));


    //Search button
    public void buttonSearch(ActionEvent e) throws IOException{
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPage.fxml"));
        root = loader.load();
        PlantPage testPlantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Alchemilla")){
            testPlantPage.displayPicture(alchemillaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Allium")) {
            testPlantPage.displayPicture(alliumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Anemone")) {
            testPlantPage.displayPicture(anemoneImage);
        }
        else if (inputSearch.equalsIgnoreCase("Aster")) {
            testPlantPage.displayPicture(asterImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bachelor's Button")) {
            testPlantPage.displayPicture(bachelorImage);
        }
        else if (inputSearch.equalsIgnoreCase("Balloon Flower")) {
            testPlantPage.displayPicture(balloonImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bee Balm")) {
            testPlantPage.displayPicture(beeImage);
        }
        else if (inputSearch.equalsIgnoreCase("Begonia")) {
            testPlantPage.displayPicture(begoniaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bergamot")) {
            testPlantPage.displayPicture(bergamotImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bergenia")) {
            testPlantPage.displayPicture(bergeniaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            testPlantPage.displayPicture(susanImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blanket Flower")) {
            testPlantPage.displayPicture(blanketImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            testPlantPage.displayPicture(blazingImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bleeding Heart")) {
            testPlantPage.displayPicture(bleedingImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bluestar Flower")) {
            testPlantPage.displayPicture(bluestarImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            testPlantPage.displayPicture(bluegrassImage);
        }
        else if (inputSearch.equalsIgnoreCase("Borage")) {
            testPlantPage.displayPicture(borageImage);
        }
        else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            testPlantPage.displayPicture(candytuftImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            testPlantPage.displayPicture(cardinalImage);
        }
        else if (inputSearch.equalsIgnoreCase("Catmint")) {
            testPlantPage.displayPicture(catmintImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cerastium Tomentosum")) {
            testPlantPage.displayPicture(cerastiumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Chicory")) {
            testPlantPage.displayPicture(chicoryImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            testPlantPage.displayPicture(clarkiaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clover")) {
            testPlantPage.displayPicture(cloverImage);
        }
        else if (inputSearch.equalsIgnoreCase("Columbine")) {
            testPlantPage.displayPicture(columbineImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            testPlantPage.displayPicture(cornflowerImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            testPlantPage.displayPicture(cosmosImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crocus")) {
            testPlantPage.displayPicture(crocusImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daffodil")) {
            testPlantPage.displayPicture(daffodilImage);
        }
        else if (inputSearch.equalsIgnoreCase("Delphinium")) {
            testPlantPage.displayPicture(delphiniumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Dianthus Barbatus")) {
            testPlantPage.displayPicture(dianthusImage);
        }
        else if (inputSearch.equalsIgnoreCase("Geranium")) {
            testPlantPage.displayPicture(geraniumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Hollyhock")) {
            testPlantPage.displayPicture(hollyhockImage);
        }
        else if (inputSearch.equalsIgnoreCase("Lilac")) {
            testPlantPage.displayPicture(lilacImage);
        }
        else if (inputSearch.equalsIgnoreCase("Lily")) {
            testPlantPage.displayPicture(lilyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Marigold")) {
            testPlantPage.displayPicture(marigoldImage);
        }
        else if (inputSearch.equalsIgnoreCase("Morning Glory")) {
            testPlantPage.displayPicture(morningImage);
        }
        else if (inputSearch.equalsIgnoreCase("Tulip")) {
            testPlantPage.displayPicture(tulipImage);
        }
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

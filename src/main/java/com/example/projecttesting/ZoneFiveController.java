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

public class ZoneFiveController implements Initializable {

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
        plant.addAll(new Plant("Aconite"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alyssum"),
                new Plant("Anise Hyssop"), new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Baby's Breath"), new Plant("Bachelor's Button"), new Plant("Balloon Flower"),
                new Plant("Bee Balm"), new Plant("Begonia"),  new Plant("Bergamot"), new Plant("Bergenia"),
                new Plant("Black-eyed Susan"), new Plant("Blanket Flower"), new Plant("Blazing Star"), new Plant("Bleeding Heart"),
                new Plant("Bluestar Flower"), new Plant("Blue-eyed Grass"), new Plant("Borage"), new Plant("Butterfly Bush"),
                new Plant("Candytuft"), new Plant("Cardinal Flower"), new Plant("Carnation"), new Plant("Catmint"), new Plant("Cerastium Tomentosum"), new Plant("Chicory"),
                new Plant("Chiondoxa"), new Plant("Chrysanthemum"), new Plant("Clarkia"), new Plant("Clematis"), new Plant("Clover"), new Plant("Columbine"),
                new Plant("Coneflower"), new Plant("Coral Bells"), new Plant("Coreopsis"), new Plant("Cornflower"), new Plant("Corydalis"),
                new Plant("Cosmos"), new Plant("Cotoneaster"), new Plant("Crocus"), new Plant("Crown Imperial"), new Plant("Cuckoo Flower"),
                new Plant("Daffodil"), new Plant("Daisy"), new Plant("Daphne"), new Plant("Daylily"), new Plant("Delphinium"), new Plant("Deutzia"),
                new Plant("Dianthus Barbatus"), new Plant("Geramium"), new Plant("Hollyhock"), new Plant("Lavender"),
                new Plant("Lilac"), new Plant("Lily"), new Plant("Marigold"), new Plant("Morning Glory"), new Plant("Rose"), new Plant("Tulip"), new Plant("Wisteria"));
        return plant;
    }

    //Images for plants in zone
    Image aconiteImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aconite.jpg")));
    Image alchemillaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alchemilla.jpg")));
    Image alliumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Allium.jpg")));
    Image alyssumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alyssum.jpg")));
    Image aniseImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Anise Hyssop.jpg")));
    Image armeriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Armeria Maritima.jpg")));
    Image asterImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aster.jpg")));
    Image breathImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Baby's Breath.jpg")));
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
    Image butterflyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Butterfly Bush.jpg")));
    Image candytuftImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Candytuft.jpg")));
    Image cardinalImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cardinal Flower.jpg")));
    Image carnationImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Carnation.jpg")));
    Image catmintImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Catmint.jpg")));
    Image cerastiumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cerastium Tomentosum.jpg")));
    Image chicoryImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chicory.jpg")));
    Image chiondoxaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chiondoxa.jpg")));
    Image chrysanthemumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chrysanthemum.jpg")));
    Image clarkiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clarkia.jpg")));
    Image clematisImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clematis.jpg")));
    Image cloverImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clover.jpg")));
    Image columbineImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Columbine.jpg")));
    Image coneflowerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Coneflower.jpg")));
    Image coralImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Coral Bells.jpg")));
    Image coreopsisImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Coreopsis.jpg")));
    Image cornflowerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cornflower.jpg")));
    Image corydalisImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Corydalis.jpg")));
    Image cosmosImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cosmos.jpg")));
    Image cotoneasterImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cotoneaster.jpg")));
    Image crocusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crocus.jpg")));
    Image crownImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crown Imperial.jpg")));
    Image cuckooImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cuckoo Flower.jpg")));
    Image daffodilImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daffodil.jpg")));
    Image daisyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daisy.jpg")));
    Image daphneImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daphne.jpg")));
    Image daylilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daylily.jpg")));
    Image delphiniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Delphinium.jpg")));
    Image deutziaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Deutzia.jpg")));
    Image dianthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dianthus Barbatus.jpg")));
    Image geraniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Geranium.jpg")));
    Image hollyhockImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Hollyhock.jpg")));
    Image lavenderImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lavender.jpg")));
    Image lilacImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lilac.jpg")));
    Image lilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lily.jpg")));
    Image marigoldImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marigold.jpg")));
    Image morningImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Morning Glory.jpg")));
    Image primroseImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Primrose.jpg")));
    Image roseImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rose.jpg")));
    Image tulipImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Tulip.jpg")));
    Image wisteriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Wisteria.jpg")));


    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPage.fxml"));
        root = loader.load();
        PlantPage testPlantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Aconite")) {
            testPlantPage.displayPicture(aconiteImage);
        }
        else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            testPlantPage.displayPicture(alchemillaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Allium")) {
            testPlantPage.displayPicture(alliumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            testPlantPage.displayPicture(alyssumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Anise Hyssop")) {
            testPlantPage.displayPicture(aniseImage);
        }
        else if (inputSearch.equalsIgnoreCase("Armeria Maritima")) {
            testPlantPage.displayPicture(armeriaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Aster")) {
            testPlantPage.displayPicture(asterImage);
        }
        else if (inputSearch.equalsIgnoreCase("Baby's Breath")) {
            testPlantPage.displayPicture(breathImage);
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
        else if (inputSearch.equalsIgnoreCase("Butterfly Bush")) {
            testPlantPage.displayPicture(butterflyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            testPlantPage.displayPicture(candytuftImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            testPlantPage.displayPicture(cardinalImage);
        }
        else if (inputSearch.equalsIgnoreCase("Carnation")) {
            testPlantPage.displayPicture(carnationImage);
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
        else if (inputSearch.equalsIgnoreCase("Chiondoxa")) {
            testPlantPage.displayPicture(chiondoxaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Chrysanthemum")) {
            testPlantPage.displayPicture(chrysanthemumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            testPlantPage.displayPicture(clarkiaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clematis")) {
            testPlantPage.displayPicture(clematisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clover")) {
            testPlantPage.displayPicture(cloverImage);
        }
        else if (inputSearch.equalsIgnoreCase("Columbine")) {
            testPlantPage.displayPicture(columbineImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coneflower")) {
            testPlantPage.displayPicture(coneflowerImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coral Bells")) {
            testPlantPage.displayPicture(coralImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coreopsis")) {
            testPlantPage.displayPicture(coreopsisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            testPlantPage.displayPicture(cornflowerImage);
        }
        else if (inputSearch.equalsIgnoreCase("Corydalis")) {
            testPlantPage.displayPicture(corydalisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            testPlantPage.displayPicture(cosmosImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cotoneaster")) {
            testPlantPage.displayPicture(cotoneasterImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crocus")) {
            testPlantPage.displayPicture(crocusImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crown Imperial")) {
            testPlantPage.displayPicture(crownImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cuckoo Flower")) {
            testPlantPage.displayPicture(cuckooImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daffodil")) {
            testPlantPage.displayPicture(daffodilImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daisy")) {
            testPlantPage.displayPicture(daisyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daphne")) {
            testPlantPage.displayPicture(daphneImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daylily")) {
            testPlantPage.displayPicture(daylilyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Delphinium")) {
            testPlantPage.displayPicture(delphiniumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Deutzia")) {
            testPlantPage.displayPicture(deutziaImage);
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
        else if (inputSearch.equalsIgnoreCase("Lavender")) {
            testPlantPage.displayPicture(lavenderImage);
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
        else if (inputSearch.equalsIgnoreCase("Rose")) {
            testPlantPage.displayPicture(roseImage);
        }
        else if (inputSearch.equalsIgnoreCase("Tulip")) {
            testPlantPage.displayPicture(tulipImage);
        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            testPlantPage.displayPicture(wisteriaImage);
        }
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}

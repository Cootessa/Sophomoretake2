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
import java.util.Objects;
import java.util.ResourceBundle;

//Controller for Zone 6

public class ZoneSixController implements Initializable {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
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
        plant.addAll(new Plant("Aconite"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alyssum"), new Plant("Anise Hyssop"),
                new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Azalea"), new Plant("Baby's Breath"), new Plant("Bachelor's Button"),
                new Plant("Balloon Flower"), new Plant("Bee Balm"), new Plant("Begonia"), new Plant("Bergamot"), new Plant("Black-Eyed Susan"),
                new Plant("Blanket Flower"), new Plant("Blazing Star"), new Plant("Bleeding Heart"), new Plant("Blue-eyed Grass"),
                new Plant("Bluestar Flower"), new Plant("Borage"), new Plant("Brassica"), new Plant("Butterfly Bush"), new Plant("Candytuft"),
                new Plant("Cardinal Flower"), new Plant("Carnation"), new Plant("Catmint"), new Plant("Cerastium Tomentosum"), new Plant("Chicory"),
                        new Plant("Chionodoxa"), new Plant("Chrysanthemum"), new Plant("Clarkia"), new Plant("Clematis"), new Plant("Clover"),
                new Plant("Columbine"), new Plant("Coneflower"), new Plant("Coral Bells"), new Plant("Coreopsis"), new Plant("Cornflower"),
                new Plant("Corydalis"), new Plant("Cosmos"), new Plant("Cotoneaster"), new Plant("Crocosmia"), new Plant("Crocus"),
                new Plant("Crown Imperial"), new Plant("Cuckoo Flower"), new Plant("Cyclamen"), new Plant("Daffodil"), new Plant("Daisy"),
                new Plant("Daphne"), new Plant("Daylily"), new Plant("Decumaria"), new Plant("Delphinium"), new Plant("Deutzia"), new Plant("Dianthus Barbatus"),
                new Plant("Dutch Iris"), new Plant("Geranium"), new Plant("Hollyhock"), new Plant("Lavender"), new Plant("Lilac"), new Plant("Lily"),
                new Plant("Marigold"), new Plant("Morning Glory"), new Plant("Primrose"), new Plant("Rose"), new Plant("Tulip"), new Plant("Wisteria"));
        return plant;
    }

    //Images for Plants in Zone
    Image aconiteImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aconite.jpg")));
    Image alchemillaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alchemilla.jpg")));
    Image alliumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Allium.jpg")));
    Image alyssumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Alyssum.jpg")));
    Image aniseImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Anise Hyssop.jpg")));
    Image armeriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Armeria Maritima.jpg")));
    Image asterImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aster.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image babyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Baby's Breath.jpg")));
    Image bachelorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bachelor's Button.jpg")));
    Image balloonImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Balloon Flower.jpg")));
    Image beeImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bee Balm.jpg")));
    Image begoniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Begonia.jpg")));
    Image bergamotImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bergamot.jpg")));
    Image susanImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Black-eyed Susan.jpg")));
    Image blanketImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blanket Flower.jpg")));
    Image blazingImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blazing Star.jpg")));
    Image bleedingImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bleeding Heart.jpg")));
    Image bluegrassImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blue-eyed Grass.jpg")));
    Image bluestarImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bluestar Flower.jpg")));
    Image borageImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Borage.jpg")));
    Image brassicaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Brassica.jpg")));
    Image butterflyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Butterfly Bush.jpg")));
    Image candytuftImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Candytuft.jpg")));
    Image cardinalImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cardinal Flower.jpg")));
    Image carnationImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Carnation.jpg")));
    Image catmintImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Catmint.jpg")));
    Image cerastiumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cerastium Tomentosum.jpg")));
    Image chicoryImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chicory.jpg")));
    Image chionodoxaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chionodoxa.jpg")));
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
    Image crocosmiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crocosmia.jpg")));
    Image crocusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crocus.jpg")));
    Image crownImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Crown Imperial.jpg")));
    Image cuckooImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cuckoo Flower.jpg")));
    Image cyclamenImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cyclamen.jpg")));
    Image daffodilImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daffodil.jpg")));
    Image daisyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daisy.jpeg")));
    Image daphneImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daphne.jpg")));
    Image daylilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daylily.jpg")));
    Image decumariaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Decumaria.jpg")));
    Image delphiniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Delphinium.jpg")));
    Image deutziaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Deutzia.jpg")));
    Image dianthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dianthus Barbatus.jpg")));
    Image dutchImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dutch Iris.jpg")));
    Image geraniumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Geranium.jpg")));
    Image hollyhockImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Hollyhock.jpg")));
    Image lavenderImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lavender.jpg")));
    Image lilacImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lilac.jpg")));
    Image lilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Lily.jpg")));
    Image marigoldImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marigold.jpg")));
    Image morningImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Morning Glory.jpg")));
    Image roseImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rose.jpg")));
    Image tulipImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Tulip.jpg")));
    Image wisteriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Wisteria.jpg")));

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPageZone6.fxml"));
        root = loader.load();
        PlantPageZone6 plantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Aconite")) {
            plantPage.displayPicture(aconiteImage);
        }
        else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            plantPage.displayPicture(alchemillaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Allium")) {
            plantPage.displayPicture(alliumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            plantPage.displayPicture(alyssumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Anise Hyssop")) {
            plantPage.displayPicture(aniseImage);
        }
        else if (inputSearch.equalsIgnoreCase("Armeria Maritima")) {
            plantPage.displayPicture(armeriaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Aster")) {
            plantPage.displayPicture(asterImage);
        }
        else if (inputSearch.equalsIgnoreCase("Azalea")) {
            plantPage.displayPicture(azaleaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Baby's Breath")) {
            plantPage.displayPicture(babyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bachelor's Button")) {
            plantPage.displayPicture(bachelorImage);
        }
        else if (inputSearch.equalsIgnoreCase("Balloon Flower")) {
            plantPage.displayPicture(balloonImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bee Balm")) {
            plantPage.displayPicture(beeImage);
        }
        else if (inputSearch.equalsIgnoreCase("Begonia")) {
            plantPage.displayPicture(begoniaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bergamot")) {
            plantPage.displayPicture(bergamotImage);
        }
        else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            plantPage.displayPicture(susanImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blanket Flower")) {
            plantPage.displayPicture(blanketImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            plantPage.displayPicture(blazingImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bleeding Heart")) {
            plantPage.displayPicture(bleedingImage);
        }
        else if (inputSearch.equalsIgnoreCase("Bluestar Flower")) {
            plantPage.displayPicture(bluestarImage);
        }
        else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            plantPage.displayPicture(bluegrassImage);
        }
        else if (inputSearch.equalsIgnoreCase("Borage")) {
            plantPage.displayPicture(borageImage);
        }
       else if (inputSearch.equalsIgnoreCase("Brassica")) {
            plantPage.displayPicture(brassicaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Butterfly Bush")) {
            plantPage.displayPicture(butterflyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            plantPage.displayPicture(candytuftImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            plantPage.displayPicture(cardinalImage);
        }
        else if (inputSearch.equalsIgnoreCase("Carnation")) {
            plantPage.displayPicture(carnationImage);
        }
        else if (inputSearch.equalsIgnoreCase("Catmint")) {
            plantPage.displayPicture(catmintImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cerastium Tomentosum")) {
            plantPage.displayPicture(cerastiumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Chicory")) {
            plantPage.displayPicture(chicoryImage);
        }
        else if (inputSearch.equalsIgnoreCase("Chionodoxa")) {
            plantPage.displayPicture(chionodoxaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Chrysanthemum")) {
            plantPage.displayPicture(chrysanthemumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            plantPage.displayPicture(clarkiaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clematis")) {
            plantPage.displayPicture(clematisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Clover")) {
            plantPage.displayPicture(cloverImage);
        }
        else if (inputSearch.equalsIgnoreCase("Columbine")) {
            plantPage.displayPicture(columbineImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coneflower")) {
            plantPage.displayPicture(coneflowerImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coral Bells")) {
            plantPage.displayPicture(coralImage);
        }
        else if (inputSearch.equalsIgnoreCase("Coreopsis")) {
            plantPage.displayPicture(coreopsisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            plantPage.displayPicture(cornflowerImage);
        }
        else if (inputSearch.equalsIgnoreCase("Corydalis")) {
            plantPage.displayPicture(corydalisImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            plantPage.displayPicture(cosmosImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cotoneaster")) {
            plantPage.displayPicture(cotoneasterImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crocosmia")) {
            plantPage.displayPicture(crocosmiaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crocus")) {
            plantPage.displayPicture(crocusImage);
        }
        else if (inputSearch.equalsIgnoreCase("Crown Imperial")) {
            plantPage.displayPicture(crownImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cuckoo Flower")) {
            plantPage.displayPicture(cuckooImage);
        }
        else if (inputSearch.equalsIgnoreCase("Cyclamen")) {
            plantPage.displayPicture(cyclamenImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daffodil")) {
            plantPage.displayPicture(daffodilImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daisy")) {
            plantPage.displayPicture(daisyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daphne")) {
            plantPage.displayPicture(daphneImage);
        }
        else if (inputSearch.equalsIgnoreCase("Daylily")) {
            plantPage.displayPicture(daylilyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Decumaria")) {
            plantPage.displayPicture(decumariaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Delphinium")) {
            plantPage.displayPicture(delphiniumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Deutzia")) {
            plantPage.displayPicture(deutziaImage);
        }
        else if (inputSearch.equalsIgnoreCase("Dianthus Barbatus")) {
            plantPage.displayPicture(dianthusImage);
        }
        else if (inputSearch.equalsIgnoreCase("Dutch Iris")) {
            plantPage.displayPicture(dutchImage);
        }
        else if (inputSearch.equalsIgnoreCase("Geranium")) {
            plantPage.displayPicture(geraniumImage);
        }
        else if (inputSearch.equalsIgnoreCase("Hollyhock")) {
            plantPage.displayPicture(hollyhockImage);
        }
        else if (inputSearch.equalsIgnoreCase("Lavender")) {
            plantPage.displayPicture(lavenderImage);
        }
        else if (inputSearch.equalsIgnoreCase("Lilac")) {
            plantPage.displayPicture(lilacImage);
        }
        else if (inputSearch.equalsIgnoreCase("Lily")) {
            plantPage.displayPicture(lilyImage);
        }
        else if (inputSearch.equalsIgnoreCase("Marigold")) {
            plantPage.displayPicture(marigoldImage);
        }
        else if (inputSearch.equalsIgnoreCase("Morning Glory")) {
            plantPage.displayPicture(morningImage);
        }
        else if (inputSearch.equalsIgnoreCase("Rose")) {
            plantPage.displayPicture(roseImage);
        }
        else if (inputSearch.equalsIgnoreCase("Tulip")) {
            plantPage.displayPicture(tulipImage);
        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            plantPage.displayPicture(wisteriaImage);
        }
        else if(((!inputSearch.equals("")) && (inputSearch!= null)) && inputSearch.matches("^[a-zA-Z]*$")){
            FXMLLoader wrong = new FXMLLoader(getClass().getResource("ZoneSixScreen.fxml"));
            Alert invalid = new Alert(Alert.AlertType.WARNING);
            invalid.setTitle("Invalid Plant");
            invalid.setHeaderText("Invalid plant has been entered");
            invalid.setContentText("The plant you have entered does not exist in this zone or was misspelled. Please try again.");
            invalid.showAndWait();
            root = wrong.load();
        }

        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

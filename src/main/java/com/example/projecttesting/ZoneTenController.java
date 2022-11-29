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

//Controller for Zone 10

public class ZoneTenController implements Initializable {

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
        plant.addAll(new Plant("Abutilon"),new Plant("Agapanthus"), new Plant("Ageratum"),
                new Plant("Amaranthus"), new Plant("Amaryllus"), new Plant("Ballota"), new Plant("Bee Balm"), new Plant("Begonia"), new Plant("Billbergia")
                , new Plant("Black-eyed Susan"), new Plant("Blazing Star"), new Plant("Borage"),new Plant("Bottlebush"), new Plant("Bouvardia"), new Plant("Brachyscome")
                , new Plant("Broom"), new Plant("Buttercup"), new Plant("Calceolaria"), new Plant("Camellia"), new Plant("Calendula"), new Plant("Cape Leadwort"), new Plant("Catharanthus"), new Plant("Celosia")
                , new Plant("Chicory"), new Plant("Clarkia"), new Plant("Clover"), new Plant("Coral Vine"), new Plant("Cornflower"), new Plant("Cosmos"),new Plant("Dahlia"), new Plant("Dandelion"), new Plant("Daphne")
                , new Plant("Daylily"), new Plant("Desert Rose"), new Plant("Dianella"), new Plant("Diascia"),new Plant("Dietes"),new Plant("Dill")
                , new Plant("Marguerite"), new Plant("Marigold"), new Plant("Moonflower"), new Plant("Morning Glory"), new Plant("Petunia"), new Plant("Rosea Ice Plant")
                , new Plant("Wisteria"));
        return plant;
    }

    //Plant info card
    Image abutilonImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Abutilon.jpg")));
    Image agapanthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Agapanthus.jpg")));
    Image ageratumImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Ageratum.jpg")));
    Image amaranthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Amaranthus.JPG")));
    Image amaryllusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Amaryllis.jpg")));
    Image ballotaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Ballota.jpg")));
    Image begoniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Begonia.jpg")));
    Image billbergiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Billbergia.jpg")));
    Image black_eyedImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Black-eyed Susan.jpg")));
    Image blazingstarImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blazing Star.jpg")));
    Image borageImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Borage.jpg")));
    Image bottlebrushImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bottlebush.jpg")));
    Image bouvardiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bouvardia.jpg")));
    Image brachyscomeImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Brachyscome.jpg")));
    Image broomImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Broom.jpg")));
    Image buttercupImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Buttercup.jpg")));
    Image calceolariaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Calceolaria.jpg")));
    Image calendulaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Calendula.jpg")));
    Image camelliaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Camellia.jpg")));
    Image cape_lImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cape Leadwort.jpg")));
    Image catharanthusImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Catharanthus.jpg")));
    Image celosiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Celosia.jpg")));
    Image chicoryImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Chicory.jpg")));
    Image clarkiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clarkia.jpg")));
    Image cloverImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Clover.jpg")));
    Image coral_vineImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Coral Vine.jpg")));
    Image cornflowerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cornflower.jpg")));
    Image cosmosImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cosmos.jpg")));
    Image dahliaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dahlia.jpg")));
    Image dandelionImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dandelion.jpg")));
    Image daphneImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daphne.jpg")));
    Image daylilyImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Daylily.jpg")));
    Image desert_rImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Desert Rose.jpg")));
    Image dianellaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dianella.jpg")));
    Image diasciaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Diascia.jpg")));
    Image dietesImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dietes.jpg")));
    Image dillImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Dill.jpg")));
    Image margueriteImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marguerite.jpg")));
    Image marigoldImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Marigold.jpg")));
    Image moonflowerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Moonflower.jpeg")));
    Image morning_gImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Morning Glory.jpg")));
    Image petuniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Petunia.jpg")));
    Image rosea_iceImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Rosea Ice Plant.jpg")));
    Image wisteriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Wisteria.jpg")));

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPageZone10.fxml"));
        root = loader.load();
        PlantPageZone10 plantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Abutilon")) {
            plantPage.displayPicture(abutilonImage);

        } else if (inputSearch.equalsIgnoreCase("Agapanthus")) {
            plantPage.displayPicture(agapanthusImage);
        } else if (inputSearch.equalsIgnoreCase("Ageratum")) {
            plantPage.displayPicture(ageratumImage);
        } else if (inputSearch.equalsIgnoreCase("Amaranthus")) {
            plantPage.displayPicture(amaranthusImage);
        } else if (inputSearch.equalsIgnoreCase("Amaryllus")) {
            plantPage.displayPicture(amaryllusImage);
        } else if (inputSearch.equalsIgnoreCase("Ballota")) {
            plantPage.displayPicture(ballotaImage);
        } else if (inputSearch.equalsIgnoreCase("Begonia")) {
            plantPage.displayPicture(begoniaImage);
        } else if (inputSearch.equalsIgnoreCase("Billbergia")) {
            plantPage.displayPicture(billbergiaImage);
        } else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            plantPage.displayPicture(black_eyedImage);
        } else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            plantPage.displayPicture(blazingstarImage);
        } else if (inputSearch.equalsIgnoreCase("Borage")) {
            plantPage.displayPicture(borageImage);
        } else if (inputSearch.equalsIgnoreCase("Bottlebush")) {
            plantPage.displayPicture(bottlebrushImage);
        } else if (inputSearch.equalsIgnoreCase("Bouvardia")) {
            plantPage.displayPicture(bouvardiaImage);
        } else if (inputSearch.equalsIgnoreCase("Brachyscome")) {
            plantPage.displayPicture(brachyscomeImage);
        } else if (inputSearch.equalsIgnoreCase("Broom")) {
            plantPage.displayPicture(broomImage);
        } else if (inputSearch.equalsIgnoreCase("Buttercup")) {
            plantPage.displayPicture(buttercupImage);
        } else if (inputSearch.equalsIgnoreCase("Calceolaria")) {
            plantPage.displayPicture(calceolariaImage);
        } else if (inputSearch.equalsIgnoreCase("Calendula")) {
            plantPage.displayPicture(calendulaImage);
        } else if (inputSearch.equalsIgnoreCase("Camellia")) {
            plantPage.displayPicture(camelliaImage);
        } else if (inputSearch.equalsIgnoreCase("Cape Leadwort")) {
            plantPage.displayPicture(cape_lImage);
        } else if (inputSearch.equalsIgnoreCase("Catharanthus")) {
            plantPage.displayPicture(catharanthusImage);
        } else if (inputSearch.equalsIgnoreCase("Celosia")) {
            plantPage.displayPicture(celosiaImage);
        } else if (inputSearch.equalsIgnoreCase("Chicory")) {
            plantPage.displayPicture(chicoryImage);
        } else if (inputSearch.equalsIgnoreCase("Clarkia")) {
            plantPage.displayPicture(clarkiaImage);
        } else if (inputSearch.equalsIgnoreCase("Clover")) {
            plantPage.displayPicture(cloverImage);
        } else if (inputSearch.equalsIgnoreCase("Coral Vine")) {
            plantPage.displayPicture(coral_vineImage);
        } else if (inputSearch.equalsIgnoreCase("Cornflower")) {
            plantPage.displayPicture(cornflowerImage);
        } else if (inputSearch.equalsIgnoreCase("Cosmos")) {
            plantPage.displayPicture(cosmosImage);
        } else if (inputSearch.equalsIgnoreCase("Dahlia")) {
            plantPage.displayPicture(dahliaImage);
        } else if (inputSearch.equalsIgnoreCase("Dandelion")) {
            plantPage.displayPicture(dandelionImage);
        } else if (inputSearch.equalsIgnoreCase("Daphne")) {
            plantPage.displayPicture(daphneImage);
        } else if (inputSearch.equalsIgnoreCase("Daylily")) {
            plantPage.displayPicture(daylilyImage);
        } else if (inputSearch.equalsIgnoreCase("Desert Rose")) {
            plantPage.displayPicture(desert_rImage);
        } else if (inputSearch.equalsIgnoreCase("Dianella")) {
            plantPage.displayPicture(dianellaImage);
        } else if (inputSearch.equalsIgnoreCase("Diascia")) {
            plantPage.displayPicture(diasciaImage);
        } else if (inputSearch.equalsIgnoreCase("Dietes")) {
            plantPage.displayPicture(dietesImage);
        } else if (inputSearch.equalsIgnoreCase("Dill")) {
            plantPage.displayPicture(dillImage);
        } else if (inputSearch.equalsIgnoreCase("Marguerite")) {
            plantPage.displayPicture(margueriteImage);
        } else if (inputSearch.equalsIgnoreCase("Marigold")) {
            plantPage.displayPicture(marigoldImage);
        } else if (inputSearch.equalsIgnoreCase("Moonflower")) {
            plantPage.displayPicture(moonflowerImage);
        } else if (inputSearch.equalsIgnoreCase("Morning Glory")) {
            plantPage.displayPicture(morning_gImage);
        } else if (inputSearch.equalsIgnoreCase("Petunia")) {
            plantPage.displayPicture(petuniaImage);
        } else if (inputSearch.equalsIgnoreCase("Rosea Ice Plant")) {
            plantPage.displayPicture(rosea_iceImage);
        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            plantPage.displayPicture(wisteriaImage);
        }

        else if(((!inputSearch.equals("")) && (inputSearch!= null)) && inputSearch.matches("^[a-zA-Z]*$")){
            FXMLLoader wrong = new FXMLLoader(getClass().getResource("ZoneTenScreen.fxml"));
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

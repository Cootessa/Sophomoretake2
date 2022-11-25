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
    Image anisehyssopImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Anise Hyssop.jpg")));
    Image armeria_mImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Armeria Maritima.jpg")));
    Image asterImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Aster.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image babys_bImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Baby's Breath.jpg")));
    Image bachelors_bImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bachelor's Button.jpg")));
    Image balloon_fImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Balloon Flower.jpg")));
    Image ballotaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Ballota.jpg")));
    Image beebalmImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bee Balm.jpg")));
    Image begoniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Begonia.jpg")));
    Image bergamotImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bergamot.jpg")));
    Image bergeniaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bergenia.jpg")));
    Image black_eyedImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Black-eyed Susan.jpg")));
    Image blanket_fImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blanket Flower.jpg")));
    Image blazingstarImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blazing Star.jpg")));
    Image bleeding_hImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bleeding Heart.jpg")));
    Image bletillaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bletilla.jpg")));
    Image blue_eyedImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Blue-eyed Grass.jpg")));
    Image bluebonnetsImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bluebonnets.jpg")));
    Image borageImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Borage.jpg")));
    Image bottlebushImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bottlebush.jpg")));
    Image bouvardiaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bouvardia.jpg")));
    Image brachyscomeImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Brachyscome.jpg")));
    Image brassicaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Brassica.jpg")));
    Image broomImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Broom.jpg")));
    Image buttercupImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Buttercup.jpg")));
    Image butterfly_bImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Butterfly Bush.jpg")));
    Image calendulaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Calendula.jpg")));
    Image camelliaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Camellia.jpg")));
    Image candytuftImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Candytuft.jpg")));
    Image cape_lImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cape Leadwort.jpg")));
    Image cardinal_fImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Cardinal Flower.jpg")));
    Image carnationImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Carnation.jpg")));
    Image catmintImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Catmint.jpg")));
    /*Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));
    Image azaleaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Azalea.jpg")));*/
    Image wisteriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Wisteria.jpg")));

    private ObservableList<Plant> plant = FXCollections.observableArrayList();

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPageZone8.fxml"));
        root = loader.load();
        PlantPageZone8 plantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Agapanthus")) {
            plantPage.displayPicture(agapanthusImage);

        } else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            plantPage.displayPicture(alchemillaImage);
        } else if (inputSearch.equalsIgnoreCase("Allium")) {
            plantPage.displayPicture(alliumImage);
        } else if (inputSearch.equalsIgnoreCase("Alstroemeria")) {
            plantPage.displayPicture(alstroemeriaImage);
        } else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            plantPage.displayPicture(alyssumImage);
        } else if (inputSearch.equalsIgnoreCase("Anemone")) {
            plantPage.displayPicture(anemoneImage);
        } else if (inputSearch.equalsIgnoreCase("Anise Hyssop")) {
            plantPage.displayPicture(anisehyssopImage);
        } else if (inputSearch.equalsIgnoreCase("Armeria Maritima")) {
            plantPage.displayPicture(armeria_mImage);
        } else if (inputSearch.equalsIgnoreCase("Aster")) {
            plantPage.displayPicture(asterImage);
        } else if (inputSearch.equalsIgnoreCase("Azalea")) {
            plantPage.displayPicture(azaleaImage);}
        else if (inputSearch.equalsIgnoreCase("Baby's Breath")) {
            plantPage.displayPicture(babys_bImage);
        } else if (inputSearch.equalsIgnoreCase("Bachelor's Button")) {
            plantPage.displayPicture(bachelors_bImage);
        } else if (inputSearch.equalsIgnoreCase("Balloon Flower")) {
            plantPage.displayPicture(balloon_fImage);
        } else if (inputSearch.equalsIgnoreCase("Ballota")) {
            plantPage.displayPicture(ballotaImage);
        } else if (inputSearch.equalsIgnoreCase("Bee Balm")) {
            plantPage.displayPicture(beebalmImage);
        } else if (inputSearch.equalsIgnoreCase("Begonia")) {
            plantPage.displayPicture(begoniaImage);
        } else if (inputSearch.equalsIgnoreCase("Bergamot")) {
            plantPage.displayPicture(bergamotImage);
        } else if (inputSearch.equalsIgnoreCase("Bergenia")) {
            plantPage.displayPicture(bergeniaImage);
        } else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            plantPage.displayPicture(black_eyedImage);
        } else if (inputSearch.equalsIgnoreCase("Blanket Flower")) {
            plantPage.displayPicture(blanket_fImage);
        } else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            plantPage.displayPicture(blazingstarImage);
        } else if (inputSearch.equalsIgnoreCase("Bleeding Heart")) {
            plantPage.displayPicture(bleeding_hImage);
        } else if (inputSearch.equalsIgnoreCase("Bletilla")) {
            plantPage.displayPicture(bletillaImage);
        } else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            plantPage.displayPicture(blue_eyedImage);
        } else if (inputSearch.equalsIgnoreCase("Borage")) {
            plantPage.displayPicture(borageImage);
        } else if (inputSearch.equalsIgnoreCase("Bottlebush")) {
            plantPage.displayPicture(bottlebushImage);
        } else if (inputSearch.equalsIgnoreCase("Bouvardia")) {
            plantPage.displayPicture(bouvardiaImage);
        } else if (inputSearch.equalsIgnoreCase("Brachyscome")) {
            plantPage.displayPicture(brachyscomeImage);
        } else if (inputSearch.equalsIgnoreCase("Brassica")) {
            plantPage.displayPicture(brassicaImage);
        } else if (inputSearch.equalsIgnoreCase("Broom")) {
            plantPage.displayPicture(broomImage);
        } else if (inputSearch.equalsIgnoreCase("Buttercup")) {
            plantPage.displayPicture(buttercupImage);
        } else if (inputSearch.equalsIgnoreCase("Butterfly Bush")) {
            plantPage.displayPicture(butterfly_bImage);
        } else if (inputSearch.equalsIgnoreCase("Calendula")) {
            plantPage.displayPicture(calendulaImage);
        } else if (inputSearch.equalsIgnoreCase("Camellia")) {
            plantPage.displayPicture(camelliaImage);
        } else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            plantPage.displayPicture(candytuftImage);
        } else if (inputSearch.equalsIgnoreCase("Cape Leadwort")) {
            plantPage.displayPicture(cape_lImage);
        } else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            plantPage.displayPicture(cardinal_fImage);
        } else if (inputSearch.equalsIgnoreCase("Carnation")) {
            plantPage.displayPicture(carnationImage);
        } else if (inputSearch.equalsIgnoreCase("Catmint")) {
            plantPage.displayPicture(catmintImage);

        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            plantPage.displayPicture(wisteriaImage);
        }

        else if(((!inputSearch.equals("")) && (inputSearch!= null)) && inputSearch.matches("^[a-zA-Z]*$")){
            FXMLLoader wrong = new FXMLLoader(getClass().getResource("ZoneEightScreen.fxml"));
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
        plant.addAll(new Plant("Agapanthus"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alstroemeria"),new Plant("Alyssum"), new Plant("Anemone")
                , new Plant("Anise Hyssop"), new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Azalea"), new Plant("Baby's Breath"), new Plant("Bachelor's Button")
                , new Plant("Balloon Flower"), new Plant("Ballota"), new Plant("Bee Balm"), new Plant("Begonia"), new Plant("Bergamot"), new Plant("Bergenia")
                , new Plant("Black-eyed Susan"), new Plant("Blanket Flower"), new Plant("Blazing Star"), new Plant("Bleeding Heart"), new Plant("Bletilla"), new Plant("Blue-eyed Grass")
                , new Plant("Cardinal Flower"), new Plant("Butterfly Bush"), new Plant("Calendula"), new Plant("Camellia"), new Plant("Candytuft"), new Plant("Cape Leadwort")
                , new Plant("Carnation"), new Plant("Catmint"), new Plant("Wisteria"));/*, new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria")
                , new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria")
                , new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria")
                , new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"), new Plant("Wisteria"));*/
        return plant;
    }
}

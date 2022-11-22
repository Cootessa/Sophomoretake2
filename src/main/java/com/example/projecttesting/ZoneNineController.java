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

public class ZoneNineController implements Initializable {

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
    Image bottlebrushImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bottlebrush.jpg")));
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
    Image wisteriaImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Wisteria.jpg")));


    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPageZone9.fxml"));
        root = loader.load();
        PlantPageZone9 plantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("Agapanthus")) {
            PlantPageZone9.displayPicture(agapanthusImage);

        } else if (inputSearch.equalsIgnoreCase("Alchemilla")) {
            PlantPageZone9.displayPicture(alchemillaImage);
        } else if (inputSearch.equalsIgnoreCase("Allium")) {
            PlantPageZone9.displayPicture(alliumImage);
        } else if (inputSearch.equalsIgnoreCase("Alstroemeria")) {
            PlantPageZone9.displayPicture(alstroemeriaImage);
        } else if (inputSearch.equalsIgnoreCase("Alyssum")) {
            PlantPageZone9.displayPicture(alyssumImage);
        } else if (inputSearch.equalsIgnoreCase("Anemone")) {
            PlantPageZone9.displayPicture(anemoneImage);
        } else if (inputSearch.equalsIgnoreCase("Anise Hyssop")) {
            PlantPageZone9.displayPicture(anisehyssopImage);
        } else if (inputSearch.equalsIgnoreCase("Armeria Maritima")) {
            PlantPageZone9.displayPicture(armeria_mImage);
        } else if (inputSearch.equalsIgnoreCase("Aster")) {
            PlantPageZone9.displayPicture(asterImage);
        } else if (inputSearch.equalsIgnoreCase("Azalea")) {
            PlantPageZone9.displayPicture(azaleaImage);}
        else if (inputSearch.equalsIgnoreCase("Baby's Breath")) {
            PlantPageZone9.displayPicture(babys_bImage);
        } else if (inputSearch.equalsIgnoreCase("Bachelor's Button")) {
            PlantPageZone9.displayPicture(bachelors_bImage);
        } else if (inputSearch.equalsIgnoreCase("Balloon Flower")) {
            PlantPageZone9.displayPicture(balloon_fImage);
        } else if (inputSearch.equalsIgnoreCase("Ballota")) {
            PlantPageZone9.displayPicture(ballotaImage);
        } else if (inputSearch.equalsIgnoreCase("Bee Balm")) {
            PlantPageZone9.displayPicture(beebalmImage);
        } else if (inputSearch.equalsIgnoreCase("Begonia")) {
            PlantPageZone9.displayPicture(begoniaImage);
        } else if (inputSearch.equalsIgnoreCase("Bergamot")) {
            PlantPageZone9.displayPicture(bergamotImage);
        } else if (inputSearch.equalsIgnoreCase("Bergenia")) {
            PlantPageZone9.displayPicture(bergeniaImage);
        } else if (inputSearch.equalsIgnoreCase("Black-eyed Susan")) {
            PlantPageZone9.displayPicture(black_eyedImage);
        } else if (inputSearch.equalsIgnoreCase("Blanket Flower")) {
            PlantPageZone9.displayPicture(blanket_fImage);
        } else if (inputSearch.equalsIgnoreCase("Blazing Star")) {
            PlantPageZone9.displayPicture(blazingstarImage);
        } else if (inputSearch.equalsIgnoreCase("Bleeding Heart")) {
            PlantPageZone9.displayPicture(bleeding_hImage);
        } else if (inputSearch.equalsIgnoreCase("Bletilla")) {
            PlantPageZone9.displayPicture(bletillaImage);
        } else if (inputSearch.equalsIgnoreCase("Blue-eyed Grass")) {
            PlantPageZone9.displayPicture(blue_eyedImage);
        } else if (inputSearch.equalsIgnoreCase("Borage")) {
            PlantPageZone9.displayPicture(borageImage);
        } else if (inputSearch.equalsIgnoreCase("Bottlebrush")) {
            PlantPageZone9.displayPicture(bottlebrushImage);
        } else if (inputSearch.equalsIgnoreCase("Bouvardia")) {
            PlantPageZone9.displayPicture(bouvardiaImage);
        } else if (inputSearch.equalsIgnoreCase("Brachyscome")) {
            PlantPageZone9.displayPicture(brachyscomeImage);
        } else if (inputSearch.equalsIgnoreCase("Brassica")) {
            PlantPageZone9.displayPicture(brassicaImage);
        } else if (inputSearch.equalsIgnoreCase("Broom")) {
            PlantPageZone9.displayPicture(broomImage);
        } else if (inputSearch.equalsIgnoreCase("Buttercup")) {
            PlantPageZone9.displayPicture(buttercupImage);
        } else if (inputSearch.equalsIgnoreCase("Butterfly Bush")) {
            PlantPageZone9.displayPicture(butterfly_bImage);
        } else if (inputSearch.equalsIgnoreCase("Calendula")) {
            PlantPageZone9.displayPicture(calendulaImage);
        } else if (inputSearch.equalsIgnoreCase("Camellia")) {
            PlantPageZone9.displayPicture(camelliaImage);
        } else if (inputSearch.equalsIgnoreCase("Candytuft")) {
            PlantPageZone9.displayPicture(candytuftImage);
        } else if (inputSearch.equalsIgnoreCase("Cape Leadwort")) {
            PlantPageZone9.displayPicture(cape_lImage);
        } else if (inputSearch.equalsIgnoreCase("Cardinal Flower")) {
            PlantPageZone9.displayPicture(cardinal_fImage);
        } else if (inputSearch.equalsIgnoreCase("Carnation")) {
            PlantPageZone9.displayPicture(carnationImage);
        } else if (inputSearch.equalsIgnoreCase("Catmint")) {
            PlantPageZone9.displayPicture(catmintImage);
        }
        else if (inputSearch.equalsIgnoreCase("Wisteria")) {
            PlantPageZone9.displayPicture(wisteriaImage);
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
        plant.addAll(new Plant("Agapanthus"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alstroemeria"),new Plant("Alyssum"), new Plant("Anemone")
                , new Plant("Anise Hyssop"), new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Azalea"), new Plant("Baby's Breath"), new Plant("Bachelor's Button")
                , new Plant("Balloon Flower"), new Plant("Ballota"), new Plant("Bee Balm"), new Plant("Begonia"), new Plant("Bergamot"), new Plant("Bergenia")
                , new Plant("Black-eyed Susan"), new Plant("Blanket Flower"), new Plant("Blazing Star"), new Plant("Bleeding Heart"), new Plant("Bletilla"), new Plant("Blue-eyed Grass")
                , new Plant("Cardinal Flower"), new Plant("Butterfly Bush"), new Plant("Calendula"), new Plant("Camellia"), new Plant("Candytuft"), new Plant("Cape Leadwort")
                , new Plant("Carnation"), new Plant("Catmint"), new Plant("Wisteria"));
        return plant;
    }
}

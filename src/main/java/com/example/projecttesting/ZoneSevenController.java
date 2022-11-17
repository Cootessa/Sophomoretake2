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


    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();

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
        plant.addAll(new Plant("Aconite"), new Plant("Alchemilla"), new Plant("Allium"), new Plant("Alstroemeria"), new Plant("Alyssum"),
                new Plant("Anemone"), new Plant("Anise Hyssop"), new Plant("Armeria Maritima"), new Plant("Aster"), new Plant("Azalea"),
                new Plant("Baby's Breath"), new Plant("Bachelor's Button"), new Plant("Balloon Flower"), new Plant("Ballota"), new Plant("Bee Balm"),
                new Plant("Begonia"), new Plant("Bergamot"), new Plant("Bergenia"), new Plant("Black-eyed Susan"), new Plant("Blanket Flower"),
                new Plant("Blazing Star"), new Plant("Bleeding Heart"), new Plant("Bletilla"), new Plant("Blue-eyed Grass"), new Plant("Bluestar Flower"),
                new Plant("Borage"), new Plant("Brassica"), new Plant("Butterfly Bush"), new Plant("Camellia"), new Plant("Candytuft"),
                new Plant("Cardinal Flower"), new Plant("Carnation"), new Plant("Catmint"), new Plant("Cerastium Tomentosum"), new Plant("Chicory"),
                new Plant("Chionodoxa"), new Plant("Chrysanthemum"), new Plant("Clarkia"), new Plant("Clematis"), new Plant("Clover"), new Plant("Columbine"),
                new Plant("Coneflower"), new Plant("Coral Bells"), new Plant("Coreopsis"), new Plant("Cornflower"), new Plant("Corydalis"),
                new Plant("Cosmos"), new Plant("Cotoneaster"), new Plant("Crocosmia"), new Plant("Crocus"), new Plant("Crow Imperial"), new Plant("Cucko Flower"),
                new Plant("Daffodil"), new Plant("Daisy"), new Plant("Daphne"), new Plant("Daylily"), new Plant("Decumaria"), new Plant("Delphinium"),
                new Plant("Deutzia"), new Plant("Dianthus Barbatus"), new Plant("Dutch Iris"), new Plant("Geranium"), new Plant("Hollyhock"),
                new Plant("Lavender"), new Plant("Lilac"), new Plant("Lily"), new Plant("Marigold"), new Plant("Morning Glory"), new Plant("Primrose"),
                new Plant("Rose"), new Plant("Tulip"), new Plant("Wisteria"));
        return plant;
    }
}

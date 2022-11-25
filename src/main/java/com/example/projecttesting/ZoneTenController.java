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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ZoneTenController implements Initializable {

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

    //Search button
    public void buttonSearch(ActionEvent e) throws IOException {
        String inputSearch = filterField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PlantPageZone10.fxml"));
        root = loader.load();
        PlantPageZone10 plantPage = loader.getController();
        if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
        }
        else if (inputSearch.equalsIgnoreCase("")) {
            //plantPage.displayPicture();
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
        plant.add(new Plant("Sweet"));
        return plant;
    }
}

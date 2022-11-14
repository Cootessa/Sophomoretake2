package com.example.projecttesting;


import javafx.beans.property.SimpleStringProperty;

public class Plant{
    private SimpleStringProperty plantName;

    Plant(String plant){
        this.plantName = new SimpleStringProperty(plant);
    }

    public String getPlantName(){
        return plantName.get();
    }

    public void setPlantName(SimpleStringProperty plant){
        this.plantName = plant;
    }
}

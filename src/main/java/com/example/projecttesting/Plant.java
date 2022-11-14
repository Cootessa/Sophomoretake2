package com.example.projecttesting;


import javafx.beans.property.SimpleStringProperty;

public class Plant {
    private SimpleStringProperty plantName;

    public Plant(String plantName) {
        this.plantName = new SimpleStringProperty(plantName);
    }

    public String getPlantName(){
        return plantName.get();
    }
    public void setPlantName(String plantName) {
        setPlantName(plantName);
    }
}

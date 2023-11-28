package com.termproj.Flitey.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aircraft {

    @Id
    private int aircraftID;
    private String modelName;

    public Aircraft(){
    }

    public Aircraft(int id, String name) {
        this.aircraftID = id;
        this.modelName = name;
    }

    public int getID() { return this.aircraftID; }
    public String getName() { return this.modelName; }

    public void setID(int id) { this.aircraftID = id; }
    public void setName(String name) { this.modelName = name; }

    public String toString() {
        return "Aircraft ID: " + this.aircraftID + "\t\tModel Name: " + this.modelName;
    }


}

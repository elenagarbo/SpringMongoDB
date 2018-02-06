package com.curso.springMondoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 

@Document(collection = "cars") //crea coleccion en mongo
public class Car {
    
	@Id
    private String id;
    private String brand;
    private String model;
 
    public Car(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id:- " + getId() + ", Brand:- " + getBrand() + ", Model:- " + getModel());
        return str.toString();
    }
 
}
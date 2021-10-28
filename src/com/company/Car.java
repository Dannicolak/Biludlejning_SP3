package com.company;

//Attributes
//Abstract class
public abstract class Car {
   int RegNr;
   String Brand;
   private String Model;
   int Year;
   int NumberDoors;

    //Constructor
    public Car(int regNr, String brand, String model, int year, int numberDoors) {
        this.RegNr = regNr;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.NumberDoors = numberDoors;
    }

    //Getters and Setters
    public int getRegNr() {
        return RegNr;
    }

    public void setRegNr(int regNr) {
        RegNr = regNr;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getNumberDoors() {
        return NumberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        NumberDoors = numberDoors;
    }
  //Abstract method
public abstract double BeregnGrønEjerafgift();
}








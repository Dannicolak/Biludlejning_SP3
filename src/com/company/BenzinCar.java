package com.company;

public class BenzinCar {
    int RegNr;
    String Brand;
   private String Model;
   int Year;
   int NumberDoors;
   int OktanNumber;
   int KmPrl;

    public BenzinCar(int regNr, String brand, String model, int year, int numberDoors, int oktanNumber, int kmPrl) {
        this.RegNr = regNr;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.NumberDoors = numberDoors;
        this.OktanNumber = oktanNumber;
        this.KmPrl = kmPrl;
    }

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

    public int getOktanNumber() {
        return OktanNumber;
    }

    public void setOktanNumber(int oktanNumber) {
        OktanNumber = oktanNumber;
    }

    public int getKmPrl() {
        return KmPrl;
    }

    public void setKmPrl(int kmPrl) {
        KmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



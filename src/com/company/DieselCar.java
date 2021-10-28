package com.company;

public class DieselCar {
   int RegNr;
   String Brand;
   private String Model;
   int Year;
   int NumberDoors;
   String Partikelfilter;
   int KmPrl;

    public DieselCar(int regNr, String brand, String model, int year, int numberDoors, String partikelfilter, int kmPrl) {
        this.RegNr = regNr;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.NumberDoors = numberDoors;
        this.Partikelfilter = partikelfilter;
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

    public String getPartikelfilter() {
        return Partikelfilter;
    }

    public void setPartikelfilter(String partikelfilter) {
        Partikelfilter = partikelfilter;
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



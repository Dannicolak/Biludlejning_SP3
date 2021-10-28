package com.company;

public class ElCar {
   int RegNr;
   String Brand;
   private String Model;
   int Year;
   int NumberDoors;
   int BatterikapacitetKWh;
   int MaxKm;
   int whPrKm;

    public ElCar(int regNr, String brand, String model, int year, int numberDoors, int batterikapacitetKWh, int maxKm, int whPrKm) {
        this.RegNr = regNr;
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.NumberDoors = numberDoors;
        this.BatterikapacitetKWh = batterikapacitetKWh;
        this.MaxKm = maxKm;
        this.whPrKm = whPrKm;
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

    public int getBatterikapacitetKWh() {
        return BatterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        BatterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return MaxKm;
    }

    public void setMaxKm(int maxKm) {
        MaxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}


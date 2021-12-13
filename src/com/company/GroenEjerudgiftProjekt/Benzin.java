package com.company.GroenEjerudgiftProjekt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Benzin extends Car {
    Double kmPrlitre;

    public Benzin(String make, String model, String power, Date registration, Double kmPrlitre) {
        super(make, model, power, registration);
        this.kmPrlitre = kmPrlitre;
    }

    public Double getKmPrlitre() {
        return kmPrlitre;
    }

    public void setKmPrlitre(Double kmPrlitre) {
        this.kmPrlitre = kmPrlitre;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String registrationString = dateFormat.format(registration);
        return make + ", " +
                model + ", " +
                power + ", " +
                registrationString;
    }
}


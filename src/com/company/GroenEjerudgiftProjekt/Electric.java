package com.company.GroenEjerudgiftProjekt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Electric extends Car {
    Double kwPrHour;

    public Electric(String make, String model, String power, Date registration, Double kwPrHour) {
        super(make, model, power, registration);
        this.kwPrHour = kwPrHour;
    }

    public Double getKwPrHour() {
        return kwPrHour;
    }

    public void setKwPrHour(Double kwPrHour) {
        this.kwPrHour = kwPrHour;
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

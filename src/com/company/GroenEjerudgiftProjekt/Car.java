package com.company.GroenEjerudgiftProjekt;

import java.util.Date;

public class Car {
    String make;
    String model;
    String power;
    Date registration;

    public Car(String make, String model, String power,Date registration) {
        this.make = make;
        this.model = model;
        this.power = power;
        this.registration = registration;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }
}

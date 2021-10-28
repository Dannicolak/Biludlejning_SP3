package com.company;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car = new Car("575", "Mercedes", "E220", "2021", "5") {
            BenzinCar benzinCar = new BenzinCar("1012", "BMW", "X7", "2019", "5", "3", "4");
            DieselCar dieselCar = new DieselCar("76597", "Volkswagen", "Golf GTD", "2018", "5", "54", "16");
            ElCar elCar = new ElCar("8646", "Tesla", "Model 3", "2017", "5", "4", "500", "10");
        };
    }
}
package com.company;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /* Car car = new Car(575, "Mercedes", "E220", 2021, 5) {
            BenzinCar benzinCar = new BenzinCar(1012, "BMW", "X7", 2019, 5, 3, 4);
            DieselCar dieselCar = new DieselCar(76597, "Volkswagen", "Golf GTD", 2018, 5, 54, 16);
            ElCar elCar = new ElCar(8646, "Tesla", "Model 3", 2017, 5, 4, 500, 10);
        }; */

        try {
            Scanner input = null;
            input = new Scanner(new File("/Users/zanadannicolak/IdeaProjects/Biludlejning SP3/data/testFil.txt"));
            String answer = input.nextLine();
            System.out.println(answer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
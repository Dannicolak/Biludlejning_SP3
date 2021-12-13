package com.company.GroenEjerudgiftProjekt;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        try {
            Scanner input = null;
            input = new Scanner(new File("/Users/zanadannicolak/IdeaProjects/Biludlejning SP3/data/testFil.txt"));

            while (input.hasNext()) {
                String carRawData = input.nextLine();

                List<String> carSplit = Arrays.stream(carRawData.split(";")).toList();

                String make = carSplit.get(0);
                String model = carSplit.get(1);
                String power = carSplit.get(2);
                Date registration = new SimpleDateFormat("dd-MM-yyyy").parse(carSplit.get(3));
                Double fuelConsomption = Double.valueOf(carSplit.get(4));

                Car car;
                if (power.equals("Diesel")) {
                    car = new Diesel(make, model, power, registration, fuelConsomption);
                } else if (power.equals("Benzin")) {
                    car = new Benzin(make, model, power, registration, fuelConsomption);
                } else if (power.equals("Electric")) {
                    car = new Electric(make, model, power, registration, fuelConsomption);
                } else {
                car = null;
            }

                cars.add(car);
            }

            // GUI
            CalculateGreenFee gui = new CalculateGreenFee();

            // Tilføj bilerne
            for (Car car : cars) {
                gui.getComboBox1().addItem(car);
            }

            // Åbn GUI
            JFrame frame = new JFrame("CalculateGreenFee");
            frame.setContentPane(gui.getMainPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setSize(800, 200);



            System.out.println("");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
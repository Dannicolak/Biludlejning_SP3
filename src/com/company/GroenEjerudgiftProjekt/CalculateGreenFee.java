package com.company.GroenEjerudgiftProjekt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateGreenFee {
    private JComboBox comboBox1;
    private JButton beregnButton;
    private JTextArea textArea1;
    private JPanel mainPane;

    public CalculateGreenFee() {

        beregnButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // kode der skal køre, når knappen trykkes
                Car selectedCar = (Car) comboBox1.getSelectedItem();
                Double greenFee = 0.0;
                if (selectedCar.getPower().equals("Diesel")) {
                    Diesel selectedDiesel = (Diesel) comboBox1.getSelectedItem();
                    greenFee = selectedDiesel.getKmPrlitre() * 100;
                } else if (selectedCar.getPower().equals("Benzin")){
                    Benzin selectedBenzin = (Benzin) comboBox1.getSelectedItem();
                    greenFee = selectedBenzin.getKmPrlitre()*50;
                } else if (selectedCar.getPower().equals("Electric")){
                    Electric selectedElectric = (Electric) comboBox1.getSelectedItem();
                    greenFee = selectedElectric.getKwPrHour()*10;
                }else if (selectedCar.getPower().equals("Hybrid")){

                }
// lav de rigtige beregninger
                textArea1.setText("Grøn afgiften er: "+greenFee + " kr.");


            }
        });
    }

    public JPanel getMainPane() {
        return mainPane;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }
}

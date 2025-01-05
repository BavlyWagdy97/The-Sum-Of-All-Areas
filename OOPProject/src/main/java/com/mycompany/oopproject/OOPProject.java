package com.mycompany.oopproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OOPProject {

    private static double totalArea = 0.0;

    public static void main(String[] args) {
        // Prepare User InterFace
        JFrame frame = new JFrame("Shape Area Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Componant
        JLabel shapeTypeLabel = new JLabel("Enter Shape Type (circle or cube):");
        JTextField shapeTypeField = new JTextField();

        JLabel dimensionLabel = new JLabel("Enter Dimension (radius or side):");
        JTextField dimensionField = new JTextField();

        JButton addShapeButton = new JButton("Add Shape");
        JButton calculateButton = new JButton("Calculate Total Area");

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Componants ==> User Interface
        frame.add(shapeTypeLabel);
        frame.add(shapeTypeField);
        frame.add(dimensionLabel);
        frame.add(dimensionField);
        frame.add(addShapeButton);
        frame.add(calculateButton);
        frame.add(new JScrollPane(resultArea));

        // Buttom to 
        addShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shapeType = shapeTypeField.getText().trim();
                String dimensionText = dimensionField.getText().trim();
                double dimension;

                try {
                    dimension = Double.parseDouble(dimensionText);
                    if (dimension <= 0) {
                        JOptionPane.showMessageDialog(frame,
                                "Dimension must be greater than 0.",
                                "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter a valid number for the dimension.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (shapeType.equalsIgnoreCase("circle")) {
                    Circle circle = new Circle("Blue" , dimension);
                    double area = circle.getArea();
                    totalArea += area;
                    resultArea.append("Added Circle with radius " + dimension + ", Area: " + area + " , The Type Of Object Is " + circle.getName() +"\n");
                } else if (shapeType.equalsIgnoreCase("cube")) {
                    Cube cube = new Cube("Black" , dimension);
                    double area = cube.getArea();
                    totalArea += area;
                    resultArea.append("Added Cube with side " + dimension + ", Area: " + area +" , The Type Of Object Is " + cube.getName() + "\n");
                } else {
                    JOptionPane.showMessageDialog(frame,
                            "Shape not recognized. Please enter 'circle' or 'cube'.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }

                // Remove
                shapeTypeField.setText("");
                dimensionField.setText("");
            }
        });

        // Bottum Calculate The Total Area
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.append("Total Area: " + totalArea + "\n");
            }
        });

        frame.setVisible(true);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author Bavly
 */
public class Cube extends ThreeDShape implements Drawable{
    private double side ;    
    
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Cube(double side) {
        this.side = side;
    }
    
    public Cube(String color , double side) {
        super(color);
        this.side = side;
    }
    
    public String toString(){
        return ("Cube [Side is " + side + "]");
    }
    /**
     *
     * @return
     */
    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getPerimeter() {
        return 12 * side;
    }
    
    @Override
    public String howToDraw() {
        return ("Circle");
    }

    @Override
    public String getName() {
        return ("Double");
    }
}

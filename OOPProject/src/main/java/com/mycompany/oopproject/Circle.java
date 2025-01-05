/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author Bavly
 */
public class Circle extends Shape implements Drawable{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    Circle(double radius){
        this.radius = radius;
    }
    
    Circle(String color , double radius){
        super(color);
        this.radius=radius;
    }
    
    public String toString(){
        return ("Circle : [ Radius is " + radius +" ]" );
    }
            
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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

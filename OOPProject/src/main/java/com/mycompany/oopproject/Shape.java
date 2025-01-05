/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;
import java.util.Date;
/**
 *
 * @author Bavly
 */
public abstract class Shape {
    private Date currentDate ;
    private String Color ; 

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getColor() {
        return Color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getName();
    Shape(){
        
    }
    Shape(String Color){
        this.Color=Color;
    }
}

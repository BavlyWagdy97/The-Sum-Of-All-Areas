/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopproject;

/**
 *
 * @author Bavly
 */
public abstract class ThreeDShape extends Shape {
    public abstract double getVolume();
    ThreeDShape(){
        super();
    }
   
    ThreeDShape(String color){
        super(color);
    }
}

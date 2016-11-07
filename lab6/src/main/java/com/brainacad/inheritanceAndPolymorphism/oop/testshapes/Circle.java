package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 * Created by Huamani V.R on 07.11.2016.
 */
public class Circle extends Shape {
    private static final double PI = Math.PI;
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public  double calcArea (){
        return PI*Math.pow(radius, 2);
    }
//    @Override
//    public void getArea(){
//        System.out.printf("%s %,.5f","Circle area is:", this.calcArea());
//    }

     @Override
    public String toString(){
         return String.format("%s, %s %,.2f",  super.toString(),"radius = ", getRadius());
     }

}

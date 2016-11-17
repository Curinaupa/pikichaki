package com.brainacad.abstractClassesInterfaces;

import java.util.Comparator;

/**
 * Created by Huamani V.R on 13.11.2016.
 */
public class Circle extends Shape implements Comparable<Circle>{
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
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        //String str = this.toString() + " area is :"+calcArea();
        System.out.printf("%s %s %,.2f\n", this.toString(),"area is:", calcArea());
    }

    @Override
    public String toString() {
        return String.format("%s, %s %,.2f", super.toString(), "radius = ", getRadius());
    }

    @Override
    public int compareTo(Circle o) {
        if (this.calcArea() < o.calcArea()){
            return  -1;
        }
        if (this.calcArea() > o.calcArea()){
            return  1;
        }
        return 0;
    }
}

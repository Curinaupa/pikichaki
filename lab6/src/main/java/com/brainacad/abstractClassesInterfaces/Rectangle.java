package com.brainacad.abstractClassesInterfaces;

/**
 * Created by Huamani V.R on 15.11.2016.
 */
public class Rectangle extends Shape implements Comparable<Rectangle>{
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calcArea() {
        return getHeight()*getWidth();
    }

    @Override
    public void draw() {
        System.out.printf("%s %s %,.2f\n", this.toString(),"area is:", calcArea());
    }

    @Override
    public int compareTo(Rectangle o) {
        if (this.calcArea() < o.calcArea()){
            return  -1;
        }
        if (this.calcArea() > o.calcArea()){
            return  1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s, %s %,.2f, %s %,.2f",super.toString(), "width=", getWidth(), "height=", getHeight());
    }


}

package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 *Add to project  “MyShapes” a new class “Rectangle” which is a subclass of Shape.
 Add to class Rectangle a private field’s width and height (of double type).
 In class Rectangle override  calcArea() method which must return area of rectangle
 (By the formula:  area  = width* height).
 In class Rectangle override the toString() method. It must return string which contain name of shape, color and rectangle width and height. Example:
 “This is Rectangle, color: RED, width=11, height=22”
 Add to class Rectangle constructor with color , width and height arguments.

 Then add to class MainLab141 code to create one Rectangle object and print it name, color, width and height to console. Then invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Rectangle, color: RED, width=11, height=22”
 “Shape area is: 242”

 */
public class Rectangle extends Shape {
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
    public  double calcArea (){
        return getWidth()*getHeight();
    }

    @Override
    public String toString(){
        return String.format("%s, %s %,.2f, %s %,.2f",super.toString(), "width=", getWidth(), "height=", getHeight());
    }
}

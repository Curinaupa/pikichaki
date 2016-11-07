package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 * Add to project  “MyShapes” a new class “Triangle” which is a subclass of Shape.
 * Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
 * In class Triangle override  calcArea() method which must return area of triangle
 * (By the formula:  area  = Vs(s-a)(s-b)(s-c)   , where s=(a+b+c)/2  ).
 * In class Triangle override the toString() method. It must return string which contain name of shape,
 * color and a, b, c sides of triangle. Example:
 * “This is Triangle, color: BLACK, a=5, b=5, c=5”
 * Add to class Triangle constructor with color, a, b and c arguments.
 * <p>
 * Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle
 * to console. Then invoke calcArea() method and print result to console.
 * Program output must looks like:
 * “This is Triangle, color: BLACK, a=5, b=5, c=5”
 * “Shape area is: 10.825”
 */
public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String shapeColor, double sideA, double sideB, double sideC) {
        super(shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double s = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }

    @Override
    public String toString() {
        return String.format("%s, %s %,.2f, %s %,.2f %s %,.2f", super.toString(),
                "side A:", getSideA(), "side B:", getSideB(), "side C", getSideC() );
    }
}

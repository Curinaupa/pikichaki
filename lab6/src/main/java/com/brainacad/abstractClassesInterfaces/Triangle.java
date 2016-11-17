package com.brainacad.abstractClassesInterfaces;

/**
 * Created by Huamani V.R on 15.11.2016.
 */
public class Triangle extends Shape implements Comparable<Triangle>{
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
    double calcArea() {
        double s = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }

    @Override
    public String toString() {
        return String.format("%s, %s %,.2f, %s %,.2f %s %,.2f", super.toString(),
                "side A:", getSideA(), "side B:", getSideB(), "side C", getSideC() );
    }

    @Override
    public void draw() {
        System.out.printf("%s %s %,.2f\n", this.toString(),"area is:", calcArea());
    }

    @Override
    public int compareTo(Triangle o) {
        if (this.calcArea() < o.calcArea()){
            return  -1;
        }
        if (this.calcArea() > o.calcArea()){
            return  1;
        }
        return 0;
    }
}

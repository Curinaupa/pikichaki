package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 * Created by Huamani V.R on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Red");
        System.out.println(shape);
        shape.getArea();

        Circle circle = new Circle("Green",10.00);
        System.out.println(circle);
        circle.getArea();

        Rectangle rectangle = new Rectangle("Yellow", 10, 20);
        System.out.println(rectangle);
        rectangle.getArea();

    }
}

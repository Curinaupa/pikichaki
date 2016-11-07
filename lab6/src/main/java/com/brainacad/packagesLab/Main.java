package com.brainacad.packagesLab;


import com.brainacad.packagesLab.carpack.Car;
import com.brainacad.packagesLab.example.applepack.Apple;

/**
 * Create a project with structure:
 package example.applepack
 package com.brainacad.packagesLab.carpack
 package example.testpack
 Create two classes:
 1)	Class of Apple (in the package example.applepack) with methods getMass, setMass, which provide access to the field
 “weight” as double type.
 2)	Class of Car (in the package com.brainacad.packagesLab.carpack) with methods getMass, setMass, which provide access to the field
 “weight” as double type.

 Create class Main (in the package example.testpack) with method main(), which creates an instance of Apple and Car
 (use import statement ),  then prints its value of weight for each instance;

 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Apple apple = new Apple();
        System.out.println(car.getWeight());
        System.out.println(apple.getWeight());

    }
}

package com.brainacad.classAndInstance;
/**
 * Add to class Computer method void view (){} that prints all fields of object in line.
 Print all info (fields) of all objects in console.

 */
public class Lab215 {
    public static void main(String[] args) {
        Computer c1 = new Computer("Mac" , 12345 , 100f , 8 , 3000);
        Computer c2 = new Computer("Apple" , 12345678 , 1000f , 4 , 5000);
        c1.view();
        c2.view();
    }
}


package com.brainacad.genericos;

import java.util.Arrays;

/**
 * Create new project called  TestGenerics2.
 * Add package “com.brainacad.oop.testgenerics2”.
 * Create a generic class MyTestMethod with static method “calcNum” (with two parameters:
 * an array T[] and variable maxelm of type T) that counts the number of elements in an array T[]
 * that are greater than a specified element maxelm.
 * Create a class Main with a main( ) method.
 * Add to method main() code that creates two array, first – array of Integer type and second –
 * array of Double type. Fill these arrays with some random values.
 * Add code to counts the number of elements in each of arrays  that are greater than a specified element
 * by invoking calcNum static method.
 * Execute the program.
 * The program output must be like next example:
 * Array values: [1,2,3,4,5,6,7,8,9]
 * Number of elements that are greater than 3:
 * 6
 * Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 * Number of elements that are greater than 3:
 * 7
 */
public class Lab2142 {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] arrDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        System.out.println("Array values:" + Arrays.toString(arrInt));
        System.out.println("Number of elements that are greater than 3");
        System.out.println(MyTestMethod.calcNum(arrInt,3));
        System.out.println("Array values:" + Arrays.toString(arrDouble));
        System.out.println("Number of elements that are greater than 3");
        System.out.println(MyTestMethod.calcNum(arrDouble,3.0));
    }

}

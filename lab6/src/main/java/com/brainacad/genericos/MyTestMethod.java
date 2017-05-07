package com.brainacad.genericos;

import jdk.nashorn.internal.ir.IfNode;

/**
 * Create new project called  TestGenerics2.
 * Add package “com.brainacad.oop.testgenerics2”.
 * Create a generic class MyTestMethod with static method “calcNum” (with two parameters:
 * an array T[] and variable maxelm of type T) that counts the number of elements in an array T[]
 * that are greater than a specified element maxelm.
 * Create a class MainLab141 with a main( ) method.
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
public class MyTestMethod {

    public static <T extends Comparable<T>> int calcNum(T[] arr, T compareElem) {

        int countElem = 0;

        for (T element : arr) {
            if (element.compareTo(compareElem) > 0) {
                countElem++;

            }
        }
        return countElem;

    }

    public static <T extends Number & Comparable<T>> T calcSumI(T[] arr, T compareElem) {

        int countElem = 0;
        double sum = 0;
        double suma = 0;
        if (compareElem instanceof Integer) {
            for (T element : arr) {
                if (element.compareTo(compareElem) > 0) {
                    countElem++;
                    sum = sum + element.intValue();
                }
            }
            return (T) new Integer((int)sum);

        } else if (compareElem instanceof Double) {
            for (T element : arr) {
                if (element.compareTo(compareElem) > 0) {
                    countElem++;
                    sum = sum + element.doubleValue();
                }

            }
            return (T) new Double(sum);

        }
        return null;

    }


}
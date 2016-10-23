package com.brainacad.methods;

import java.util.Arrays;

/**
 * Write class that create instances of class Matrix and execute his methods.
 */
public class Lab222 {
    private int number;
    private double doubleNumber;
    private int [] matrix ; //= new int [5];
    private String[] arrayString ; // = new String[10];
    public Lab222(int number, int [] matrix){
        this.number = number;
        this.matrix = matrix;
    }
    public Lab222(double numberDouble, String[] arrayString){
        doubleNumber = numberDouble;
        this.arrayString = arrayString;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[] matrix) {
        this.matrix = matrix;
    }

    public String[] getArrayString() {
        return arrayString;
    }

    public void setArrayString(String[] arrayString) {
        this.arrayString = arrayString;
    }

    @Override
    public String toString() {
        return "Lab222{" +
                "matrix=" + Arrays.toString(matrix) +
                ", arrayString=" + Arrays.toString(arrayString) +
                '}';
    }

    public static void main(String[] args) {
        int [] matrixTest = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] stringsTestArray = {"One", "Two", "Three", "Four"};
        Lab222 testInstanceClass = new Lab222(5, matrixTest);
        Lab222 testClass = new Lab222(10, stringsTestArray);
        System.out.println(testInstanceClass.toString());
        System.out.println(testClass.toString());

    }
}

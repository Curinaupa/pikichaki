package com.brainacad.staticMethods;

/**
 * /**
 * Write a class MyPyramid with public static method printPyramid(int h) that takes parameter
 * an integer h between 1 and 9, and prints a pyramid of numbers of height h.
 * Example: For h = 4 the method should print the pyramid
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 */
public class Pyramide {
    public static String getCurrentRow(int rows, int totalRows) {
        String str="";
        for (int i = 0; i <= totalRows-rows; i++) {
            str += " ";
        }
        for (int i = 1; i <= rows; i++) {
            str += i;
        }
        for (int i = rows - 1; i > 0; i--) {
            str += i;
        }

        return str ;

    }

    public static String getPyramide(int numberOfRows) {
        String str = "";
        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {
            str = str + getCurrentRow(currentRow, numberOfRows);
            str +="\n";
        }
        return str;
    }

    public static void main(String[] args) {
        Pyramide pyramide = new Pyramide();
        System.out.println(Pyramide.getPyramide(10));

    }
}
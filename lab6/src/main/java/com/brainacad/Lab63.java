package com.brainacad;

//Write a program, which creates square matrix like those in the figure below and prints them formatted to the console.
//        The size of the matrix is 4 x 4:

import java.util.Arrays;

public class Lab63 {
    public static void main(String[] args) {
        int[][] matrix =  {{1, 5, 9,13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 10, 12}
        };

        for (int [] a:matrix ) {
            for (int b: a) {
                System.out.print(b);
            }
            System.out.println();

        }
        System.out.println(Arrays.toString(matrix));
    }
}

package com.brainacad;
import java.util.Arrays;

//Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.
public class Lab61 {
    public static void main(String[] args) {
        int[] array1 = new int[15];
        for (int i = 1; i <15 ; i++) {
            array1[i-1] = i*2;
        }
        System.out.println(Arrays.toString(array1));
    }
}
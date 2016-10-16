package com.brainacad;
import java.util.Arrays;

//Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.
public class Lab61 {

    public void getArray(int [] array){
        for (int i = 1; i <=15 ; i++) {
            array[i-1] = i*2;
        }
        System.out.println(Arrays.toString(array));

    }
    public static void main(String[] args) {
        Lab61 lab61 = new Lab61();
        lab61.getArray(new int[15]);

    }
}

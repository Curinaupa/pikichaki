package com.brainacad.arrays;
import java.util.Arrays;

/**
 * Created by VC on 16.10.2016.
 */
//Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
public class Lab64{
    private int findNumber;

    public int getFindNumber() {
        return findNumber;
    }

    public void setFindNumber(int index) {
        this.findNumber = index;
    }

    public void getArray(int [] matrix){
        for (int i = 0; i <65 ; i++) {
            int randomNum = (int)(Math.random()*100);
            matrix[i] = randomNum;
            System.out.print(matrix[i] + "  ");
        }
    }
    public void getMessage(int [] arr){
        for (int a: arr) {
            System.out.print(a + "  ");
        }
    }
    public int getElement(){
        int randomElement = (int)(Math.random()*100);
        System.out.println("Number to find: " + randomElement);
        return randomElement;

    }
    public boolean findElement (int number, int [] arr){
        boolean find =false;
        for (int a: arr ) {
            if (number == a) {
                find = true;
            }
        }
        return find;
    }

    public static void main(String[] args) {
        final int MAX_LENGTH = 65;
        int[] matrix =  new int[MAX_LENGTH];
        Lab64 lab64 = new Lab64();
        lab64.getArray(matrix);
        Arrays.sort(matrix);
        System.out.println();
        lab64.getMessage(matrix);
        System.out.println();
        System.out.println((lab64.findElement(lab64.getElement(),matrix))?"There is a element" :"There is not a element");


    }

}
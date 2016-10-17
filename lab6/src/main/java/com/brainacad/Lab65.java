package com.brainacad;

import java.util.Arrays;

//Write a program, which finds in a given matrix the area of equal numbers. Here is one example with an area containing 7 elements with equal value of 1:
//The program must print to console:
//        Line 1: [0-2]
//        Line 2: [1,3]
//        Line 3: [4]
//        Line 4: [3]

public class Lab65 {
    final int MAX_LENGTH_RAWS = 10;
    final int MAX_LENGTH_COLUMNS = 8;
    int [][] matrix = new int[MAX_LENGTH_RAWS][MAX_LENGTH_COLUMNS];
    //Generating Matrix
    public void getMatrix(){
        for (int i = 0; i < MAX_LENGTH_RAWS ; i++) {
            for (int j = 0; j < MAX_LENGTH_COLUMNS ; j++) {
                int randomNumber = (int)(Math.random()*4+1);
                matrix[i][j] = randomNumber;
            }
        }
        for (int [] a : matrix ) {
            for (int b: a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public void doComparation(int numberToCompare){
        int [] array = new int[MAX_LENGTH_COLUMNS];
        for (int i = 0; i <MAX_LENGTH_COLUMNS ; i++) {
            array[i] = -1;
        }
        for (int j = 0; j < MAX_LENGTH_RAWS ; j++) {
            int m=0;
            for (int k = 0; k < MAX_LENGTH_COLUMNS; k++) {
                if (matrix[j][k] == numberToCompare){
                    array[m]= k;
                    m++;
                }
            }
            //System.out.println(Arrays.toString(array));
            getResult(j, array);
            for (int i = 0; i <MAX_LENGTH_COLUMNS ; i++) {
                array[i] = -1;
            }
            // System.out.println(Arrays.toString(array));

        }
        System.out.println();

    }
    public void getResult( int j,int [] arr1 ){
        for (int i = 0; i < MAX_LENGTH_COLUMNS ; i++) {
            switch (i) {
                case 0:
                    if (arr1[i] != -1) {
                        System.out.print("Line " + (j + 1) + ":" + "[" + arr1[i]);
                    } else {
                        System.out.println("Line" + (j + 1) +"[]");
                        i= MAX_LENGTH_COLUMNS-1;
                        //continue;
                    }
                    ;
                    break;
                case 1:
                case 2:
                case 3:

                    if (arr1[i] != -1) {
                        System.out.print(" , " + arr1[i]);
                    } else {
                        System.out.print(""); };
                    break;
                case 4:
                    if (arr1[i] != -1) {
                        System.out.print(" , " + arr1[i]);
                    } else {
                        System.out.println("]"); };

                    break;
            }

        }
    }

    public static void main(String[] args) {
        Lab65 lab65 = new Lab65();
        lab65.getMatrix();
        lab65.doComparation(1);
    }
}

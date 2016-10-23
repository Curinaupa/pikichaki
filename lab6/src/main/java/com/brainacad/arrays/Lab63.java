package com.brainacad.arrays;
import java.util.Arrays;

/**
 * Created by Huamani V.R on 17.10.2016.
 */

public class Lab63 {
    final int MAX_LENGTH = 4;
    public void getTableFirstRow(){
        for (int i = 0; i < MAX_LENGTH ; i++) {
            switch (i){
                case 0:
                    System.out.print('\u250c');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u252C');
                    break;
                case 1: case 2:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u252c');
                    break;
//                case 2:
//                    System.out.print('\u2500');
//                    System.out.print('\u2500');
//                    System.out.print('\u252c');
//                    break;
                case 3:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2510');
                    System.out.println();
            }


        }
    }
    public void getTableRow(int i, int b) {

        if (i == 0) {
            System.out.print('\u2502' +"  "+ b + "  "+'\u2502');
        } else {
            System.out.print("   " + b + " " + '\u2502');
            //System.out.print(i);
            //}

        }
        // System.out.println();
    }
    public void getMediumTable(){
        for (int i = 0; i < MAX_LENGTH; i++) {
            switch (i){
                case 0:
                    System.out.print('\u251c');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2534');
                    break;
                case 1: case 2:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    break;
//                case 2:
//                    System.out.print('\u2500');
//                    System.out.print('\u2500');
//                    System.out.print('\u252c');
//                    break;
                case 3:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2524');
                    System.out.println();
            }


        }
    }

    public void getBottomTable(){
        for (int i = 0; i < MAX_LENGTH; i++) {
            switch (i){
                case 0:
                    System.out.print('\u2514');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2534');
                    break;
                case 1: case 2:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2534');
                    break;
//                case 2:
//                    System.out.print('\u2500');
//                    System.out.print('\u2500');
//                    System.out.print('\u252c');
//                    break;
                case 3:
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2500');
                    System.out.print('\u2518');
                    System.out.println();
            }


        }
    }

    public static void main(String[] args) {
        int[][] matrix =  {{1, 5, 9,13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 10, 12}
        };
        Lab63 lab63 = new Lab63();

//        for (int [] a:matrix ) {
//            for (int b: a) {
//                System.out.print(b+" ");
//            }
//            System.out.println();
//
//        }
        lab63.getTableFirstRow();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                lab63.getTableRow(j, matrix[i][j]);

            }
            System.out.println();
            if (i==3){
                break;
            }
            lab63.getMediumTable();
        }
        lab63.getBottomTable();
    }
}
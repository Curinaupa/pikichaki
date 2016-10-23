package com.brainacad.arrays;

import java.util.Arrays;

/**
 * Created by Huamani V.R on 15.10.2016.
 */
//There are statistics for the year by months as an array:
//
//        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
//
//        Write code which calculates the maximum value from the array, the minimum value, the average and the median.

public class Lab62 {

    public void getMaxMin(int[] m){
        int maxValue = m[0];
        int minValue = m[0];
        int sum = 0;
        double average;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
            if (maxValue < m[i]){
                maxValue = m[i];
            }
            if (minValue > m[i]){
                minValue = m[i];
            }
        }
        average =(double) sum/m.length;
        System.out.println(Arrays.toString(m));
        getMessage(maxValue);
        getMessage(minValue);
        getMessage(average);
//        System.out.println("Max Value = " + maxValue);
//        System.out.println("Min Value = " + minValue);
//        System.out.println("Averange = " + average);
    }
    public void getMessage(int s){
        System.out.println( s );
    }
    public void getMessage(double s){
        System.out.println( s );
    }
    public static void main(String[] args) {
        int [] n = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Lab62 lab62 = new Lab62();
        lab62.getMaxMin(n);


    }

}

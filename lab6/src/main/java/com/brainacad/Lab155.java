package com.brainacad;

/**
 * Created by Huamani V.R on 17.10.2016.
 */
public class Lab155 {
    public static void main(String[] args) {
        final int MAX_VALUE = 20;
        int sum = 0;
        double averange;
        for (int i = 1; i < MAX_VALUE ; i++) {
            sum +=i;
        }
        averange = (double)sum/MAX_VALUE;
        System.out.println("Suma = " + sum + "\naverange = " + averange);
    }
}
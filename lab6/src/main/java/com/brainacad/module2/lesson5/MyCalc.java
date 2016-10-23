package com.brainacad.module2.lesson5;

/**
 * The value of π can be calculated with the series:
 * π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int) that takes
 * as parameter an integer n, and computes and returns the value of π approximated
 * to the first n terms of the series.
 */
public class MyCalc {
    public static double calcPi(int numnberOfTerms) {
        double piLocal = 0;
        for (int i = 1; i <= numnberOfTerms; i++) {
            if(i%2!=0){
                piLocal = piLocal + 1/(2*i-1);
            }
            else{piLocal = piLocal - 1/(2*i-1);}
       }
        return 4*piLocal;
    }

}

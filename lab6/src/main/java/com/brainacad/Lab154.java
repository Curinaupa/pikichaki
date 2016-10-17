package com.brainacad;

public class Lab154 {
    public static void main(String[] args) {
        int countNumberPrinted = 0;
        int iloop = 1;
        while(iloop<=300){
            if (iloop%3 == 0 || iloop%4==0){
                System.out.println("Number Multiple of 3 and 4: " + iloop);
                countNumberPrinted++;
            }
            iloop++;
            if (countNumberPrinted == 10){
                System.out.println("Printed 10 Numbers");
                break;
            }
        }
    }
}
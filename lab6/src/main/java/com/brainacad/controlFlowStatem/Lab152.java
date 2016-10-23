package com.brainacad.controlFlowStatem;

import java.util.Scanner;


public class Lab152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an intNumber x = ");
        int x = sc.nextInt();
        String str;
        if (x > 0) {
            switch (x) {
                case 1:
                    str = "One";
                    break;
                case 2:
                    str = "Two";
                    break;
                case 3:
                    str = "Three";
                    break;
                case 4:
                    str = "Four";
                    break;
                case 5:
                    str = "Five";
                    break;
                case 6:
                    str = "Six";
                    break;
                case 7:
                    str = "Seven";
                    break;
                case 8:
                    str = "Eight";
                    break;
                case 9:
                    str = "Nine";
                    break;
                default:
                    str = "Other";
                    break;
            }

            System.out.println("You Enter: " + str);
        } else {
            System.out.println("Enter a new Number greather than 0 ");
        }
        System.out.print("Enter an intNumber x = ");
        int xIntNumber = sc.nextInt();
        System.out.print("You Enter: ");
        if (xIntNumber == 1){
            System.out.println("One");
        } else if(xIntNumber == 2){
            System.out.println("Two");
        } else if(xIntNumber == 3){
            System.out.println("Three");
        } else if(xIntNumber == 4){
            System.out.println("Four");
        } else if(xIntNumber == 5){
            System.out.println("Five");
        } else if(xIntNumber == 6){
            System.out.println("Six");
        } else if(xIntNumber == 7){
            System.out.println("Seven");
        } else if(xIntNumber == 8){
            System.out.println("Eigth");
        } else if(xIntNumber == 9){
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}

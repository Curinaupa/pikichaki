package com.brainacad.controlFlowStatem;

public class Lab153 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            if (i == 0){
                System.out.print("* |");
            } else {
                System.out.print("   " + i);
            }
        }
        System.out.println();
        for (int i = 0; i <20 ; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 1; i <10 ; i++) {
            System.out.print(i + " |  ");
            for (int j = 1; j <10 ; j++) {
                System.out.print("   " + i*j);
            }
            System.out.println();
        }
    }


}

package com.brainacad;

import java.util.Arrays;

/**
 * Write a program, that iterate through array of Computer objects and increases by 10 percent field price.
 */
public class Lab214 {
    static Computer c1 = new Computer("Mac" , 12345 , 100f , 8 , 3000);
    static Computer c2 = new Computer("Apple" , 12345678 , 1000f , 4 , 5000);
    static Computer c3 =  new Computer("Lenova" , 678 , 2000f , 2 , 4000);
    static Computer c4 =  new Computer("Samsung" , 678 , 5000f , 2 , 1000);
    static Computer c5 =  new Computer("Hp" , 678 , 10000f , 2 , 6000);

    public static void main(String[] args) {
        Computer [] arr = new Computer[5];
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        arr[3] = c4;
        arr[4] = c5;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("     " + Arrays.toString(arr[i].getClass().getConstructors()));
//
//        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%20.2f ",(float)arr[i].getPrice() );
            System.out.printf("% 15.2f \n", (float) (arr[i].getPrice()) * (1.1f));
        }
    }
}

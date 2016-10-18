package com.brainacad;

/**
 * Write a program to create array of Computer objects (5 pcs.)
 Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array (using loop).

 */
import java.lang.reflect.Array;
import java.util.Arrays;
public class Lab213 {
    static Computer c1 = new Computer("Mac" , 12345 , 2345f , 8 , 3000);
    static Computer c2 = new Computer("Apple" , 12345678 , 234545f , 4 , 5000);
    static Computer c3 =  new Computer("Lenova" , 678 , 2345f , 2 , 4000);
    static Computer c4 =  new Computer("Samsung" , 678 , 2345f , 2 , 1000);
    static Computer c5 =  new Computer("Hp" , 678 , 2345f , 2 , 6000);
    public static void main(String[] args) {
        Computer [] arr = new Computer[5];
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        arr[3] = c4;
        arr[4] = c5;
        for (int i = 0; i < 5; i++) {
            System.out.println("     " + Arrays.toString(arr[i].getClass().getConstructors()));
        }

        Computer[] computer = new Computer[5];
        for (int i = 0; i < 5; i++) {
            computer[i] = new Computer();
        }
//        for (Computer i : computer) {
//            System.out.println(Arrays.toString(computer));
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println(computer[i]);
        }

    }
}


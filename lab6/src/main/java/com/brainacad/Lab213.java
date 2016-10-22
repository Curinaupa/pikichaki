package com.brainacad;

/**
 * Write a program to create array of Computer objects (5 pcs.)
 Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array (using loop).

 */
//* manufacturer (of String type),
//        * serialNumber(of int type),
//        * price (of float type),
//        * quantityCPU(of int type) and
//        * frequencyCPU(of int type).
import java.lang.reflect.Array;
import java.util.Arrays;
public class Lab213 {

    public static void main(String[] args) {

        String[] compNames = {"Mac" , "Apple" , "Lenova" , "Samsung" , "Hp"};
        int[] serialNumber = {65654654, 4565654, 7657756, 5676565, 5676788};
        float[] price = {2345f, 6543f, 9876f, 12345f, 87766f};
        int [] quantityCPU = {2, 4, 6, 8, 10};
        int [] frequency = {3000, 4000, 5000, 6000, 70000};

//         Computer c1 = new Computer("Mac" , 12345 , 2345f , 8 , 3000);
//         Computer c2 = new Computer("Apple" , 12345678 , 234545f , 4 , 5000);
//         Computer c3 =  new Computer("Lenova" , 678 , 2345f , 2 , 4000);
//         Computer c4 =  new Computer("Samsung" , 678 , 2345f , 2 , 1000);
//         Computer c5 =  new Computer("Hp" , 678 , 2345f , 2 , 6000);
        Computer [] computers = new Computer[5];
//        arr[0] = c1;
//        arr[1] = c2;
//        arr[2] = c3;
//        arr[3] = c4;
//        arr[4] = c5;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("     " + Arrays.toString(arr[i].getClass().getDeclaredFields()));
//        }
        for (int i = 0; i <5 ; i++) {
            Computer computer = new Computer();
            computer.setFrequencyCPU(frequency[i]);
            computer.setManufacturer(compNames[i]);
            computer.setPrice(price[i]);
            computer.setSerialNumber(serialNumber[i]);
            computer.setQuantityCPU(quantityCPU[i]);
            computers[i] = computer;
        }
        for (Computer computer :computers) {
            System.out.println(computer);
        }
        //Arrays.stream(computers).forEach(System.out::println);



    }
//    public void increasePrice(Computer[] computers, int percent){
//        for (Computer computer : computers) {
//            computer.setPrice((float)computer.getPrice()*(0.01*percent+1));
//
//        }
//    }
}


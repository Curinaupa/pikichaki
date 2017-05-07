package com.brainacad.initializationSections;

import java.util.Arrays;

/**
 Create class “MyInit” with field “arr”of array of integers and non-static initialization block which will initialize
 that array with random values. (Size of array is 10)
 To generate random numbers you can use next code:
 arr[i]= (int) (100 * Math.random()).
 (Or using Random class instance and nextInt() method invocation).
 Add to class MyInit and method “printArray()” which will print values of this array.
 Create class MainLab141, which will create two instances of class MyInit and invoke method “printArray()” to print values
 of their arrays on console.

 Example of output:
 23,43,11,34,78,59,34,61,24,2
 5,48,50,3,1,4,67,62,78,98


 */
public class Lab252 {
    public static void main(String[] args) {
        new Myinit().printArray();
        new Myinit().printArray();
        System.out.println(Arrays.toString(new Myinit().getArr()));
    }
}

package com.brainacad.genericos;

import java.util.Random;

/**
 * Create new project called  TestGenerics3.
 Add package “com.brainacad.oop.testgenerics3”.
 Create a generic class MyMixer<T> with field as Array of some type, provide constructor with one parameters.
 Add to MyMixer public “shuffle ()” method which shuffle elements of Array and return it;
 Create a class Main with a main( ) method.
 Add to method main() code that creates two Array of different types:
 First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
 Second one is array of strings: {“one”,”two”, …}
 Create two objects of MyMixer type and using each of arrays, invoke shuffle () method and print result to console.
 Execute the program.
 Example of program output:
 [6,7,4,3,2,9,1,5,8]
 [nine,one,two,five,…,]
 */
public class MyMixer <T>{
    T[] arr;

    public MyMixer(T[] arr) {
        this.arr = arr;
    }

    public T[] shuffle(){
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
        int newPosition = random.nextInt(arr.length-1);
        T newPosElement =  arr[newPosition];
        arr[newPosition] = arr[i];
        arr[i] = newPosElement;
        }
        return arr;
    }

}

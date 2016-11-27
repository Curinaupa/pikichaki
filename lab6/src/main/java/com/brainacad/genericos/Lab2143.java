package com.brainacad.genericos;

/**
 * Open project called  TestGenerics2 (from 2-14-2 lab).
 Rewrite a class MyTestMethod to add new static method “calcSum” (with two parameters: an array T[] and
 variable maxval of type T) that calc sum of the number of elements in an array T[] that are greater than a
 specified value maxval.
 Add to method main() code that creates two array, first – array of Integer type and second – array of Double
 type. Fill these arrays with some random values.
 Add code to counts the total sum of elements in each of arrays  that are greater than a specified element by
 invoking calcSum static method.
 Execute the program.
 The program output must be like next example:
 Array values: [1,2,3,4,5,6,7,8,9]
 Sum of elements that are greater than 3:
 39
 Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 Sum of elements that are greater than 3:
 46.2

 */
public class Lab2143 {
    public static void main(String[] args) {
        Integer[] arrInt ={1,2,3,4,5,6,7,8,9};
        Double[] arrDouble = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        System.out.println(MyTestMethod.calcSumI(arrInt,3));
        System.out.println(MyTestMethod.calcSumI(arrDouble, 3.0));
    }
}

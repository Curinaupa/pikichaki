package com.brainacad.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Create new project called  TestCollection3.
 Add package “com.brainacad.oop.testcollection3”.
 Create a class Main with a main( ) method.
 Add to method main() code to create both an ArrayList and a LinkedList (of String parameter type), and fill each in loop with string values
 like: “num_” and number of current iteration (from 0 to 10).
 Print each list using an ordinary Iterator, then insert one list into the other by using a ListIterator, inserting at every other location.
 Now perform the insertion starting at the end of the first list and moving backward.
 Write a static method “printElements” that uses an Iterator to step through a Collection and print the each element value in the container.
 Execute the program.

 */
public class Lab2153 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<String> arr = new ArrayList<>();

        for (int i = 0; i <=10 ; i++) {
            list.add("num_" + i);
            arr.add("num_" + i);
        }
        //Printing elements of Lists
        System.out.println("Print LinkedList");
        printElements(list);
        System.out.println("Print ArrayList");
        printElements(arr);





    }
    public static void printElements(List<String> actual){
        Iterator<String> iter = actual.iterator();
        while (iter.hasNext()){
            String elem = iter.next();
            System.out.println(elem);
        }
    }

}
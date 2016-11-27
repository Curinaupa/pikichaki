package com.brainacad.genericos;

/**
 * Create new project called  TestGenerics1.
 Add package “com.brainacad.oop.testgenerics1”.
 Create a generic class MyTuple<A,B,C> with three fields of different
 types, provide constructor with three parameters and getters for each field.
 Create a class Main with a main( ) method.
 Add to method main() code that creates two objects of MyTuple.
 Firs one must be parameterized with next types: String, Integer, Long.
 The second must be parameterized with next types: Double, String, String.
 Execute the program.

 */
public class Lab2141 {
    public static void main(String[] args) {
        MyTuple<String,Integer,Long> myTuple = new MyTuple("Hello", 10, 2234L);
        MyTuple<Double, String, String> myTuple1 = new MyTuple<>(3.45, "World", "Piki");
    }
}

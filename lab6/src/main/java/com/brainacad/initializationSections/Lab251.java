package com.brainacad.initializationSections;
//Create class “MyInitTest” with two initialization blocks, two static initialization blocks and two constructors (one constructor()
// must invoke second constructor(int)).
//        On each block write code that prints on console type of block and block number.
//
//        For example:
//        “static initialization block 1”
//        “static initialization block 2”
//        “non-static initialization block 1”
//        “non-static initialization block 2”
//        “constructor 1”
//        “constructor 2”
//
//        Create class MainLab141, which will create instance of class MyInitTest by invoking first constructor.

public class Lab251 {
    public static void main(String[] args) {
        System.out.println("Create with non param");
        new MyinitTest();
        System.out.println("Create with param");
        new MyinitTest(5);
    }
}

package com.brainacad.initializationSections;

/**
 * Created by Huamani V.R on 05.11.2016.
 */
public class MyinitTest {
    private int a;
    private  int b;
    private static int c;
    {
        System.out.println("non-static initialization block 1");
    }
    {
        System.out.println("non-static initialization block 2");
    }
    static{
        System.out.println("static initialization block 1");
    }
    static {
        System.out.println("static initialization block 2");
    }
    public MyinitTest(){
        System.out.println("Constructor 1");
    }
    public MyinitTest(int d){
        this();
        System.out.println("Constructor 2");
    }
}

package com.brainacad.constructors;

/**
 * Add to class MyWindow constructor without parameters, which will initialize class’s fields by some default values.
 Create instance of class MyWindow using constructor without parameters.

 */

public class Lab232 {
    public static void main(String[] args) {
        MyWindow   mw = new MyWindow();
        MyWindow myWindow = new MyWindow(100, 210, 4, "Yellow",true);
        MyWindow myWindow1 = new MyWindow(150, 220, 4, "Blue",false);
        MyWindow myWindow2 = new MyWindow(160, 230, 4, "Green",true);
        MyWindow myWindow3 = new MyWindow(180, 240, 4, "Yellow",false);
        System.out.println(mw);
        System.out.println(myWindow3);

    }
}

package com.brainacad.constructors;

// Lab231Create class “MyWindow” with fields (width (of double type), height (of double type),
//        numberOfGlass(of int type), color(of  String type), isOpen(boolean)).
//        Create five instances of class MyWindow,  with different  fields values.

//Lab 232 Add to class MyWindow constructor without parameters, which will initialize class’s fields by some default values.
//        Create instance of class MyWindow using constructor without parameters.


/**
 * Lab 233 Add to class Window overload constructors, which will initialize class’ fields, depend from what data we will put there:
 MyWindow(width, height),
 MyWindow(width, height, numberOfGlass).
 Finally class MyWindow must have four constructors)
 */

public class Lab231 {
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow(100, 210, 4, "Yellow",true);
        MyWindow myWindow1 = new MyWindow(150, 220, 4, "Blue",false);
        MyWindow myWindow2 = new MyWindow(160, 230, 4, "Green",true);
        MyWindow myWindow3 = new MyWindow(180, 240, 4, "Yellow",false);

        //Using constructor this

        MyWindow mwinConst = new MyWindow(200,300, 7);
        System.out.println(mwinConst);

    }
}

package com.brainacad.constructors;

/**
 * •	Add method “printFields” to  MyWindow class.
 •	In printFields method write code that print all fields values to console.
 •	Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors.
 •	Call method “printFields” on each array element.
 */
public class Lab235 {
    public static void main(String[] args) {
        MyWindow[] myWindows = new MyWindow[4];
        myWindows[0] = new MyWindow(100,200, 5);
        myWindows[1] = new MyWindow(100,250,3,"black", true);
        myWindows[2] = new MyWindow(120,100 , 5, "Pink",false);
        myWindows[3] = new MyWindow(150,100);

        for (MyWindow actual : myWindows) {
            System.out.println(actual);
        }
    }
}

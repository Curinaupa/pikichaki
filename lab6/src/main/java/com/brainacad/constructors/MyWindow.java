package com.brainacad.constructors;

/**
 * Lab 233 Add to class Window overload constructors, which will initialize class’ fields, depend from what data we will put there:
 MyWindow(width, height),
 MyWindow(width, height, numberOfGlass).
 Finally class MyWindow must have four constructors)
 */

/**
 * Lab 234 Change code in two overloaded constructors to invoke first constructor using “this” keyword.
 */

/**
 * •	Add method “printFields” to  MyWindow class.
 •	In printFields method write code that print all fields values to console.
 •	Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors.
 •	Call method “printFields” on each array element.
 */

class MyWindow{
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(){
        this.width = 100;
        this.height = 200;
        this.numberOfGlass = 5;
        this.color = "Narrow";
        this.isOpen = true;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public String printFields() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }
}
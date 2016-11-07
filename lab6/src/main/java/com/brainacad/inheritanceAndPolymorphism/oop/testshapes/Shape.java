package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 *  * Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”.
 You should design a super class “Shape”, which defines the public method of all the shapes called calcArea (),
 which returns the area (double type) of that particular shape. (Our program uses many kinds of shapes,
 such as triangle, rectangle and so on.)
 Define a Shape class as:
 public class Shape {
 //declare private instance variable “shapeColor” of String type
 // create a constructor for Shape with shapeColor parameter
 // Override  toString() to return the string of Shape name and color, example:
 “Shape, color is: RED”
 // All shapes must has a method called calcArea (), write public method
 (empty)  calcArea ¬that returns double value ( 0.0 ) .
 }
 Create class Main with method main().
 The program must demonstrate the creation of one Shape object and print it name and color to console.
 Then add code to invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Shape, color is: RED”
 “Shape area is: 0”
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public  double calcArea (){
        return 0.0;
    }
      //  “Shape, color is: RED”
    public String toString(){
        return  String.format("%s %s %s\n%s %,.2f",this.getClass().getSimpleName(),"color is", getShapeColor(),"Shape area is:", this.calcArea() );
    }
}

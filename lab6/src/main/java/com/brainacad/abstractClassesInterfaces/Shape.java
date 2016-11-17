package com.brainacad.abstractClassesInterfaces;

/**
 * Open project MyShapes. (from 2.7 labs)
 Rewrite the class “Shape” to make it abstract and change calcArea() method declaration to make it abstract too.
 Execute program
 */

abstract class Shape implements Drawable {
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

    abstract double calcArea();
    public String toString(){
        return  String.format("%s %s %s",this.getClass().getSimpleName(),"color:", getShapeColor() );
    }
}

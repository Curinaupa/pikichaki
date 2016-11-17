package com.brainacad.abstractClassesInterfaces;

import java.util.Arrays;

/**
 * Created by Huamani V.R on 13.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 10);
        Shape rectangle = new Rectangle("Yellow", 25, 8);
        Shape triangle = new Triangle("Blue",3,4,5);
        circle.draw();
        rectangle.draw();
        triangle.draw();
        System.out.println("\nTesting abstrac and interface with array: ");

        Shape[] drawable = {new Circle("Red", 10), new Rectangle("Yellow", 25, 8 ), new Triangle("Blue",3,4,5) };

        for (Shape drawFig: drawable) {
            drawFig.draw();
        }
        System.out.println("\nTesting interface with array: ");
        Drawable[] drawable2 = {new Circle("Red", 20), new Rectangle("Yellow", 25, 4 ), new Triangle("Blue",5,5,5) };
        for (Drawable currentDraw: drawable2 ) {
            currentDraw.draw();
        }
        //Compare areas of two shapes
        int narea = new Circle("Red", 10).compareTo(new Circle("Yellow", 25 ));
        System.out.println(narea);

        Rectangle[] arr2 = {new Rectangle("Yellow", 25, 4 ),
                new Rectangle("Yellow", 5, 2 ),
                new Rectangle("Yellow", 5, 4 ),
                new Rectangle("Yellow", 10, 8 ),
                new Rectangle("Yellow", 10, 4 ),
                new Rectangle("Yellow", 20, 6 ),
                new Rectangle("Yellow", 20, 7 )
        };



        Arrays.sort(arr2, new RectangleAreaComparator());
        //System.out.println(Arrays.toString(arr2));

        for (Rectangle rectangleActual: arr2) {
            System.out.print(rectangleActual);
            System.out.println(" area is:  "+rectangleActual.calcArea());
        }


    }
}

package com.brainacad.inheritanceAndPolymorphism.oop.testshapes;

/**
 * Created by Huamani V.R on 07.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Red");
        System.out.println(shape);
        shape.getArea();

        Circle circle = new Circle("Green",10.00);
        System.out.println(circle);
        circle.getArea();

        Rectangle rectangle = new Rectangle("Yellow", 10, 20);
        System.out.println(rectangle);
        rectangle.getArea();

        Triangle triangle =new Triangle("Black", 5, 5, 5) ;
        System.out.println(triangle);
        triangle.getArea();
        System.out.println("*****************************************************************");
        Shape[] shapes = new Shape[9];
        for (int i = 0; i <9 ; i++) {
            switch (i) {
                case 0:case 1:case 2:case 3: case 4:
                  Rectangle rectanglei = new Rectangle("Yellow", 10 + 5 * i, 20 + 5 * i);
                  shapes[i] = rectanglei;
             break;
                case 5: case 6:
                    Triangle trianglei =new Triangle("Black", 5 + 5*i, 5 + 5*i, 5*i) ;
                    shapes[i] = trianglei;
                 break;
             default:
                 Circle circle1 = new Circle("Green",10.00*i);
                 shapes[i] = circle1;
                 break;

                //System.out.println(shapes[i]);
            }
        }

        for (Shape shapeActual: shapes) {
            System.out.print(shapeActual + "  ");
            shapeActual.getArea();
        }




    }
}

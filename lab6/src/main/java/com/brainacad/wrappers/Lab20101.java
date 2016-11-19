package com.brainacad.wrappers;

import java.util.Objects;

/**
 * Create new project called WrapperDemo.
 Add package “com.brainacad.oop.testwrapper”.
 Create class Main with method main(). In main() method declare few xN local variable of Integer class and initialize
 it with same value (lower then 128), but in different manner.
 For example:
 Integer x1 = 10;
 Integer x2 = new Integer(10);
 Integer x4 = Integer.valueOf(10);
 Integer x5 = Integer.parseInt(“10”);
 Compare it to each other using “==” and equals(), print result to console.
 Do the same, but for value higher than 128.

 */
public class Lab20101 {
    private static Integer x1;
    private static Integer x2;
    private static Integer x3;
    private static Integer x4;
    public static void main(String[] args) {

        System.out.println("Value: 20" );
        x1 = 20;
        x2 = new Integer(20);
        x3 = Integer.valueOf(20);
        x4 = Integer.parseInt("20");

        checkConstrains();

        System.out.println("Value 200");
        x1 = 200;
        x2 = new Integer(200);
        x3 = Integer.valueOf(200);
        x4 = Integer.parseInt("200");
        checkConstrains();



    }
    private static void checkConstrains(){
        System.out.println( x1 == x2 );
        System.out.println( x1 == x3);
        System.out.println( x1 == x3);

        System.out.println(Objects.equals(x1,x2));
        System.out.println(Objects.equals(x1,x3));
        System.out.println(Objects.equals(x1,x4));

    }
}

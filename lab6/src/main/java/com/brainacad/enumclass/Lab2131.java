package com.brainacad.enumclass;

import java.util.Arrays;

/**
 * Create new project called  TestEnum1. Add package “com.brainacad.oop.testenum1”.
 1) Create a class Main with a main().
 2) Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY, MONDAY, …).
 3) Add to method main() code that iterate over MyDayOfWeek enum possible values in loop and
 print each value name to console.
 4) Execute the program.
 Example of program output:
 SUNDAY
 MONDAY
 TUESDAY
 WEDNESDAY
 THURSDAY
 FRIDAY
 SATURDAY

 */
public class Lab2131 {
    public static void main(String[] args) {
        MyDayOfWeek[] arr = MyDayOfWeek.values();
        for (MyDayOfWeek m: MyDayOfWeek.values()) {
            System.out.println(m);
        }

        for (MyDayOfWeek my: MyDayOfWeek.values() ) {
            System.out.println(my.name() +"  "+my.ordinal());
        }

        //stream with Lambda
        Arrays.stream(arr).filter(myDayOfWeek -> myDayOfWeek != MyDayOfWeek.SUNDAY).forEach(System.out::println);
    }
}

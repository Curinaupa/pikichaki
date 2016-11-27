package com.brainacad.enumclass;

/**
 * Open project called  TestEnum1 (form 2-13-1 lab).
 Add to method main() code that iterate over MyDayOfWeek enum possible values in
 loop and using switch statement print to console days of the week only when you have classes in Java Programming.
 Execute the program.
 Example of program output:
 My Java day: TUESDAY
 My Java day: THURSDAY
 My Java day: SATURDAY

 */
public class Lab2132 {
    public static void main(String[] args) {
        MyDayOfWeek myDayOfWeek = MyDayOfWeek.THURSDAY;
        switch (myDayOfWeek){
            case TUESDAY:
                System.out.println(" My Java day: TUESDAY");
                break;
            case THURSDAY:
                System.out.println("My Java day: THURSDAY");
                break;
            case SATURDAY:
                System.out.println("My Java day: SATURDAY");
                break;
                default:
                    System.out.println("No Days");
        }
    }
}

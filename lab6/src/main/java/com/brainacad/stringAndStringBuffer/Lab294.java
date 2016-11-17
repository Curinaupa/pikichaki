package com.brainacad.stringAndStringBuffer;

import java.util.StringTokenizer;

/**
 * Create new project called TestTokennizer.
 * Add package “com.brainacad.oop.teststokennizer”.
 * Create a class Main with a main() method.
 * In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot”
 * delimiter using StringTokennizer  class, and iterate the StringTokenizer elements and print it out one by one to console.
 * String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
 * Execute the program.
 */
public class Lab294 {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        String delimiter = " .,:";
        StringTokenizer dt = new StringTokenizer(myStr, delimiter);
        while(dt.hasMoreElements()){
            System.out.println(dt.nextElement());
        }

    }
}

package com.brainacad.stringAndStringBuffer;

import java.util.Arrays;

/**
 * Create new project called TestStrings3. Add package “com.brainacad.oop.teststring3”.
 * Create a class Main with a main() method.
 * Create static method: uniqueChars(String s), which must  take a String as argument and return
 * an array of distinct (unique) chars (char[]) of the given string.
 * In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String”
 * as argument. Print result to console.
 * Execute the program.
 */
public class Lab293 {

    public static void main(String[] args) {
        String str = "Using methods of class String";
        System.out.println(Arrays.toString(uniqueChars(str)));

    }

    public static char[] uniqueChars(String s) {
        char[] charArr = s.toCharArray();
        return charArr;
    }
}

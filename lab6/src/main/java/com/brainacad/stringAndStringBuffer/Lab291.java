package com.brainacad.stringAndStringBuffer;

/**
 * Create new project called TestStrings1. Add package “com.brainacad.oop.teststring1”.
 * Create a class MainLab141 with a main() method.In method main() declare local variable myStr of String type
 * and assign a value: “abracadabra”.
 * Using the methods of the class String, do next steps:
 * -	Find the index of first “ra” substring  of myStr value and print result to console.
 * -	Find the index of last “ra” substring of myStr value and print result to console.
 * -	Get substring of myStr from 3 to 7 char index and print result to console.
 * -	Create static method reverseString(String) which return String value as result with changed
 * order of letters (reverse it, for example “abcd” ->”dcba”).
 * -	Invoke reverseString() method with myStr argument and print result to console.
 * Execute the program.
 */
public class Lab291 {
    public static void main(String[] args) {

        String myStr = "abracadabra";
        int firstIndex = myStr.indexOf("ra");
        int lastIndex = myStr.lastIndexOf("ra");
        System.out.println("Fisrt index \"ra\": " + firstIndex + " Last index: " + lastIndex);
        String str = myStr.substring(3, 7);
        System.out.println("Substring " + str);
        reverse(myStr);
    }

    private static String reverse(String myStr) {
        char[] chars = new char[myStr.length()];
        chars = myStr.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
        return new String(chars);
    }
}
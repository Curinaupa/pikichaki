package com.brainacad.nestedClass;

import java.util.Arrays;

/**
 * Open project TestNested1 from 2-12-1 lab.
 1) Add to class MyPhoneBook two public methods sortByName() and sortByPhoneNumber().
 Provide code in sortByName() method to sort PhoneNumbers array by name (using Comparator interface and anonymous class).
 Provide code in sortByPhoneNumber () method to sort PhoneNumbers array by phone (using Comparator interface and anonymous class).
 2) Add to method main() code that creates MyPhoneBook object and fill it with ten phone number records.
 3) Add code to sort phone numbers in phone book by invoking sortByName()  and then invoke printPhoneBook() method.
 Execute the program.
 Example of program output:
 Name: Anna, phone: 0501237777
 Name: Boris, phone: 0679878888

 */
public class Lab2122 {
    public static void main(String[] args) {
        MyphoneBook myphoneBook = new MyphoneBook();
        myphoneBook.addPhoneNumber("aNokia", "12345677");
        myphoneBook.addPhoneNumber("vNokia", "12345679");
        myphoneBook.addPhoneNumber("bNbokia", "12345673");
        myphoneBook.addPhoneNumber("uNokia", "12345674");
        myphoneBook.printPhoneBook();
        System.out.println("Sort by Name");
        myphoneBook.sortByName();
        myphoneBook.printPhoneBook();
        System.out.println("Sort by phone");
        myphoneBook.sortByPhoneNumber();
        myphoneBook.printPhoneBook();



    }
}

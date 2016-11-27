package com.brainacad.nestedClass;

/**
 * Open project TestNested1 from 2-12-2 lab.
 1) Create new class MyPhone.
 Rewrite class MyPhoneBook to make it as inner class (non-static) of  MyPhone class
 (move class MyPhoneBook code inside MyPhone class).
 Add to class MyPhone constructor with no arguments.
 Add to class MyPhone public method swichOn(), which print message “Loading PhoneBook records…”
 and create MyPhoneBook object and add to it ten phone number records. Then print to console “OK!”;
 Add to class MyPhone method call(int), which prints to console message “Calling to”
 and full information from MyPhoneBook element (by index of array).
 2) Add to method main() code that creates MyPhone object, invoke swichOn() method  and then invoke
 call() method with argument of value 1
 3) Execute the program.
 Example of program output:
 Loading PhoneBook records… OK!
 Calling to: Name: Boris, phone: 0679878888

 */
public class Lab2123 {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();
        myPhone.call(6);
    }
}

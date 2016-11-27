package com.brainacad.nestedClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create new project called  TestNested1. Add package “com.brainacad.oop.testnest1”.
 * Create a class MyPhoneBook which contains static nested class PhoneNumber.
 * 1) Add to class PhoneNumber two fields: name (of String type) and phone (оf String type), constructor with
 * two parameters (name, phone) and getters for each class field.
 * Override the toString() method in PhoneNumber to return information about name and phone number.
 * 2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber (array length of 10).
 * 3) Add to class MyPhoneBook public method addPhoneNumber()  with  two parameters, of String type (name, phone)
 * which use it to create new PhoneNumber object and pass it to next available array element.
 * 4) Add to class MyPhoneBook public method printPhoneBook() which iterates over phoneNumbers  array in loop and
 * print name and phone number information of each record to console.
 * 5) Create a class Main with a main() method. Add to method main() code that creates MyPhoneBook object and fill
 * it with five phone number records. Add code to invoke printPhoneBook() method.
 * 6) Execute the program.
 * Example of program output:
 * Name: Sasha, phone: 050123456
 * Name: Vova, phone: 067987654
 */
public class MyphoneBook {
    PhoneNumber[] phoneNumbers = new PhoneNumber[8];
    private int position = 0;

    class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

        public void addPhoneNumber(String name, String phone) {
            phoneNumbers[position] = new PhoneNumber(name, phone);
            position++;
        }

        //    4) Add to class MyPhoneBook public method printPhoneBook() which iterates over phoneNumbers  array in loop and
        //* print name and phone number information of each record to console.
        public void printPhoneBook() {
            for (int i = 0; i < position; i++) {
                System.out.println(phoneNumbers[i]);
            }
        }

        //Add to class MyPhoneBook two public methods sortByName() and sortByPhoneNumber().
        //Provide code in sortByName() method to sort PhoneNumbers array by name (using Comparator interface and anonymous class).
        //Provide code in sortByPhoneNumber () method to sort PhoneNumbers array by phone (using Comparator interface and anonymous class).


        public void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {

                    return o1.getName().compareTo(o2.getName());
                }
            });
        }
        public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getPhone().compareTo(o2.getPhone());
            }
        });
        }

    }


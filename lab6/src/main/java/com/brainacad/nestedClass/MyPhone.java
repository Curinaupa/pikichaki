package com.brainacad.nestedClass;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1) Create new class MyPhone.
 * Rewrite class MyPhoneBook to make it as inner class (non-static) of  MyPhone class
 * (move class MyPhoneBook code inside MyPhone class).
 * Add to class MyPhone constructor with no arguments.
 */
public class MyPhone {
    MyphoneBook myphoneBook = new MyphoneBook();

    public MyPhone() {
    }

    //Add to class MyPhone public method swichOn(), which print message “Loading PhoneBook records…”
    //and create MyPhoneBook object and add to it ten phone number records. Then print to console “OK!”;
    public void swichOn() {
        System.out.println("Loading PhoneBook records...");

        myphoneBook.addPhoneNumber("Vasia", "0971234567");
        myphoneBook.addPhoneNumber("Kolya", "0571234568");
        myphoneBook.addPhoneNumber("Antin", "0971234567");
        myphoneBook.addPhoneNumber("Evkaky", "0571234568");
        myphoneBook.addPhoneNumber("Evkaky1", "0271234568");
        myphoneBook.addPhoneNumber("Evkaky2", "0871234568");
        myphoneBook.addPhoneNumber("Evkaky3", "0371234568");
        myphoneBook.addPhoneNumber("Evkaky4", "0771234568");
        myphoneBook.addPhoneNumber("Petro", "0371234567");
        myphoneBook.addPhoneNumber("Pablo", "0571234568");
        System.out.println("All is Ok!!");
    }

    //Add to class MyPhone method call(int), which prints to console message “Calling to”
    //nd full information from MyPhoneBook element (by index of array).
    public void call(int suscriber) {
        System.out.println("Calling to :");
        System.out.println(myphoneBook.phoneNumbers[suscriber]);




    }

    public class MyphoneBook {
        PhoneNumber[] phoneNumbers = new PhoneNumber[10];
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

        public void sortByPhoneNumber() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
        }

    }
}

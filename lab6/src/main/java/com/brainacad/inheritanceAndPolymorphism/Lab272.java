package com.brainacad.inheritanceAndPolymorphism;

/**
 * Override toString() method in each class
 In toString() method provide code which prints class name and fields values.
 Example:
 Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

 */
public class Lab272 {
    public static void main(String[] args) {

        System.out.println(new Device("Samsung", 120, "AB1234567CD"));
        System.out.println(new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024));
        System.out.println(new EthernetAdapter("Samsung", 120, "AB1234567CD", 25000,"WE34567"));
    }
}

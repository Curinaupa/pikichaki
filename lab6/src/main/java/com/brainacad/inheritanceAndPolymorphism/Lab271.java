package com.brainacad.inheritanceAndPolymorphism;
/**
 * Create classes:
 1) Base class Device(manufacturer(String), price(float), serialNumber(String));
 2) Subclasses Monitor(resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
 Add getters/setters and constructor to each class

 */
public class Lab271 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Samsung", 550.6f, "123456", 720, 1080 );
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Zeus", 457.5f, "34567", 345, "345678");


    }
}

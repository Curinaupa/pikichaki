package com.brainacad.inheritanceAndPolymorphism;

/**
 * Lab275
 * Create program (class MainLab141). The program must demonstrate the creation of an arrays
 * of different types devices, setup and output characteristics of each device
 */

public class Main {
    public static void main(String[] args) {

        Device [] devices = new Device[3];

        devices[0] = new Device("Samsung", 120, "AB1234567CD");
        devices[1] = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        devices[2] = new EthernetAdapter("Samsung", 120, "AB1234567CD", 25000,"WE34567");

        for (Device deviceActual: devices) {
            System.out.println(deviceActual.toString());
            System.out.println(" hashcode "+ deviceActual.getClass().getSimpleName()+":"+deviceActual.hashCode());
        }

    }
}

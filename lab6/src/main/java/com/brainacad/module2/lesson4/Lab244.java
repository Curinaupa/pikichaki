package com.brainacad.module2.lesson4;

public class Lab244 {
    public static void main(String[] args) {
        System.out.println("Number of Initial employee: " + Employee.getNumberOfEmployees());
        Employee employee = new Employee("Peter", "Ivanov", "Admin", 1234567);
        Employee employee1 = new Employee("Peter", "Ivanov", "Admin", 1234567);
        Employee employee2 = new Employee("Peter", "Ivanov", "Admin", 1234567);
        Employee employee3 = new Employee("Peter", "Ivanov", "Admin", 1234567);
        System.out.println("Number of current employee: " + Employee.getNumberOfEmployees());
    }


}

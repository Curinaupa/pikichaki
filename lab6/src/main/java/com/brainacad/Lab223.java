package com.brainacad;

/**
 * Write class Employee with method calcSalary with argument name(String)
 * and varargs salary(double…). This method should calc total salary of employee
 * and print his name and total salary. Write class Accountant that will be create
 * Employee instance and use his method with a different number of data.
 */
class Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcSalary(String name, double...salary){
        this.name = name;
        double summa = 0;
        for (double monthSalary : salary) {
            summa +=monthSalary;
        }
        System.out.println("Employee "+getName()+" Suma Salaries "+summa);
        return summa;
    }
    public void viewEmployee(){

    }
}
public class Lab223 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        double salary1 = employee.calcSalary("Petro", 100, 200, 300);
        double salary2 = employee.calcSalary("Ivan", 400, 500, 600);
        double salary3 = employee.calcSalary("Vasya", 100, 200, 700);


    }

}

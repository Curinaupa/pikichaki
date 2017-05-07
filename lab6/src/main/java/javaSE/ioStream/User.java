package javaSE.ioStream;

import java.io.Serializable;

/**
 * 1) Create class User with private fields : String firstName, String lastName, int age.
 * Add getters and setters to User class. Add two constructors: one with no arguments, another with parameters.
 * Override the toString() method.
 */
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName +" "+ age ;
    }
}
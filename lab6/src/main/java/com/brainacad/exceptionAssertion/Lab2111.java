package com.brainacad.exceptionAssertion;

/**
 * Create new project called  TestException. Add package “com.brainacad.oop.testexcp1”.
 Create a class MainLab141 with a main() that throws an object of class Exception inside a
 try block. Give the constructor for Exception a String argument.
 Catch the exception inside a catch clause and print the String argument.
 Add a finally clause and print a message to prove you were there.
 Execute the program.

 */
public class Lab2111 {
    public static void main(String[] args) {
        try{
            throw new TestException("bla bla");
        }catch (TestException e){
            System.out.println(e.toString());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("We are here");
        }
    }
}

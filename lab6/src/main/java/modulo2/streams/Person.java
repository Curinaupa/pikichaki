package modulo2.streams;

/**
 * Create a class Person with private fields: name, age and gender, as well as getter and setter methods, and constructor,
 * and overridden a toString() method. Add in a main() method to create a collection of objects of type Person.
 * Then using Stream, select and print to the console all military men (from 18 to 27 years old).
 */
public class Person {
    public enum Gender {
        MALE,
        FEMALE;
    }
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" ").append(getAge()).append(" ").append(getGender());
        return sb.toString();
    }
}
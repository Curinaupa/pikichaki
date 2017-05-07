package javaSE.streamJava8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create new project called TestStream. Add package “com.brainacad.oop.teststreams”.
 * 1) Create a class MainLab141 with a main() method, which: - create and output a list of integers using Stream functions:
 * create an infinite stream of integers, starting at 10 and increasing every next on 10, then restrict it 10 the first elements,
 * which are then halved and collect the list; - create a list of strings of 10 elements and then using the Stream,
 * select, sort and print the lines starting with some a symbol.
 * 2) Create a class Person with private fields: name, age and gender, as well as getter and setter methods, and constructor,
 * and overridden a toString() method. Add in a main() method to create a collection of objects of type Person.
 * Then using Stream, select and print to the console all military men (from 18 to 27 years old).
 * 3) Determine for list objects of Person type the average age of women with using Stream.a collection of objects of type Person
 */
public class StreamLab174 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,1,7,3,9,10);
        list.stream().forEach(x-> System.out.print(x + " "));
        System.out.println();
        Stream.iterate(10, x-> x+10).limit(10).forEach(x-> System.out.print(x + " "));
        System.out.println();
        List<Integer> numbers = Stream.iterate(10,x->x+10).limit(10).collect(Collectors.toList());
        numbers.forEach(x-> System.out.print(x+" "));
        System.out.println();

        List<String> str = Arrays.asList("Java", "Google", "Sun", "Ubuntu", "Basic","Ada","Javascript", "Window", "Pascal", "Fortran");
        str.stream().filter(x-> x.startsWith("J")).sorted().forEach(x-> System.out.print(x + " "));
        //Add in a main() method to create a collection of objects of type Person.
        // Then using Stream, select and print to the console all military men (from 18 to 27 years old).
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", 18, Person.Gender.MALE));
        personList.add(new Person("Peter1", 15, Person.Gender.MALE));
        personList.add(new Person("Peter2", 19, Person.Gender.FEMALE));
        personList.add(new Person("Peter3", 22, Person.Gender.MALE));
        personList.add(new Person("Peter4", 27, Person.Gender.FEMALE));
        personList.add(new Person("Peter4", 25, Person.Gender.MALE));
        personList.add(new Person("Peter4", 21, Person.Gender.FEMALE));
        System.out.println("all military men (from 18 to 27 years old)");
        personList.stream().filter(x-> ((x.getAge()>=18)&&(x.getAge()<=27))).forEach(person -> System.out.println(person));
        System.out.println("list objects of Person type the average age of women");
        System.out.println(personList.stream().filter(x-> x.getGender().equals(Person.Gender.FEMALE)).mapToInt(x->x.getAge()).average().toString());


    }
}

package modulo2.streams;


        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;
        import java.util.Random;

/**
 * Create new project called TestLambda.
 Add package “com.brainacad.oop.testlambda”.
 1) Create a class Main with a main() method, which creates array of Integer type and fills it with random values.
 Add in a main() method of the sorting code an array of integer values in descending order, using lambda expressions to specify the sort order.
 2) Add in a main() method code that creates a list of strings and sorts it in the reverse alphabetical order. Using lambda expressions to specify the sort order.
 */
public class StreamLab171 {
    public static void main(String[] args) {

//1.-Create a class Main with a main() method, which creates array of Integer type and fills it with random values.
        Integer [] arrayInt = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt();
        }
        System.out.println("Original ramdon array of Integer");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Sorting array into ASCENDING");
        Arrays.sort(arrayInt, (o1, o2) -> o1.compareTo(o2));
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Sorting array into DESCENDING");
        Arrays.sort(arrayInt, (o1, o2) -> o2.compareTo(o1));
        System.out.println(Arrays.toString(arrayInt));

//list of strings and sorts it in the reverse alphabetical order
        List<String> list = Arrays.asList("wabc", "yhjk", "alkj", "gtyu", "werc");
        System.out.println(list);
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        list.forEach(s -> System.out.print(s + " "));

    }
}
package javaSE.streamJava8;


import java.util.Arrays;
import java.util.List;

/**
 * Open project called TestLambda1 (from 1-7-2 lab).
 * 1) Add a MyConverter functional interface that contains an convertStr(String str) abstract method to convert a string to
 * uppercase and a isNull(String str) static method to check the string to null.
 * 2) Add in a MainLab141 class a updateList() static method, which converts the strings of list to uppercases.
 3) Add in a main() method code that invokes updateList() method and output the result.
 */
public class StreamLab173 {
    public static void main(String[] args) {
        MyConverter converter = x-> x.toUpperCase();
        System.out.println(converter.convertStr("s"));
        System.out.println(converter.convertStr("a"));
        List<String> list = Arrays.asList("Java", "Google", "Sun", "Ubuntu", "Basic","Ada");
        updateList(list);

    }

    private static void updateList(List<String> list) {
        MyConverter converter = x-> x.toUpperCase();
        list.stream() .map(x-> converter.convertStr(x)).forEach(x-> System.out.print(x + "  "));
    }
}
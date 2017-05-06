package javaSE.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Open project called TestLambda1 (from 1-7-1 lab).
 1) Add in a Main class a sumEven() static method that takes two parameters:
 the first - an array of integers, and the second - the predicate of Predicate<Integer> type for selecting numbers.
 2) Add in a main() method code that invokes sumEven() method and in the form of a lambda expression specifies the
 selection condition the values of the array elements.
 3) Add in a Main class a printJStr() static method that takes two parameters: the first - an list of strings, and the second
 - the predicate of Predicate<String> type for the selection of strings beginning with a given letter.
 4) Add in a main() method code that invokes printJStr() method and in the form of a lambda expression specifies the selection condition the strings.
 */
public class StreamLab172 {
    public static void main(String[] args) {
        //1) Add in a Main class a sumEven() static method
        Integer[] numbers = {2,3,4,5,6,7,8,9,1,10};
        sumEven(numbers, x-> x%2==0);
        System.out.println();
        sumEven(numbers, x-> x%3==0);
        System.out.println();
        //3) Add in a Main class a printJStr() static method
        List<String> list = getList();
        printJStr(list, x -> x.startsWith("A") );
        System.out.println();
        printJStr(list, x-> x.contains("oo"));
    }

    private static void printJStr(List<String> list, Predicate<String> condition) {
        List<String> list1 =list.stream().filter(x-> condition.test(x)).collect(Collectors.toList());
        list1.forEach(x-> System.out.print(x));
    }

    private static List<String> getList() {
        List<String> list = Arrays.asList("Java", "Google", "Sun", "Ubuntu", "Basic","Ada");
        return list;
    }

    private static void sumEven(Integer[] numbers, Predicate<Integer> condition) {
        //Stream.of(numbers).filter(x-> condition.test(x)).forEach(x-> System.out.print(x + " "));
        for (int i = 0; i < numbers.length; i++) {
            if (condition.test(numbers[i])){
                System.out.print(numbers[i] +" ");
            }
        }

    }

}
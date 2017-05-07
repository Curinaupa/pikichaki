package com.brainacad.wrappers;

/**
 * Create new project called  WrapperDemo2.
 * Add package “com.brainacad.oop.testwrapper2”.
 * Create class MainLab141 with method main().
 * Add to class MainLab141 static method compute( , ) that use as argument s two different
 * numeric wrapper classes, adds the values of the two instances together, and then creates a
 * third numeric wrapper instance whose value is the sum and return it.
 * For example:
 * static method compute(Byte, Integer) witch return Long type.
 * In method main() write code to invoke compute(,) and print result to console.
 * Execute the program.
 */
public class Lab20102 {
    public static void main(String[] args) {
        Number by = Byte.valueOf("6");
        Number in = Integer.valueOf("15");
        System.out.println(compute(Byte.MAX_VALUE, Integer.MAX_VALUE));

    }

    private static Long compute(Number b, Number i) {
        Long longValue = b.longValue() + i.longValue();

        return longValue;
    }
}

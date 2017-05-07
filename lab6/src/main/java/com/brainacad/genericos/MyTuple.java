package com.brainacad.genericos;

/**
 * Create a generic class MyTuple<A,B,C> with three fields of different
 types, provide constructor with three parameters and getters for each field.
 Create a class MainLab141 with a main( ) method.
 Add to method main() code that creates two objects of MyTuple.
 Firs one must be parameterized with next types: String, Integer, Long.
 The second must be parameterized with next types: Double, String, String.
 Execute the program.
 */
public class MyTuple < A , B, C>  {
    private  A  a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}

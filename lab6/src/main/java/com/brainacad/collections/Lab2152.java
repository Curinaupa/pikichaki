package com.brainacad.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Create new project called  TestCollection2.
 Add package “com.brainacad.oop.testcollection2”.
 Create a class MainLab141 with a main( ) method.
 Add to method main() code that declares “list” variable (of LinkedList type) of string objects as LinkedList<String>.
 Write code to fill this “list” in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 But element insertion point must be generated randomly (from 0 to current collection length).
 Add code which iterates over list and print current element value to console.
 Execute the program.
 The program output must be like next example:
 number_5
 number_2
 number_7
 …
 number_3

 import java.util.*;

 /**
 * Created by VC on 28.11.2016.
 */
public class Lab2152 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<String>();
//
//        list.add("aaa");
//        list.add("abc");
//        list.add("aaa");
//        list.add("abc");
//        list.add("aaaa");
//        list.add("aaabc");
//        list.add("aaabcd");
//        list.add("aa");
//        list.add("a");
//        list.add(5,"New");
//        list.add("aa");
//        list.add("123");
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.contains("aaaa"));
//        System.out.println(list);
//        System.out.println(list.remove("123"));
//        System.out.println(list);

//        //Collections method
//        Collections.addAll(list,"new1","new2","new3","new4","new5");
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.swap(list,0,list.size()-1);
//        System.out.println(list);
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);


        //Linked list
        List<String > link = new LinkedList<>();
        link.add("aaa");
        link.add("abc");
        link.add("aaa");
        link.add("abc");
        link.add("aaaa");
        System.out.println("LinkedList"+link);
        String s = link.get(2);
        System.out.println("Element at pos 2 "+s);
        link.add(2,"newelement");
        System.out.println(link);
//
//        //List -> HashSet
//        Set<String> mySet = new TreeSet<>(list);
//
//        System.out.println(list);
//        System.out.println(mySet);

        //lab2
        System.out.println("Lab2:");
        List<String> lnk = new LinkedList<String>();
        int i=0;
        Random random =new Random();
        while (i<=10){
            lnk.add("Number_" + random.nextInt(11));
            String element =  lnk.get(i);
            if (i!=0) {
                for (int j = 0; j <i; j++) {
                    if (element.equals(lnk.get(j))) {
                        lnk.remove(i);
                        i--;
                    }

                }



            }
            i++;
        }
        System.out.println(lnk);

//        for (int i = 0; i <=10 ; i++) {
//
//            lnk.add("Number_" + random.nextInt(10));
//
//        }


    }

}
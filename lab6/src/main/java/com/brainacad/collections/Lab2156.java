package com.brainacad.collections;

import java.util.Scanner;

/**
 * Create new project called  TestMap1.
 Add package “com.brainacad.oop.testmap1”.
 Create a class MyTranslator with private field “dictionary” of HashMap<String,String> type.
 Add method addNewWord(String en, String ru), which add to “dictionary” new word in two languages.
 Add new method translate(String en) which take some string in English language and return this test
 translated to Russian language as value of String type.
 Create a class Main with a main( ) method.
 Add to method main() code creates instance of MyTranslator. Add code to fill MyTranslator with few en-rus
 words pair by invoking addNewWord method.
 For example:
 “сat”, “кот”
 “mouse”, “мышь”
 …
 Add code to read string from console and pass it into translate method. Print result to console.
 Execute the program.
 The program output must be like next example:
 cat caught mouse
 кот поймал мышь

 */
public class Lab2156 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.next();
        String result = "";
        while (scanner.hasNext()){

        }

        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот" );
        myTranslator.addNewWord("mouse" , "мыщ");
        myTranslator.addNewWord("caught", "поймал");



    }
}

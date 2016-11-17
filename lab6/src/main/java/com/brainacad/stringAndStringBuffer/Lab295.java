package com.brainacad.stringAndStringBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create new project called TestRegExp. Add package “com.brainacad.oop.testsregexp”.
 Create a class Main with a main() method.
 Create public static method checkPersonWithRegExp(String userNameString) which take String
 as argument and return boolean value. This method must return true only if argument string
 value begin from Uppercase, then other chars in Lowercase and contains only letters.
 In main() method declare array of String with next values:
 {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
 Add code to check each of these values with checkPersonWithRegExp() method and print result to console.
 Execute the program.

 */
public class Lab295 {
    public static void main(String[] args) {
        String[] strArray = {"VOVA" , "Ivan" , "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat”", " "};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(checkPersonWithRegExp(strArray[i]));
            if (checkPersonWithRegExp(strArray[i])==true){
                System.out.println(strArray[i]);
            }
        }
    }
    public static boolean checkPersonWithRegExp(String userNameString){
        Pattern pattern = Pattern.compile("^[A-Z]([a-z]+[^0-9])");
        Matcher matcher = pattern.matcher(userNameString);

        return matcher.matches();
    }
}

package com.brainacad.stringAndStringBuffer;

/**
 * Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
 Create a class MainLab141 with a main() method. In method main() declare two local variables myStr1 and myStr2
 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
 Write code to display all of the letters, which are present in the first word, but absent in the second.

 */
public class Lab292 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println(absentLetters(myStr1, myStr2));
        System.out.println(absentLetters(myStr2, myStr1));
    }

    public static String absentLetters(String myStr1, String myStr2){
        String myStr3="";
        for (int i = 0; i <myStr1.length() ; i++) {
            boolean bool = false;
            for (int j = 0; j <myStr2.length() ; j++) {
                if ((String.valueOf(myStr1.charAt(i)).compareToIgnoreCase(String.valueOf(myStr2.charAt(j)))==0)|| ((myStr1.charAt(i) == myStr2.charAt(j))))
                {  bool = true; }
            }
            if (bool==false)
            {myStr3 = myStr3+myStr1.charAt(i);}
        }
        //System.out.println(myStr3);
        return myStr3;
    }
}

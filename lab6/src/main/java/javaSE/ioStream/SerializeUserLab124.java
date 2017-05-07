package javaSE.ioStream;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;

/**
 * Create new project called SerializeUser. Add package “com.brainacad.serialize_user”.
 * 1) Create class User with private fields : String firstName, String lastName, int age.
 * Add getters and setters to User class. Add two constructors: one with no arguments, another with parameters.
 * Override the toString() method.
 * 2) Create a class Main with a main() method, which creates an instance
 * User and adds it to the "users.ser" file using serialization (Note, to append to a file, use class RandomAccessFile
 * and a method of writeBytes(String ...)); 3) Add code in a main() method that reads from a file "users.ser"
 * using de-serialization all users and prints them to the console. 4) Execute the program.
 */
public class SerializeUserLab124 {
    public static void main(String[] args) throws IOException {
        List<User> list = getList();
        File filename = new File("user.ser");
        //writing to RAF


        System.out.println();
        int j = 0;
        for (int i = 0; i <= 9; i++) {
            j += 10;

            writeToRAF(filename, j, list.get(i));


        }
        //reading from RAF
        int position = 100;
        //File filename1 = new File("user.ser");
        String user = readFromRAF(filename, position);
        System.out.println(user);
//
//        String[] tokens = user.trim().split(" ");
//        System.out.println(tokens.length);
//        for (int i = 0; i <tokens.length ; i++) {
//            System.out.println(tokens[i]);
//        }

    }

    private static String readFromRAF(File filename, int position) {
        String str = null;
        try {
            RandomAccessFile   readRAF = new RandomAccessFile(filename, "rw");
            readRAF.seek(position);
            str = readRAF.readLine();
            readRAF.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private static void writeToRAF(File filename, int position, User user) {
        try {
            RandomAccessFile writeRAF = new RandomAccessFile(filename, "rw");
            writeRAF.seek(position);
            writeRAF.writeBytes(user.toString() + "\n");

            System.out.println(user.toString());
            writeRAF.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static List<User> getList() {
        List<User> list = Arrays.asList(
                new User("Ivan1", "Ivanov1", 25),
                new User("Ivan2", "Ivanov2", 25),
                new User("Ivan3", "Ivanov3", 25),
                new User("Ivan4", "Ivanov4", 25),
                new User("Ivan5", "Ivanov5", 25),
                new User("Ivan6", "Ivanov6", 25),
                new User("Ivan7", "Ivanov7", 25),
                new User("Ivan8", "Ivanov8", 25),
                new User("Ivan9", "Ivanov9", 25),
                new User("Ivan10", "Ivanov10", 25));

        return list;
    }
}
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
 * 2) Create a class MainLab141 with a main() method, which creates an instance
 * User and adds it to the "users.ser" file using serialization (Note, to append to a file, use class RandomAccessFile
 * and a method of writeBytes(String ...)); 3) Add code in a main() method that reads from a file "users.ser"
 * using de-serialization all users and prints them to the console. 4) Execute the program.
 */
public class SerializeUserLab124 {
    public static void main(String[] args) throws IOException {
        List<User> list = getList();
        File filename = new File("user.ser");
        //writing to RAF

        RandomAccessFile writeRAF = new RandomAccessFile(filename, "rw");
        System.out.println();
        int j = 0;
        for (int i = 0; i <= 9; i++) {
            j += 10;

            writeToRAF(writeRAF, j, list.get(i));
        }
        writeRAF.seek(0);

        //reading from RAF
//        int position = 90;
        //File filename1 = new File("user.ser");
        String user = readFromRAF(writeRAF, 0);
        System.out.println(user);
//
//        String[] tokens = user.trim().split(" ");
//        System.out.println(tokens.length);
//        for (int i = 0; i <tokens.length ; i++) {
//            System.out.println(tokens[i]);
//        }
        writeRAF.close();
    }

    private static String readFromRAF(RandomAccessFile readRAF, int position) {
        String str = null;
        try {
            str = readRAF.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private static void writeToRAF(RandomAccessFile writeRAF, int position, User user) {
        try {

            writeRAF.writeBytes(user.toString() + "\n");

            System.out.println(user.toString());


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
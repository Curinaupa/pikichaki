package javaSE.ioStream;



import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Lab 121
 * Create new project called DemoSerialize. Add package “com.brainacad.serialize”.
 * Create class Employee with private fields : String name, String address, int SSN, int number.
 * Add getters and setters to Employee class. Override the toString() method.
 * Create SerializeDemo program which instantiates an Employee object and serializes it to a file.
 * Open project DemoSerialize (from 1.2.1 labs). Modify class Employee (add transient keyword to SSN field)
 * Lab 122
 * Create DeserializeDemo program which de-serializes the Employee object created in the SerializeDemo program.
 Import the Employee class.
 */
public class DemoSerializable_Lab121 {
    public static void main(String[] args) {
        List<Employee> list = getEmployees();
        System.out.println("Source Instances of Employee :");
        list.stream().forEach(s -> System.out.println(s + " "));
//Writing serializable Objects into file
        try {
            File employee = new File("employeeOut.ser");
            FileOutputStream fos = new FileOutputStream(employee);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Employee employees : list) {
                oos.writeObject(employees);
                //System.out.println(employees);
            }

            oos.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
//Reading serializable Objects from File
        System.out.println("Read Objects from File");
        FileInputStream fis= null;
        ObjectInputStream ois=null;
        try{
            File in = new File("employeeOut.ser");
            fis = new FileInputStream(in);
            ois = new ObjectInputStream(fis);
            for (int i = 0; i <list.size() ; i++) {
                Employee e = (Employee) ois.readObject();
                if (e.getSSN()!=0){
                    System.out.printf("Name: %-10s  Address: %5s  SNN : %-10d %n", e.getName() ,e.getAddress(), e.getSSN());}
                else{
                    System.out.printf("Name: %-10s  Address: %5s  SNN : %-10s %n", e.getName() ,e.getAddress(), "transient");}

            }
            ois.close();
            fis.close();
        }catch (Exception e){
            System.err.println(e.getStackTrace());
        }





//        System.out.println("Employees object ");
//        System.out.println(employee1);
//        System.out.println(employee2);
//        //System.out.println("Serializing object Employee ");
//        File employee = new File("employee.ser");
//        FileOutputStream fo = new FileOutputStream(employee);
//        ObjectOutputStream oos = new ObjectOutputStream(fo);
//        oos.writeObject(employee1);
//        oos.writeObject(employee2);
//
//        //System.out.println("Deserializing Object Employee");
//        FileInputStream fi = new FileInputStream(employee);
//        ObjectInputStream ois = new ObjectInputStream(fi);
//        Employee employee3 = (Employee) ois.readObject();
//        Employee employee4 = (Employee) ois.readObject();
//
//        System.out.println("Printing objects employees datas");
//        System.out.println(employee3);
//        System.out.println(employee4);
//        System.out.println("Employee Name and address");
//        System.out.println("Employee1 Name" + employee3.getName());
//        System.out.println("Employee1 Address" + employee3.getAddress());
//        System.out.println("Employee2 Name" + employee4.getName());
//        System.out.println("Employee2 Address" + employee4.getAddress());

    }

    private static List<Employee> getEmployees() {
        List<Employee> list = Arrays.asList(
                new Employee("Peter", "Peremoga Str. 1", 1, 1),
                new Employee("Ivan", "Chernovola str. 2", 2, 2),
                new Employee("Vasia", "Irorevska Str. 5", 3, 2),
                new Employee("Serguey", "Peremoga  Str. 10", 4, 2),
                new Employee("Evgeny", "Peremoga Str. 16", 5, 2),
                new Employee("Anna", "Peremoga Str.100", 6, 2));
        return list;
    }

}
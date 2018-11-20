
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String studName = input.nextLine();
            if (studName.isEmpty()) {
                break;
            }
            System.out.print("Student number: ");
            String studNum = input.nextLine();
            list.add(new Student(studName, studNum));
        }
        System.out.println("");
        for (Student thing : list) {
            System.out.println(thing);
        }
        System.out.println("");

        System.out.print("Give search term: ");
        String searchTerm = input.nextLine();
        System.out.println("Result:");
        for (Student thing : list) {
            if (thing.getName().contains(searchTerm)) {
                System.out.println(thing);
            }
        }        
    }
}

/*
import java.util.ArrayList;
import java.util.Scanner
public class Main {
    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            list.add(new Student(name, number));
        }
 
        for (Student student : list) {
            System.out.println(student);
        }
 
        System.out.println();
 
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
 
        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
 */

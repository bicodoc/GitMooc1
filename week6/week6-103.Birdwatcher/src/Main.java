
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        AllBirds allBirds = new AllBirds();
        Scanner input = new Scanner(System.in);
        System.out.println("Type Add, Observation, Statistics, Show or Quit");
        while (true) {
        System.out.print("? ");
            String choice = input.nextLine();
            choice = choice.trim().toUpperCase();
            if (choice.equals("ADD")) {
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Latin Name: ");
                String species = input.nextLine();
                allBirds.addBird(name, species, 0);
            } else if (choice.equals("OBSERVATION")) {
                System.out.print("What was observed:? ");
                String name = input.nextLine();
                allBirds.observe(name);
            } else if (choice.equals("STATISTICS")) {
                allBirds.Stats();
            } else if (choice.equals("SHOW")) {
                System.out.print("What:? ");
                String name = input.nextLine();
                allBirds.show(name);
            } else if (choice.equals("QUIT")) {
                System.out.println("Goodbye!");
                break;
            }   
        }
        
        while (true) {
            
        }
    }
}

/*
import java.util.Scanner;
 
public class Main {  
    public static String ask(Scanner lukija, String kysymys) { //get a menu choice
        System.out.print(kysymys+" ");
        return lukija.nextLine();
    }
 
    public static void add(Scanner lukija, BirdDatabase db) { add a birdname/species to db
        String name = ask(lukija, "Name:");
        String latNimi = ask(lukija, "Latin Name:");
 
        db.addBird(name, latNimi);
    }
 
    public static void observation(Scanner lukija, BirdDatabase db) { observe a bird name
        String name = ask(lukija, "Name:");
 
        boolean success = db.observe(name);
        if (!success) {
            System.out.println("Is not a bird!");
        }
    }
 
    public static void show(Scanner lukija, BirdDatabase db) { print record for a bird
        String name = ask(lukija, "Name:");
        String answer = db.showBird(name);
        if (answer == null) {
            System.out.println("Is not a bird!");
        } else {
            System.out.println(answer);
        }
    }
 
    public static void statistics(Scanner lukija, BirdDatabase db) { print records for all birds
        System.out.print(db.statistics());
    }
 
    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();
 
        while (true) {
            String command = ask(scanner, "?");
 
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
    }
}
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner input = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedNumber = input.nextLine();
        System.out.println();

        boolean found = BinarySearch.search(array, Integer.parseInt(searchedNumber));
        
        // Print here the result
        if (found) {
            System.out.println("Searched number found!");
        } else {
            System.out.println("Searched number not found!");

        }

    }
}

/*
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // Test your program here
        int[] taulukko = {-3, 2, 3, 4, 7, 8, 12};
        Scanner lukija = new Scanner(System.in);
 
        System.out.print("Numbers in the array " + Arrays.toString(taulukko));
        System.out.println();
 
        System.out.print("Enter searched number: ");
        String etsittavaLuku = lukija.nextLine();
        System.out.println();
 
        boolean tulos = BinarySearch.search(taulukko, Integer.parseInt(etsittavaLuku));
 
        // Print here the result
        if (tulos) {
            System.out.println("Number " + etsittavaLuku + " is in the array.");
        } else {
            System.out.println("Number " + etsittavaLuku + " is not in the array.");
        }
    }
}
*/


import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
           System.out.print("Type a number (Type 0 to quit): ");
           int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum += read;

            // do something here

            System.out.println("Sum now: " + sum);
        }
        
        System.out.println("Sum in the end: " + sum);
    }
}

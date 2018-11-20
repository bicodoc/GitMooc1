
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int sumTo = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int number = 1;
        while (number <= sumTo) {
            sum += number;
            number++;
        }
        System.out.println("Sum is " + sum);
        
    }
}


import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double num1 = reader.nextDouble();
        System.out.print("Type another number: ");
        double num2 = reader.nextDouble();
        System.out.println("The bigger number of the two numbers given was: " +
                (int)(Math.max(num1, num2)));
       
        // Implement your program here. Remember to ask the input from user
    }
}

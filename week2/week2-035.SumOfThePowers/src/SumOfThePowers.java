
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        int exponent = 0;
        while (exponent <= power) {
            sum = sum + (int)(Math.pow(2,exponent));
            exponent++;
        }
        System.out.println("The result is " + sum);
    }
}

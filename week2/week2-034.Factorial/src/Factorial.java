import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 1;
        
        int start = 1;
        while (start <= number) {
            sum *= start;
            start++;
        }
        System.out.println("Sum is " + sum);
        
    }
}

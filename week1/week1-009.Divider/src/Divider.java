
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double number2 = Double.parseDouble(reader.nextLine());
        double result = number1 / number2;
        
        System.out.println("Division: " + number1 + " / " + (int)number2 + " = " + result);

        // Implement your program here. Remember to ask the input from user.
    }
}

/*
Type a number: 3
Type another number: 2

Division: 3 / 2 = 1.5
*/
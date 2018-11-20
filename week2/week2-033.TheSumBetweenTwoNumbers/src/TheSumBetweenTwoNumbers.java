
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int minNum = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int maxNum = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int number = minNum;
        while (number <= maxNum) {
            sum += number;
            number++;
        }
        System.out.println(sum);

    }
}

import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int minNum = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int maxNum = Integer.parseInt(reader.nextLine());

        int number = minNum;
        while (number <= maxNum) {
            System.out.println(number);
            number++;
        }
    }
}

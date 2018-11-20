import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {      
        Scanner reader = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (number != -1) {
            System.out.print("Type numbers: ");
            number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                sum += number;
                count++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("average: " + ((double)sum / count));
        System.out.println("even numbers: " + even);
        System.out.println("odd numbers: " + odd);
    }
}

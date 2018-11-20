
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("Type a temperature: ");
            double number = Double.parseDouble(reader.nextLine());
            if (number == 99) {
                System.out.print("The program will run until you close the graph.");
                break;
            }
            if (number >= -30 && number <= 40) {
                Graph.addNumber(number);
            } else {
                System.out.print("Number is out of range!");
            }
        }
    }
}

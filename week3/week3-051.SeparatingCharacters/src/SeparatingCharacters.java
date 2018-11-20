
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        separatingCharacters(name);
    }
    
    public static void separatingCharacters(String text) {
        int count = 0;
        while (count < text.length()) {
            System.out.println((count + 1) + ". character: " + text.charAt(count));
            count++;
        }
    }
}

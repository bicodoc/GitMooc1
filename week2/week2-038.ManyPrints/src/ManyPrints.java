import java.util.Scanner;

public class ManyPrints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many?");
        int num = Integer.parseInt(input.nextLine());
        while (num > 0){
            printText();
            num--;
        }       
    }
        
    public static void printText() {
           System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
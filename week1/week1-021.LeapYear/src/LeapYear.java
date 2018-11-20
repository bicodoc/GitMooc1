
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean leap = false;
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        if (year % 4 == 0) leap = true;
        if ((year % 100 == 0) && (year % 400 != 0)) leap = false;
        if (leap) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");           
        }
    }
}

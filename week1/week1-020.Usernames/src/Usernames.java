
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your Username:");
        String uname = reader.nextLine();
        System.out.print("Enter your Password:");
        String pword = reader.nextLine();
        if ((uname.equals("alex") && pword.equals("mightyducks"))
                || (uname.equals("emily") && (pword.equals("cat"))))
        {
            System.out.println("You are now logged into the system.");
        } else {
            System.out.print("Your username or password was invalid.");            
        }
    }
}

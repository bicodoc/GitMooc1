import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int pwLength;
    private String password;
    // Define the variables

    public PasswordRandomizer(int length) {
        this.random = new Random();
        this.pwLength = length;
        // Initialize the variable
    }

    public String createPassword() {
        this.password = "";
        for (int i = 0; i < this.pwLength; i++) {
            int number = this.random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            this.password = password + symbol;
        }
        return password;
        // write code that returns a randomized password
    }
}

/*
import java.util.Random;
 
public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
 
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }
 
    public String createPassword() {
        // write code that returns a randomized password
        String characters = "abcdefghijklmnopqrstuvwxyz";
 
        String password = "";
        int numberOfCharacters = this.length;
        
        while (numberOfCharacters > 0) {
            int luku = this.random.nextInt(characters.length());
            char c = characters.charAt(luku);
            password = password + c;
            numberOfCharacters--;
        }
        
        return password;
    }
}
*/
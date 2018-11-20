import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int counter = 0;
        while (true) {
            int number = (random.nextInt(40));
            if (!(containsNumber(number)) && number != 0) {
                numbers.add(number);
                counter++;
                if (counter == 7) break;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) return true;
        // Test here if the number is already in the drawn numbers
        return false;
    }
}

/*
import java.util.ArrayList;
import java.util.Random;
 
public class LotteryNumbers {
    private ArrayList<Integer> numbers;
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }
 
    public ArrayList<Integer> numbers() {
        return this.numbers;
    }
 
    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(39) + 1;
            boolean alreadyDrawn = this.containsNumber(newNumber);
 
            // we add the number only if it is not already among the drawn numbers
            if (!alreadyDrawn) {
                this.numbers.add(newNumber);
            }
        }
    }
 
    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for (int n : this.numbers) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }
}
*/
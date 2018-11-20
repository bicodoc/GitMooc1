import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
//        random = new Random();

        // Initialize here the number of sides
    }

    public int roll() {
        int face = (this.random.nextInt(this.numberOfSides) + 1);           
        // create here a random number belongig to range 1-numberOfSided
        return face;
    }
}

/*
import java.util.Random;
 
public class Dice {
    private Random random = new Random();
    private int numberOfSides;
 
    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
    }
 
    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return this.random.nextInt(this.numberOfSides) + 1;
    }
}
*/
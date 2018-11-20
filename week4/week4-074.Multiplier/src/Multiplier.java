public class Multiplier {
    private int ownNumber;
    
    public Multiplier(int number) {
        this.ownNumber = number;
    }

    public int multiply(int otherNumber) {
        return this.ownNumber * otherNumber;
    }
}

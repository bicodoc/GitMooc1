
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;


    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;        
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers++;
//        amountOfNumbers();
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }

    public double average() {
        double avg = 0;
        if (amountOfNumbers != 0) {
            avg = 1.0 * (double)sum / amountOfNumbers;
        }
        return avg;
    }
}

/*
public class NumberStatistics { 
    private int amountOfNumbers;
    private int sum;
 
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
 
    public void addNumber(int luku) {
        this.amountOfNumbers++;
        this.sum += luku;
    }
 
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
 
    public int sum() {
        return this.sum;
    }
 
    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        }
 
        return 1.0 * this.sum / this.amountOfNumbers;
    }
}
*/

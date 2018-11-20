public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initValue;


    public DecreasingCounter(int valueAtStart) {
        this.initValue = valueAtStart;
        this.value = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) value--;
        // write here code to decrease counter value by one
    }

    // and here the rest of the methods
    public void reset() {
        value = 0;
    }
    
    public void setInitial() {
        value = initValue;
    }
}

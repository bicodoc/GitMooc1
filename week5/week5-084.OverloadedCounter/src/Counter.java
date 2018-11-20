public class Counter {
    private int value;
    private boolean check;

    public Counter() {
        this(0, false);
    }
            
    public Counter(int value) {
        this(value, false);        
    }
        
    public Counter(boolean check) {
        this(0, check);
    }
                        
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;    
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase() {
        increase(1);
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) value += increaseAmount;
    }
    
    public void decrease() {
        decrease(1);
        if (check && value < 0) value = 0;
    }
    
    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) value -= decreaseAmount;
        if (this.check && value < 0) value = 0;
    }
    
    public void printValue() {
        System.out.println(value);
    }
    
    public String toPrint(int value) {
        return "counter value = " + value;
    }
}

/*
public class Counter {
 
    private int value;
    private boolean check;
 
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }
 
    public Counter(int value) {
        this(value, false);
    }
 
    public Counter(boolean tarkista) {
        this(0, tarkista);
    }
 
    public Counter() {
        this(0, false);
    }
 
    public int value() {
        return this.value;
    }
 
    public void increase() {
        increase(1);
    }
 
    public void decrease() {
        decrease(1);
    }
 
    public void increase(int by) {
        if (by >= 0) {
            this.value += by;
        }
    }
 
    public void decrease(int by) {
        if (by < 0) {
            return;
        }
 
        this.value -= by;
        
        if (this.check && this.value <0) {
            this.value = 0;
        }                 
    }
}
*/

public class BoundedCounter {
    private int value;
    private int upperLim;
    
    public BoundedCounter(int upperLim) {
        this.value = 0;
        this.upperLim = upperLim;        
    }
    
    public void next() {
        value++;
        if (value > upperLim) value = 0;
    }
    
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
        return "" + value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= upperLim) {
        this.value = value;
        }
    }
    
    
    
}

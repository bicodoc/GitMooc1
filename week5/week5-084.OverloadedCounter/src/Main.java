public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10, true);
        counter.printValue();
        counter.increase();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.increase(5);
        counter.printValue();
        counter.decrease(10);
        counter.printValue();
    }    
}

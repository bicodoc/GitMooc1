/*
 *  DO TOT TOUCH THIS CLASS!
 */

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }
    
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.becomeOlder(1);
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    public boolean Adult() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public double weightIndex() {
        double heightInMeters = this.height / 100.0;
        return this.weight / (heightInMeters * heightInMeters);
    }
    
    public String toString() {
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }
    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}

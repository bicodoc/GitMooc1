import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name) { //get calendar info after creating object
        this.name = name;
        
        Calendar now = Calendar.getInstance();
        int day = now.get(Calendar.DATE);
        int month = now.get(Calendar.MONTH) + 1;
        int year = now.get(Calendar.YEAR);
        this.birthday = new MyDate(day, month, year);
        
//        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), +
//        ((Calendar.getInstance().get(Calendar.MONTH) + 1)), +
//        (Calendar.getInstance().get(Calendar.YEAR)));
    }
            
    
    public Person(String name, int dd, int mm, int yy) {
        this.name = name;
        this.birthday = new MyDate(dd, mm, yy);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
        
    }
    
    public int age() { //get calendar info w/out creating object
        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(day, month, year);
        return today.differenceInYears(birthday);
        
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        //return 0;
    }
    
    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)) return true;
        // compare the ages based on birthdays
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }    
}

/*
import java.util.Calendar;
 
public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        
        Calendar nyt = Calendar.getInstance();
        int year = nyt.get(Calendar.YEAR);
        int month = nyt.get(Calendar.MONTH) + 1;
        int day = nyt.get(Calendar.DATE);
        this.birthday = new MyDate(day, month, year);
    }
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DATE);
        MyDate tamaPaiva = new MyDate(day, month, year);
        return birthday.differneceInYears(tamaPaiva);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
*/
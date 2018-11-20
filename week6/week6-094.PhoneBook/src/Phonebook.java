import java.util.ArrayList;

public class Phonebook {
    ArrayList<Person> phones;
    
    public Phonebook() {
        phones = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        phones.add(newPerson);
    }
    
    public void printAll() {
        for (Person thing : phones) {
            System.out.println(thing);
        }
    }
    
    public String searchNumber(String name) {
        for (Person thing : phones) {
            if (thing.getName().equals(name)) {
                return thing.getNumber();
            }
        }
        return "number not known";
    }
}


import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Implement the methods here
    public void addMeal(String meal) {
        if (!(meals.contains(meal))) {
            meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String oneMeal : meals) {
            System.out.println(oneMeal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
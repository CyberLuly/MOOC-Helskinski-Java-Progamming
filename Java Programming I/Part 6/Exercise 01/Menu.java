
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal (String meal){
        if (!this.meals.contains(meal)){
            this.meals.add(meal);
        }
    }

    public void printMeals(){
        for (String mealList : meals){
            System.out.println(mealList);
        }

    }

    public void clearMenu(){
        while (!this.meals.isEmpty()){
            this.meals.remove(0);
        }
    }


}

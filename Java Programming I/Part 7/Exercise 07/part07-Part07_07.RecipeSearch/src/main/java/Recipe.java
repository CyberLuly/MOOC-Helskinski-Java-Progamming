import java.util.ArrayList;
import java.util.Scanner;


public class Recipe {

    String recipeName;
    int recipeDuration;
    ArrayList<String> recipeIngredients;

    public Recipe() {
        recipeIngredients = new ArrayList<>();

    }


    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeDuration(int recipeDuration) {
        this.recipeDuration = recipeDuration;
    }

    public int getRecipeDuration() {
        return recipeDuration;
    }

    public void addIngredient(String ingredient) {
        this.recipeIngredients.add(ingredient);
    }

    public void addRecipe(Scanner fileReader, RecipeList recipeList) {
        Recipe recipe = new Recipe();
        int i = 0;
        while (fileReader.hasNextLine()) {
            String row = fileReader.nextLine();
            if (i == 0) {
//                System.out.println(row);
                recipe.setRecipeName(row);
                i++;
            } else if (i == 1) {
//                System.out.println(row);
                recipe.setRecipeDuration(Integer.valueOf(row));
                i++;
            } else {
                if (row.isEmpty()) {
                    recipeList.addRecipe(recipe);
                    erase();
                    recipe = new Recipe();
                    i = 0;
                }
                recipe.addIngredient(row);
            }
        }
        if (i != 0) {
            recipeList.addRecipe(recipe);
            erase();
        }
    }


    public void listIngredients() {
        for (String ingredient : this.recipeIngredients) {
            System.out.println(ingredient);
        }
    }


    private void erase() {
        this.recipeName = "test";
        this.recipeDuration = 0;
        while (!this.recipeIngredients.isEmpty()) {
            this.recipeIngredients.remove(recipeIngredients.size() - 1);
        }
    }

    @Override
    public String toString() {
        return getRecipeName() + ", cooking time: " + recipeDuration;
    }
}
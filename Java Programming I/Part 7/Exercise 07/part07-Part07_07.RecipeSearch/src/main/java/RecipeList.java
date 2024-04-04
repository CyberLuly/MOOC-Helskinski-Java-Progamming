import java.util.ArrayList;

public class RecipeList {

    public ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public void getIngredients() {
        int i = 0;
        while (i <= this.recipeList.size() - 1) {
            Recipe recipe = this.recipeList.get(i);
            recipe.listIngredients();
            i++;
        }
    }


    public void getRecipeNames() {
        int i = 0;
        for (Recipe recipe : recipeList) {
            System.out.println(recipe.getRecipeName());
        }
    }

    public void searchByRecipeName(String searchedWord, RecipeList recipeList) {
        Recipe recipe = new Recipe();
        for (int i = 0; i < this.recipeList.size(); i++) {
            recipe = recipeList.recipeList.get(i);
            if (recipe.getRecipeName().contains(searchedWord)) {
                System.out.println(recipe);
            }
        }
    }

    public void searchByRecipeDuration(int maxTime, RecipeList recipeList) {
        Recipe recipe = new Recipe();
        for (int i = 0; i < this.recipeList.size(); i++) {
            recipe = recipeList.recipeList.get(i);
            if (recipe.getRecipeDuration() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public void searchByRecipeIngredient(String ingredient, RecipeList recipeList) {
        Recipe recipe = new Recipe();

        for (int i = 0; i < this.recipeList.size(); i++) {
            recipe = recipeList.recipeList.get(i);

            if (recipe.recipeIngredients.contains(ingredient)) {
                System.out.println(recipe);
            }
        }

    }

}

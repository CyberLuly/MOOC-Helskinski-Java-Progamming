import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {

    public void start(RecipeList recipeList) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println();
        Recipe recipe = new Recipe();

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {

            label:
            while (userInput != "stop") {

                recipe.addRecipe(fileReader, recipeList);


                System.out.print("Enter command: ");
                userInput = scanner.nextLine();
                System.out.println();


                switch (userInput) {
                    case "list":
                        System.out.println("Recipes:");
                        for (int i = 0; i < recipeList.recipeList.size(); i++) {
                            System.out.println(recipeList.recipeList.get(i));
                        }
                        System.out.println();
                        break;

                    case "find name":
                        System.out.print("Searched word: ");
                        String searchedWord = scanner.nextLine();
                        recipeList.searchByRecipeName(searchedWord, recipeList);
                        System.out.println();
                        break;

                    case "find cooking time":
                        System.out.print("Max cooking time: ");
                        int maxTime = Integer.valueOf(scanner.nextLine());
                        System.out.println();
                        System.out.println("Recipes: ");
                        recipeList.searchByRecipeDuration(maxTime, recipeList);
                        System.out.println();
                        break;

                    case "find ingredient":
                        System.out.print("Ingredient: ");
                        String searchedIngredient = scanner.nextLine();
                        System.out.println();
                        System.out.println("Recipes:");
                        recipeList.searchByRecipeIngredient(searchedIngredient, recipeList);
                        System.out.println();
                        break;

                    case "stop":
                        break label;
                }

            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }


}

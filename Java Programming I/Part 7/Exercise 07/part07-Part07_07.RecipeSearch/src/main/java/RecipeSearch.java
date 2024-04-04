
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipeList recipeList = new RecipeList();
        UserInterface ui = new UserInterface();

        ui.start(recipeList);


    }

}

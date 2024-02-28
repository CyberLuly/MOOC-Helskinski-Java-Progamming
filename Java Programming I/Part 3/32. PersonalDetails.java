
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int nameLength = 0;
        String longestName = "";
        int amountOfInputs = 0;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            String[] pieces = userInput.split(",");
            sum += Integer.valueOf(pieces[1]);

            if (pieces[0].length() > nameLength){
                nameLength = pieces[0].length();
                longestName = pieces[0];
            }

            amountOfInputs++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum/amountOfInputs));


    }
}

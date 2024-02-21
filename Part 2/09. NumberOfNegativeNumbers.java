
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                System.out.println("Number of negative numbers: " + numberOfNegatives);
                break;
            }

            if (userInput > 0){
                continue;
            }

            numberOfNegatives += 1;

        }
    }
}

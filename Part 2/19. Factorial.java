
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
            if (i == userInput) {
                System.out.println("Factorial: " + factorial);
            }
        }
        if (userInput == 0) {
            System.out.println("Factorial: " + factorial);
        }
    }
}

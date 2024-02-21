
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = 0;
        int sumOfInputs = 0;

        while (true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0){
                System.out.println("Number of numbers: " + numberOfInputs);
                System.out.println("Sum of the numbers: " + sumOfInputs);
                break;
            }

            numberOfInputs += 1;
            sumOfInputs += userInput;

        }
    }
}

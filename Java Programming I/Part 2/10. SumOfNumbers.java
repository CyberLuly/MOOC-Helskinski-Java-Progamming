
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfInputs = 0;

        while (true) {
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0){
                System.out.println("Sum of the numbers: " + sumOfInputs);
                break;
            }
            
            sumOfInputs = sumOfInputs + (userInput);

        }
    }
}

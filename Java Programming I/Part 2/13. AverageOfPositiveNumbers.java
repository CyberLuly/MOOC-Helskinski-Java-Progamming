
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositives = 0;
        int numberOfPositives = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0 && numberOfPositives == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (userInput == 0) {
                System.out.println((double) sumOfPositives / numberOfPositives);
                break;
            }

            if (userInput > 0){
                sumOfPositives += userInput;
                numberOfPositives += 1;
            }
        }
    }
}

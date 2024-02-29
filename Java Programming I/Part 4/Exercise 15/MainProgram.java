
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        int oddNumbers = 0;
        int evenNumbers = 0;

        System.out.println("Enter numbers: ");

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + statisticsEven.sum());
                System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
                break;
            }
            statistics.addNumber(userInput);

            if (userInput % 2 == 0) {
                statisticsEven.addNumber(userInput);
            } else {
                statisticsOdd.addNumber(userInput);
            }
            
        }

    }
}

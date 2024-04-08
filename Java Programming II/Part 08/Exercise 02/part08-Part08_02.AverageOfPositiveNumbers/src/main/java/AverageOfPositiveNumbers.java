
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {

            String userInput = scanner.nextLine();

            if (Integer.valueOf(userInput) == 0) {
                break;
            }

            if (Integer.valueOf(userInput) > 0) {
                numbers.add(Integer.valueOf(userInput));
            }

        }

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        if (sum > 0) {
            System.out.println((double) sum / numbers.size());
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}

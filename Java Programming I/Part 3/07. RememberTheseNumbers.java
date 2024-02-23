
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                break;
            }

            numbers.add(userInput);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}

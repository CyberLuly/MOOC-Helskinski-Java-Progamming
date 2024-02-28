
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            String[] pieces = userInput.split(",");
            age = Integer.valueOf(pieces[1]);
            if (age > 0) {
                if (age > oldest) {
                    oldest = age;
                }
            } else {
                System.out.println("No input.");
            }

        }

        System.out.println("Age of the oldest: " + oldest);


    }
}

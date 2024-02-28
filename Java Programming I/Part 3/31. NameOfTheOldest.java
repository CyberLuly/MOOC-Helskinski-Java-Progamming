
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int age = 0;
        String nameOldest = "";
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
                    nameOldest = pieces[0];
                }
            } else {
                System.out.println("No input.");
            }

        }

        System.out.println("Name of the oldest: " + nameOldest);


    }
}
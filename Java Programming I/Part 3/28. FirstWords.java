
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            String[] pieces = userInput.split(" ");

            System.out.println(pieces[0]);

        }


    }
}

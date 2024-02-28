
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "0";

        while (!userInput.isEmpty()){
            userInput = scanner.nextLine();
            String[] pieces = userInput.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }

        }
        
    }
}

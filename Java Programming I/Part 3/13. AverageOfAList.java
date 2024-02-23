
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();

        while (true) {
            System.out.print("Insert a number (-1 to exit): ");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }
            number.add(userInput);
        }

        int sum = 0;
        for (int numbers : number) {
            sum += numbers;
        }
        System.out.println((double) sum / number.size());
        
    }
}

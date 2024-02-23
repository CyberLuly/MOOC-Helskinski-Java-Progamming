
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Insert a number (9999 to exit): ");
        int userInput = Integer.valueOf(scanner.nextLine());
        list.add(userInput);
        
        int smallestNumber = list.get(0);
        int smallestIndex = 0;
        int index = 0;

        while (userInput != 9999) {

            if (userInput < smallestNumber) {
                smallestNumber = userInput;
                smallestIndex = index;
            }
            System.out.print("Insert a number (9999 to exit): ");
            userInput = Integer.valueOf(scanner.nextLine());
            index++;
        }

        System.out.println("Smallest number: " + smallestNumber);
        System.out.println("Found at index: " + smallestIndex);

    }
}

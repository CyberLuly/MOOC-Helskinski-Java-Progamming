
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        if (firstNumber % 2 == 0){
            System.out.println("Number " + firstNumber + " is even.");
        } else {
            System.out.println("Number " + firstNumber + " is odd.");
        }
    }
}

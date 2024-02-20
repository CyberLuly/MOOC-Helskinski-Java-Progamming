
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scanner.nextLine());

        if (firstNumber < 0) {
            System.out.println(firstNumber * -1);
        } else {
            System.out.println(firstNumber);
        }
    }
}

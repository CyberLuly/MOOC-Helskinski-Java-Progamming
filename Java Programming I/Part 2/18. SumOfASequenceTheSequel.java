
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber;

        while (true){
            sum = sum + firstNumber + 1;
            firstNumber++;
            System.out.println(firstNumber);

            if(firstNumber == lastNumber){
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}


import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberTotal = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true){
            System.out.println("Give numbers:");
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput > 0){
                sum += userInput;
            }

            if (userInput == (-1)){ //BREAK CONDITION
                System.out.println("Thx! Bye!");
                break;
            }

            if (userInput % 2 == 0){ //ODD OR EVEN?
                evenNumbers++;
            } else {
                oddNumbers++;
            }

            numberTotal++;  //Number of numbers inputted.
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberTotal);
        System.out.println("Average: " + ((double) sum / numberTotal));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);

    }
}

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= userInput; i++){
            sum += i;

            if (i == userInput){
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}


import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int numDays = Integer.valueOf(scanner.nextLine());
        int hoursTotal = numDays * 24;
        int minutesTotal = hoursTotal * 60;
        int secondsTotal = minutesTotal * 60;
        System.out.println(secondsTotal);
    }
}

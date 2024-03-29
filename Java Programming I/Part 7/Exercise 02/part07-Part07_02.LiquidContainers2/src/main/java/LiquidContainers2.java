
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            //Exit function
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount = Integer.valueOf(parts[1]);

            //Add function
            if (parts[0].equals("add")) {
                firstContainer.add(amount);
            }

            //Move function
            if (parts[0].equals("move")) {
                if (amount > 0) {

                    if (firstContainer.contains() >= amount) {
                        secondContainer.add(amount);
                        firstContainer.remove(amount);
                    } else if (firstContainer.contains() < amount) {
                        secondContainer.add(firstContainer.contains());
                        firstContainer.remove(100);
                    }
                }
            }

            //Remove function
            if (parts[0].equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
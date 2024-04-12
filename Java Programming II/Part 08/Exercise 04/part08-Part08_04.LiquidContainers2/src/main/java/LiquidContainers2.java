
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second " + containerTwo);
            String[] userInput = scan.nextLine().split(" ");
            String command = userInput[0];

            if (command.equals("add")) {
                int amount = Integer.valueOf(userInput[1]);
                containerOne.add(amount);
            }

            if (command.equals("move")) {
                int amount = Integer.valueOf(userInput[1]);
                if (containerOne.contains() >= amount) {
                    containerTwo.add(amount);
                    containerOne.remove(amount);
                } else {
                    containerTwo.add(containerOne.contains());
                    containerOne.remove(amount);
                }
            }

            if (command.equals("remove")) {
                int amount = Integer.valueOf(userInput[1]);
                containerTwo.remove(amount);
            }

            if (command.equals("quit")) {
                break;
            }

        }
    }

}

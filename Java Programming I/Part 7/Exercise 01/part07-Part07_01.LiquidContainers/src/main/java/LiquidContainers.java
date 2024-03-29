
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            //Exit function
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            //Add function
            if (parts[0].equals("add")) {
                if (Integer.valueOf(parts[1]) > 0) {
                    firstContainer += Integer.valueOf(parts[1]);
                }
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }

            //Move function
            if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) > 0) {

                    if (firstContainer >= Integer.valueOf(parts[1])) {
                        secondContainer += Integer.valueOf(parts[1]);
                        firstContainer -= Integer.valueOf(parts[1]);
                    } else if (firstContainer < Integer.valueOf(parts[1])) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    }

                    if (secondContainer > 100) {
                        secondContainer = 100;
                    }

                    if (firstContainer < 0) {
                        firstContainer = 0;
                    }
                }
            }

            //Remove function
            if (parts[0].equals("remove")) {
                if (Integer.valueOf(parts[1]) > 0) {
                    secondContainer -= Integer.valueOf(parts[1]);
                }

                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }


        }
    }

}

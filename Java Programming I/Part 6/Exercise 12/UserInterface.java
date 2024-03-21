import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        String command;
        label:
        while (true) {
            System.out.println("Commands: \n" +
                    "1 - add a joke \n" +
                    "2 - draw a joke \n" +
                    "3 - list jokes \n" +
                    "X - stop");

            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokeManager.addJoke(joke);
                    break;

                case "2":
                    System.out.println(jokeManager.drawJoke());
                    break;

                case "3":
                    jokeManager.printJokes();
                    break;

                case "X":
                    break label;
            }

        }

    }

}

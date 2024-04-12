import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        label:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    list.add(task);
                    break;

                case "list":
                    list.print();
                    break;

                case "remove":
                    System.out.print("Which one is removed? ");
                    int toRemove = Integer.valueOf(scanner.nextLine());
                    list.remove(toRemove);
                    break;

                case "stop":
                    break label;
            }
        }
    }

}

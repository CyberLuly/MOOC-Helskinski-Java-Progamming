import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        label:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    break label;

                case "add":
                    System.out.print("To add: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    break;

                case "list":
                    todoList.print();
                    break;

                case "remove":
                    System.out.print("Which one is removed? ");
                    int toBeRemoved = Integer.valueOf(scanner.nextLine());
                    todoList.remove(toBeRemoved);
            }
        }
    }


}

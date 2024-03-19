import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        String command;
        label:
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();

            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break label;

                case "add":
                    System.out.print("Word: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();

                    this.dictionary.add(word, translation);
                    break;

                case "search":
                    System.out.print("To be translated: ");
                    String toBeTranslated = scanner.nextLine();
                    if (dictionary.translate(toBeTranslated) == null) {
                        System.out.println("Word " + toBeTranslated + " was not found");

                    } else {
                        System.out.print("Translation: " + dictionary.translate(toBeTranslated));
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }

        }

    }


}

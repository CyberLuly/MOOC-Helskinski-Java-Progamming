import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, bookPages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String userInput = scanner.nextLine();
        if (userInput.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (userInput.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }

        }

//


    }
}

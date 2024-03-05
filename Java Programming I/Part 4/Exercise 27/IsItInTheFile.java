
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> fileContent = new ArrayList<>();

        try (Scanner wordSearcher = new Scanner(Paths.get(file))) {
            while (wordSearcher.hasNextLine()) {
                fileContent.add(wordSearcher.nextLine());
                if (fileContent.get(fileContent.size() - 1).equals(searchedFor)) {
                    System.out.println("Found!");
                    break;
                }
                if (!wordSearcher.hasNextLine()) {
                    System.out.println("Not found.");
                }

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}

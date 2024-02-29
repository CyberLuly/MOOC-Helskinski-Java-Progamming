
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("First name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println();
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(name, lastName, identificationNumber));

        }

        for (PersonalInformation people : infoCollection) {
            System.out.println(people.getFirstName() + " " + people.getLastName());
        }

    }
}

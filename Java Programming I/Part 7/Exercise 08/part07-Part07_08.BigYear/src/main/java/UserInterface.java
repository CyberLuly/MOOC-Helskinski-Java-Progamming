import java.util.Scanner;

public class UserInterface {

    public void start(BirdList birdList, Scanner scan) {
        Bird bird = new Bird();

        label:
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            switch (command) {
                case "Add":
                    bird.addBird(birdList, scan);
                    break;

                case "Observation":
                    bird.addObservation(birdList, scan);
                    break;

                case "All":
                    bird.printAllBirds(birdList);
                    break;

                case "One":
                    bird.printOneBird(birdList, scan);
                    break;

                case "Quit":
                    break label;
            }
        }

    }


}

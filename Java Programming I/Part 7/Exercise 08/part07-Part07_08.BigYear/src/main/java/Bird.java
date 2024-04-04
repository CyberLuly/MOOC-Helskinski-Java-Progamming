import java.util.ArrayList;
import java.util.Scanner;

public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird() {
        observation = 0;
    }

    public String getName() {
        return name;
    }

    public void addBird(BirdList birdList, Scanner scan) {
        Bird bird = new Bird();
        System.out.print("Name: ");
        bird.name = scan.nextLine();
        System.out.print("Name in Latin: ");
        bird.latinName = scan.nextLine();

        birdList.addBirdToList(bird, birdList);
    }

    public void addObservation(BirdList birdList, Scanner scan) {
        System.out.print("Adding observation to: ");
        String birdToHaveObservationAdded = scan.nextLine();
        boolean birdFound = false;

        for (int i = 0; i < birdList.birds.size(); i++) {
            if (birdList.birds.get(i).getName().equals(birdToHaveObservationAdded)) {
                birdList.birds.get(i).observation++;
                birdFound = true;
            }
        }

        if (!birdFound) {
            System.out.println("No bird with the name " + birdToHaveObservationAdded + " was found.");
        }
    }

    public void printOneBird(BirdList birdList, Scanner scan) {
        System.out.print("Bird to be searched: ");
        String birdToBeSearched = scan.nextLine();
        boolean birdFound = false;

        for (int i = 0; i < birdList.birds.size(); i++) {
            if (birdList.birds.get(i).name.equals(birdToBeSearched)) {
                System.out.println(birdList.birds.get(i));
                birdFound = true;
            }
        }

        if (!birdFound) {
            System.out.println(birdToBeSearched + " was not found.");
        }

    }

    public void printAllBirds(BirdList birdList) {
        for (int i = 0; i < birdList.birds.size(); i++) {
            System.out.println(birdList.birds.get(i));
        }
    }


    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observation";
    }
}

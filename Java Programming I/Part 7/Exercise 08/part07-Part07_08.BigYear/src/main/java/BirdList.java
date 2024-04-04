import java.util.ArrayList;

public class BirdList {

    ArrayList<Bird> birds;

    public BirdList() {
        birds = new ArrayList<>();
    }

    public void addBirdToList(Bird bird, BirdList birdList) {
        birdList.birds.add(bird);
    }


}

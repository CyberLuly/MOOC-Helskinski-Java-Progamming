import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase suitcaseList : suitcases) {
            totalWeight += suitcaseList.totalWeight();
        }

        if (suitcase.totalWeight() + totalWeight <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }


    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}

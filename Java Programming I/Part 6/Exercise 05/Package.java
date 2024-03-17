import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftList;

    public Package() {
        giftList = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftList.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gifts : giftList) {
            totalWeight += gifts.getWeight();
        }
        return totalWeight;
    }

}

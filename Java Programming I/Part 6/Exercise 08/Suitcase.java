import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maximumWeight) {
            items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items){
            if (item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }



    @Override
    public String toString() {

        //Suitcase is empty
        if (items.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }

        //Suitcase contains 1 item
        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        }

        //Suitcase contains more than one item
        return items.size() + " items (" + totalWeight() + " kg)";
    }
}

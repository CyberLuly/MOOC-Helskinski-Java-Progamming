import java.util.ArrayList;

public class Item {

    private String identifier;
    private String name;

    public Item (String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getId(){
        return identifier;
    }

    public boolean checkIdDuplicate(Item itemChecked, ArrayList<Item> itemList){
        for (Item item : itemList){
            if (item.getId().equals(itemChecked.getId())){
                return false;
            }
        }
        return true;
    }


    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}

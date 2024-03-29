
import java.lang.reflect.Array;
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }


    @Override
    public String toString() {
        String printOutputSolo = "The collection " + name + " has " + this.elements.size() + " element:\n";
        String printOutputEmpty = "The collection " + name + " is empty.";
        String printOutputMult = "The collection " + name + " has " + this.elements.size() + " elements:\n";

        String elementList = "";
        ArrayList<String> elementListArray = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            elementListArray.add(elements.get(i));
        }
        for (String elements : elementListArray) {
            elementList += elements + "\n";
        }


        if (this.elements.isEmpty()) {
            return printOutputEmpty;
        } else if (this.elements.size() == 1) {
            return printOutputSolo + elements.get(0);
        }
        return printOutputMult + elementList;

    }
}

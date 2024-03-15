import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack(){
        this.list = new ArrayList<String>();
    }

    public boolean isEmpty(){
        return (this.list.isEmpty());
    }

    public void add(String value){
        this.list.add(value);
    }

    public ArrayList<String> values(){
        ArrayList<String> newList = new ArrayList<>();
        newList = this.list;
        return newList;
    }

    public String take(){
        String lastValue = this.list.get(list.size() - 1);
        this.list.remove(list.size() - 1);
        return lastValue;
    }

}

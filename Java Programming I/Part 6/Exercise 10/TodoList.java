import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        toDo = new ArrayList<>();
    }

    public void add(String task) {
        toDo.add(task);
    }

    public void print() {
        for (int i = 0; i < toDo.size(); i++) {
            System.out.println((i + 1) + ": " + toDo.get(i));
        }
    }

    public void remove(int number) {
        toDo.remove((number - 1));
    }


}

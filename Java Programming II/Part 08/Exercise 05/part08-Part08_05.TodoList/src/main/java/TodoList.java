import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;


    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int i = 0;
        for (String task : tasks) {
            System.out.println((i + 1) + ": " + task);
            i++;
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }

}


public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(0);

        System.out.println(counter.value());
        counter.increase(5);
        System.out.println(counter.value());
        counter.decrease(2);
        System.out.println(counter.value());
        counter.decrease(-2);
        System.out.println(counter.value());
    }
}

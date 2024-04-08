
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write a number ('end' to exit)");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            System.out.println(cubed(Integer.valueOf(command)));

        }
    }

    public static int cubed(int number) {
        return number * number * number;
    }

}

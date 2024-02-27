
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String userPassword = scanner.nextLine();

        if (userUsername.equals("alex")) {
            if (userPassword.equals("sunshine")) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }

        if (userUsername.equals("emma")){
            if (userPassword.equals("haskell")){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }
        
    }
}

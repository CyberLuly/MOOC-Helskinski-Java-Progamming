
public class YourFirstAccount {

    public static void main(String[] args) {
        Account userAccount = new Account("Lucas",100);

        userAccount.deposit(20);
        System.out.println(userAccount);
        
    }
}

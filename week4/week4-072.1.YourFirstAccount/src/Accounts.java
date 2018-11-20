
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
//        Account bartosAccount = new Account("Barto's account", 100.0);
//        Account mattsAccount = new Account("Matt's Account", 1000.00);
//        Account myAccount = new Account("My Account", 0);
        Account A = new Account("A", 100);
        Account B = new Account("B", 0);
        Account C = new Account("C", 0);
        
        System.out.println("Initial state");
//        System.out.println(bartosAccount);
//        System.out.println(mattsAccount);
//        System.out.println(myAccount);
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);

//        bartosAccount.deposit(20.0);
//        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
//        mattsAccount.withdrawal(100);
//        myAccount.deposit(100);
            transfer(A, B, 50);
            transfer(B, C, 25);
        
        System.out.println("Final state");
//        System.out.println(bartosAccount);
//        System.out.println(mattsAccount);
//        System.out.println(myAccount);
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
    }
        
        public static void transfer(Account from, Account to, double howMuch) {
            from.withdrawal(howMuch);
            to.deposit(howMuch);
        }
}

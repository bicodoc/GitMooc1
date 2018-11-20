
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsAccount = new Account("Matt's account",1000.0);
        Account myAccount = new Account("My account", 0);
        
//        System.out.println("Initial state");
//        System.out.println(mattsAccount);
        
        mattsAccount.withdrawal(100.00);
        myAccount.deposit(100);
        
//        System.out.println("Matt's account balance is now: " + mattsAccount.balance());

//        System.out.println("Final state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);
        
    }
}

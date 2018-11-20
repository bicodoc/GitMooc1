
public class LyyraCard {

    private double balance;

    public LyyraCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        if (amount < 0) return;
        if (balance + amount > 150) {
            balance = 150;
        } else
            this.balance += amount;
        }

    public boolean pay(double amount) {
        if (this.balance < amount) {
            return false;
        }
        this.balance = this.balance - amount;
        return true;
    }

    public void payEconomical() {
        if (this.balance > 2.50) {
            pay(2.50);
        }
    }

    public void payGourmet() {
        if (this.balance > 4.00) {
            pay(4.00);
        }
    }

    public String toString() {
        return "the card has " + this.balance() + " euros";
    }
}

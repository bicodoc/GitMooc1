
public class CashRegister {

    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private double econPrice;
    private double gourmetPrice;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.econPrice = 2.50;
        this.gourmetPrice = 4.00;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven < econPrice) {
            econPrice = 0;
        }
        if (cashGiven >= econPrice) {
            cashInRegister += econPrice;
            economicalSold++;
        }
        return cashGiven - econPrice;
   }

    public double payGourmet(double cashGiven) {
        if (cashGiven < gourmetPrice) {
            gourmetPrice = 0;
        }
        if (cashGiven >= gourmetPrice) {
            cashInRegister += gourmetPrice;
            gourmetSold++;
        }
        return cashGiven - gourmetPrice;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() < econPrice) {
            return false;
        }
        if (card.balance() >= econPrice) {
            card.pay(econPrice);
            economicalSold++;
        }
        return true;
        }        
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() < gourmetPrice) {
            return false;
        }
        if (card.balance() >= gourmetPrice) {
            card.pay(gourmetPrice);
            gourmetSold++;
        }
        return true;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            cashInRegister += sum;
            card.loadMoney(sum);            
        }
}

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

/*
public class CashRegister {
 
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    // Javassa vakio määritellään näin
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_IOF_GOURMET = 4.0;
 
    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }
 
    public double payEconomical(double cashGiven) {
        if (cashGiven < PRICE_OF_ECONOMICAL) {
            return cashGiven;
        }
 
        this.cashInRegister += PRICE_OF_ECONOMICAL;
        this.economicalSold++;
        return cashGiven - PRICE_OF_ECONOMICAL;
    }
 
    public double payGourmet(double cashGiven) {
        if (cashGiven < PRICE_IOF_GOURMET) {
            return cashGiven;
        }
 
        this.cashInRegister += PRICE_IOF_GOURMET;
        this.gourmetSold++;
        return cashGiven - PRICE_IOF_GOURMET;
    }
 
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() < PRICE_OF_ECONOMICAL) {
            return false;
        }
 
        card.pay(PRICE_OF_ECONOMICAL);
        this.economicalSold++;
        return true;
    }
 
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() < PRICE_IOF_GOURMET) {
            return false;
        }
 
        card.pay(PRICE_IOF_GOURMET);
        this.gourmetSold++;
        return true;
    }
 
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum < 0) {
            return;
        }
 
        card.loadMoney(sum);
        this.cashInRegister += sum;
    }
 
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
 */

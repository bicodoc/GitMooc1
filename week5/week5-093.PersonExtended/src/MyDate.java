
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int dd, int mm, int yy) {
        this.day = dd;
        this.month = mm;
        this.year = yy;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) { //compares this.date to compared date
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) { // compare this.date to earlier date(comparedDate)
        int yrDiff = 0;
        if (this.earlier(comparedDate)) {
            yrDiff = comparedDate.year - this.year;
            if (comparedDate.month < this.month) yrDiff--;
            if (this.month == comparedDate.month && comparedDate.day < this.day) yrDiff--;
            
        } else {
            yrDiff = this.year - comparedDate.year;
            if (this.month < comparedDate.month) yrDiff--;
            if (this.month == comparedDate.month && this.day < comparedDate.day) yrDiff--;
        
        }
        return yrDiff;
    }
    
    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    
    
}

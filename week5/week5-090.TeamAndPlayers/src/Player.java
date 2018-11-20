public class Player {
    private String pName;
    private int goals;
    
    public Player(String pName) {
        this(pName, 0);
    }
    
    public Player(String pName, int goals) {
        this.pName = pName;
        this.goals = goals;
    }
    
    public String getName() {
        return this.pName;
    }
    
    public int goals() {
        return this.goals;
    }
    
    public String toString() {
        return getName() + ", goals " + goals();
    }
}

/*    
public class Player {
    private String name;
    private int goals;
 
    public Player(String name) {
        this(name, 0);
    }
 
    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }
 
    public int goals() {
        return this.goals;
    }
 
    public String getName() {
        return this.name;
    }
 
    @Override
    public String toString() {
        return this.name + ", maaleja " + this.goals;
    }
}
*/
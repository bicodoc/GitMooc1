import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> roster;
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;
        this.roster = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player pName) {
        if (roster.size() < maxSize) this.roster.add(pName);
    }
    
    public void printPlayers() {
        for (Player element : roster) {
            System.out.println(element);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return roster.size();
    }
    
    public int goals() {
        int sum = 0;
        for (Player element : roster)
            sum += element.goals();
        return sum;
    }              
}
/*
import java.util.ArrayList;
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
 
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void addPlayer(Player player) {
        if (this.size() >= this.maxSize) {
            return;
        }
 
        this.players.add(player);
    }
 
    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }
 
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
 
    public int size() {
        return this.players.size();
    }
 
    public int goals() {
        int amount = 0;
        for (Player player : this.players) {
            amount += player.goals();
        }
 
        return amount;
    }
}
*/


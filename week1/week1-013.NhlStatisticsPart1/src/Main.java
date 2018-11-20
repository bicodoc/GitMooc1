import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

        public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by Goals");
        NHLStatistics.sortByGoals();     // orders the players by points
        NHLStatistics.top(10);
        System.out.println("");
        System.out.println("Top 25 by Penalties");
        NHLStatistics.sortByPenalties();  // orders the players by penalty minutes
        NHLStatistics.top(25);
        System.out.println("");
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");  // prints stats of Jaromir Jagr
        System.out.println("");
        System.out.println("Statistics for Philadelphia Flyers by Penalties");
        NHLStatistics.teamStatistics("PHI");  // Statistics of Philadelphia Flyers
        System.out.println("");
        System.out.println("Statistics for Anaheim Ducks by Points");
        NHLStatistics.sortByPoints();  // orders the players by penalty minutes
        NHLStatistics.teamStatistics("ANA");  // Statistics of Anaheim Ducks
    }
}

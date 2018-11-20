
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // Print the top ten players sorted by points.
                NHLStatistics.sortByPoints();     // orders the players by points
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("assists")) {
                //  Print the top ten players sorted by assists.
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("penalties")) {
                //  Print the top ten players sorted by penalties.
                System.out.println("Top 10 by Penalties");
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
                System.out.print("Enter the player's name: ");
                String name = reader.nextLine();
                System.out.println("Statistics for " + name);
                NHLStatistics.searchByPlayer(name);
                System.out.println("");
            } else if (command.equals("club")) {
                System.out.print("Enter the club's abbreviation: ");
                String name = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(name);
            }
        }
    }
}

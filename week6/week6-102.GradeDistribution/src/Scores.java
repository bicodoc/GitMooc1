/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author albertdavis
 */
import java.util.ArrayList;

public class Scores {

    private int score;

    public String toString() {
        return "Score is: " + score;
    }

    public static void makeGrades(ArrayList<Integer> list) {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        for (int score : list) {
            if (score < 0 || score > 60) {
                continue;
            }
            if (score < 30) {
                    grades.add(0);
                } else if (score < 35) {
                    grades.add(1);
                } else if (score < 40) {
                    grades.add(2);
                } else if (score < 45) {
                    grades.add(3);
                } else if (score < 50) {
                    grades.add(4);
                } else if (score < 61) {
                    grades.add(5);
                }
            }
        printGrades(grades, list.size());
        }
    
    public static void printGrades(ArrayList<Integer> grades, int size) {    
    System.out.println("Grade distribution:");
        int accepted = 0;
        int allScores = 0;
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int grade : grades) {
                if (grade == i) {
                    System.out.print("*");
                    if (i > 0) accepted++;
                }
            }
        System.out.println("");
        }

        if (grades.size() > 0){
            System.out.println("Acceptance percentage: " + (double)(100 * accepted / size));
        }
    }
}

/*
public class GradeDistribution {
    private int[] grades;
 
    public GradeDistribution() {
        grades = new int[6];
    }
 
    public void addAScore(int score) {
        if (score < 0 || score > 60) {
            return;
        }
 
        int theGrade = grade(score);
        grades[ theGrade]++;
    }
 
    public void tulosta() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grades[i]));
        }
 
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }
 
    //  since the following are only to internal use, those have been defined as private
    private String stars(int n) {
        String tahdet = "";
        for (int i = 0; i < n; i++) {
            tahdet += "*";
        }
        return tahdet;
    }
 
    private int grade(int score) {
 
        if (score < 30) {
            return 0;
        }
        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }
        if (score < 45) {
            return 3;
        }
        if (score < 50) {
            return 4;
        } 
        return 5;
    }
 
    private double acceptancePercentage() {
        double all = 0;
        for (int number : grades) {
            all += number;
        }
        double failed= grades[0];
 
        return 100 * (all - failed) / all;
    }
}
*/

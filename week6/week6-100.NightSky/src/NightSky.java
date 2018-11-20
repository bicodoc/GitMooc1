/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.Random;
/**
 *
 * @author albertdavis
 */
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        width = 20;
        height = 10;
    }

    public NightSky(int width, int height) {
        density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println("");
        }
    }

    public void printLine() {
//        Random rnd = new Random();
        for (int i = 0; i < this.width; i++) {
//            if(rnd.nextDouble() <= this.density) {
            if (Math.random() <= density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}

/*
import java.util.Random;
 
public class NightSky {
 
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
 
    public NightSky(double density) {
        this(density, 20, 10);
    }
 
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
 
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
 
    public void print() {
        this.starsInLastPrint = 0;
 
        for (int y = 0; y < this.height; y++) {
            printLine();
        }
    }
 
    public void printLine() {
        Random random = new Random();
 
        for (int x = 0; x < this.width; x++) {
            double randomValue = random.nextDouble();
 
            if (randomValue > this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrint = this.starsInLastPrint + 1;
            }
        }
 
        System.out.println("");
    }
 
    public int starsInLastPrint() {
        return starsInLastPrint;
    }
}
*/
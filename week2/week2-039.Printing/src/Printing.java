public class Printing {

    public static void printStars(int amount) {
        int count = 1;
        while (count <= amount) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }


    public static void printSquare(int sideSize) {
        int count2 = 1;
        while (true) {
            printStars(sideSize);
            if (count2 == sideSize) break;
            count2++;
        }
    }


    public static void printRectangle(int width, int height) {
        int count3 = 0;
        while (count3 < height) {
            printStars(width);
            count3++;
        }
        // 39.3
    }

    public static void printTriangle(int size) {
        int count4 = 1;
        while (count4 <= size) {
            printStars(count4);
            count4++;
        // 39.4
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
}

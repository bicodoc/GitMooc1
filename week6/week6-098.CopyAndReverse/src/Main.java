
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] revArray = new int[array.length];
        for (int i = (array.length - 1); i >= 0; i--) {
            revArray[array.length - 1 - i] = array[i];
        }
        return revArray;
    }
}

/*
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        
        // change the copy
        copied[0] = 99;
        
        // printing both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "copied: " +Arrays.toString(copied));               
        
        System.out.println("");
        
        int[] reversed = reverseCopy(original);
        
        // printing both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reversed));        
    }
    
    public static int[] copy(int[] array){
        int[] copy = new int[array.length];
        
        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];            
        }
        
        return copy;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversed = new int[array.length];
        
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length-1-i];            
        }
        
        return reversed;
    }    
}
*/

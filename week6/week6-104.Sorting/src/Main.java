
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int smallest = smallest(array);
        int smallInd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= smallest) {
                smallInd = i;
            }
        }
        return smallInd;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                index = i;
                smallest = array[index];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int first = array[index1];
        array[index1] = array[index2];
        array[index2] = first;
    }

    public static void sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                swap(array, i, indexOfTheSmallestStartingFrom(array, i));

                System.out.print(array[i]);
            }
            System.out.println("");
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
 
    public static int smallest(int[] table) {
        int smallest = table[0];
        for (int i = 1; i < table.length; i++) {
            if (table[i] < smallest) {
              smallest = table[i];
            }
        }
        return smallest;
    }
 
    public static int indexOfTheSmallest(int[] table) {
        int theIndexOfSmallest = 0;
 
        for (int i = 0; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
 
        return theIndexOfSmallest;
    }
 
    public static int indexOfTheSmallestStartingFrom(int[] table, int startIndex) {
        int theIndexOfSmallest = startIndex;
 
        for (int i = startIndex; i < table.length; i++) {
            if ( table[i]<table[theIndexOfSmallest]) {
                theIndexOfSmallest = i;
            }
        }
 
        return theIndexOfSmallest;
    }
 
    public static void swap(int[] table, int index1, int index2) {
        int index1OldValue = table[index1];
        table[index1] = table[index2];
        table[index2] = index1OldValue;
    }
 
    public static void sort(int[] table){
        for (int i = 0; i < table.length-1; i++) {
             int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(table, i);
             swap(table, i, theIndexOfTheSmallest);
        }
    }
}
*/
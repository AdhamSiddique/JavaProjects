import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static int smallest(Integer[] array) {

        int x = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < x) {
                x = array[i];
            }
        }
        return x;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Find the index of the smallest element from the current position 'i'
            int smallestIndex = indexOfSmallestFrom(array, i);

            // Swap the smallest element with the element at index 'i'
            swap(array, smallestIndex, i);

            // Print the array after each swap to observe progress
            System.out.println(Arrays.toString(array));

    }

}
        public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
        }
        public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int startIndexOne = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[startIndexOne]){
                startIndexOne = i;

            }
        }

        return startIndexOne;

    }



        public static int indexOfSmallest ( int[] array){
            int smallestIndex = 0;
            int smallestValue = array[0];

            // Loop through the array to find the smallest value and its index.
            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallestValue) {
                    smallestValue = array[i];   // Update the smallest value.
                    smallestIndex = i;          // Update the index of the smallest value.
                }
            }

            // Return the index of the smallest number.
            return smallestIndex;
        }
    }




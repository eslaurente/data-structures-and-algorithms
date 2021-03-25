package sort.insertionsort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://stackabuse.com/insertion-sort-in-java/
 */
public class InsertionSort {
    public static void sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int current = array[unsortedIndex];
            int i;
            for (i = unsortedIndex; i > 0 && array[i - 1] > current; i--) {
                array[i] = array[i - 1];
            }
            array[i] = current;
        }
    }

    /**
     * Challenge #2: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435814#overview
     * Refactor original insertion sort to use recursion
     */
    public static void sortRecursive(int[] array) {
        sortRecursive(array, array.length);
    }

    public static void sortRecursive(int[] array, int numItems) {
        if (numItems < 2) {
            return;
        }

        // Sort preceding items first
        sortRecursive(array, numItems - 1);

        int current = array[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && array[i -1] > current; i--) {
            array[i] = array[i - 1];
        }
        array[i] = current;

        System.out.println("Contents when numItems = " + numItems);
        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));;
        System.out.println();
        System.out.println("---------------------");
    }
}

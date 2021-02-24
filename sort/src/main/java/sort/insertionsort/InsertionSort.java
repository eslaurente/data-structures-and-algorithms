package sort.insertionsort;

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
}

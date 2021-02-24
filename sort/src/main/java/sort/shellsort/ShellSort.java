package sort.shellsort;

/**
 *  https://stackabuse.com/shell-sort-in-java/
 *
 *  Note: gap is the length of A / 2
 */
public class ShellSort {
    public static void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int current = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > current) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = current;
            }
        }
    }
}

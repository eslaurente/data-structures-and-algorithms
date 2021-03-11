package sort.countingsort;

/**
 * https://www.interviewcake.com/concept/java/counting-sort
 */
public class CountingSort {
    public static void sort(int[] array, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min] += 1;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min] -= 1;
            }
        }
    }
}

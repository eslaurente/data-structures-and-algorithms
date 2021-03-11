package sort.radixsort;

/**
 * https://www.codesdope.com/course/algorithms-count-and-sort/
 * https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435804
 *
 */
public class RadixSort {
    public static void sort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    public static void radixSingleSort(int[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        // Populate count arrays for the current value
        for (int value: array) {
            countArray[getDigit(position, value, radix)] += 1;
        }

        // To ensure stability - Modify count array to contain count of <= that of a given index value
        for (int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j -1];
        }

        // Write values in temporary array in sorted order
        int[] temp = new int[numItems];
        for (int tempIndex = temp.length - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        // Place items in array
        System.arraycopy(temp, 0, array, 0, numItems);
    }

    public static int getDigit(int position, int value, int radix) {
        return (value / (int) Math.pow(radix, position)) % radix;
    }
}

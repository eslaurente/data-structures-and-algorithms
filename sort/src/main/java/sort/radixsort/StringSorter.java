package sort.radixsort;

/**
 *  Challenge 3: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435818#overview
 *  Modify radix sort so that it sorts an array of strings
 */
public class StringSorter {
    public static void sort(String[] array, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(array, i, radix);
        }
    }

    public static void radixSingleSort(String[] array, int position, int radix) {
        int numItems = array.length;
        int[] countArray = new int[radix];

        // Populate count arrays for the current value
        for (String value: array) {
            countArray[getDigit(position, value)] += 1;
        }

        // To ensure stability - Modify count array to contain count of <= that of a given index value
        for (int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j -1];
        }

        // Write values in temporary array in sorted order
        String[] temp = new String[numItems];
        for (int tempIndex = temp.length - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex])]] = array[tempIndex];
        }

        // Place items in array
        System.arraycopy(temp, 0, array, 0, numItems);
    }

    public static int getDigit(int position, String value) {
        return value.charAt(position);
    }
}

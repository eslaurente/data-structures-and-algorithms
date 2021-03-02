package sort.mergesort;

/**
 * https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435788
 * https://stackabuse.com/merge-sort-in-java/
 */
public class MergeSort {

   public static void sort(int[] array) {
       if (array.length < 2) {
           return;
       }
       mergeSort(array, 0, array.length);
   }

    /**
     *  Example:
     *  array := { 20, 35, -15, 7, 55, 1, -22 }
     */
    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        // Partition by middle index
        int midIndex  = (startIndex + endIndex) / 2;

        // Sort left partition
        mergeSort(array, startIndex, midIndex);

        // Sort right partition
        mergeSort(array, midIndex, endIndex);

        merge(array, startIndex, midIndex, endIndex);
    }

    public static void merge(int[] array, int startIndex, int midIndex, int endIndex) {
        if (array[midIndex - 1] <= array[midIndex]) {
            // Optimization:
            // Since left and right sub-arrays are already sorted, if last element of left sub-array <= first element
            // of right sub-array, entire array is already sorted.
            return;
        }

        int i = startIndex;
        int j = midIndex;
        int t = 0;

        int[] temp = new int[endIndex - startIndex];

        while (i < midIndex && j < endIndex) {
            // If left element at i <= to right element at j, copy left element to temp[t], then increment i
            // If right element at j <= to left element at i, copy right element to temp[t], then increment j
            // Increment t
            temp[t++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        // If there are leftover elements in left array not yet traversed and move them to the END of the input array
        System.arraycopy(
                array, // source array
                i, // first index of left array we haven't handled yet
                array, // destination array
                startIndex + t, // start index in input array to move leftover elements (end of right array)
                midIndex - i // number of elements we didn't copy over
        );
        // Merge temp array into input array by copying elements
        System.arraycopy(
                temp, // temp array (sorted)
                0, // start of the temp array
                array, // destination array (input array)
                startIndex, // starting index in destination
                t // number of elements to copy only spans the temporary array length
        );
    }
}

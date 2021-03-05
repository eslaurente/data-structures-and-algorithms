package sort.quicksort;

public class Quicksort {

    public static void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            // Only one-element array
            return;
        }

        int pivotIndex = partition(array, startIndex, endIndex);
        // sort subarray left of the pivot
        quickSort(array, startIndex, pivotIndex);
        // sort subarray right of the pivot
        quickSort(array, pivotIndex + 1, endIndex);
    }

    public static int partition(int[] array, int startIndex, int endIndex) {
        // Pivot is always equal to the first element of the array, the element at the startIndex
        int pivot = array[startIndex];
        int i = startIndex;
        int j = endIndex;

        while (i < j) {
            // NOTE: empty loop to traverse array from right to left
            while (i < j && array[--j] >= pivot);
            if (i < j) {
                // array[j] < pivot
                array[i] = array[j];
            }

            // NOTE: empty loop to traverse array from left to right
            while (i < j && array[++i] < pivot);
            if (i < j) {
                // array[i] >= pivot
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j;
    }
}

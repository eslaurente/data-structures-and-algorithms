public class SelectionSort {

    public static void sort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }
        for (int lastUnsortedIndex = length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(array, largestIndex, lastUnsortedIndex);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

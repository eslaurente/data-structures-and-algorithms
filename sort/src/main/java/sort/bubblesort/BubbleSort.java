package sort.bubblesort;

abstract public class BubbleSort {
    public static void sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                int nextIndex = i + 1;
                if (array[i] > array[nextIndex]) {
                    swap(array, i, nextIndex);
                }
            }
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

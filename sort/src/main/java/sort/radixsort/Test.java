package sort.radixsort;

import com.udemy.testhelpers.AssertElementEquals;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = { 4725, 4586, 1330, 8792, 1594, 5729 };
        System.out.println("Before sort");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();

        RadixSort.sort(array, 10, 4);

        System.out.println("After sort");
        Arrays.stream(array).forEach(System.out::println);

        // Assertions
        AssertElementEquals.check(array, 0, 1330);
        AssertElementEquals.check(array, 1, 1594);
        AssertElementEquals.check(array, 2, 4586);
        AssertElementEquals.check(array, 3, 4725);
        AssertElementEquals.check(array, 4, 5729);
        AssertElementEquals.check(array, 5, 8792);
    }
}

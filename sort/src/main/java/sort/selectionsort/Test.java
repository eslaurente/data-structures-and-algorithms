package sort.selectionsort;

import com.udemy.testhelpers.AssertElementEquals;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        System.out.println("Before sort");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();

        SelectionSort.sort(array);
        System.out.println("After sort");
        Arrays.stream(array).forEach(System.out::println);

        // Assertions
        AssertElementEquals.check(array, 0, -22);
        AssertElementEquals.check(array, 1, -15);
        AssertElementEquals.check(array, 2, 1);
        AssertElementEquals.check(array, 3, 7);
        AssertElementEquals.check(array, 4, 20);
        AssertElementEquals.check(array, 5, 35);
        AssertElementEquals.check(array, 6, 55);
    }
}

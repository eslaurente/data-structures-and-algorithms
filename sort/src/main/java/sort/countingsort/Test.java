package sort.countingsort;

import com.udemy.testhelpers.AssertElementEquals;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        int[] array = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
        System.out.println("Before sort");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();

        CountingSort.sort(array, 1, 10);

        System.out.println("After sort");
        Arrays.stream(array).forEach(System.out::println);

        // Assertions
        AssertElementEquals.check(array, 0, 2);
        AssertElementEquals.check(array, 1, 2);
        AssertElementEquals.check(array, 2, 3);
        AssertElementEquals.check(array, 3, 4);
        AssertElementEquals.check(array, 4, 5);
        AssertElementEquals.check(array, 5, 7);
        AssertElementEquals.check(array, 6, 8);
        AssertElementEquals.check(array, 7, 8);
        AssertElementEquals.check(array, 8, 9);
        AssertElementEquals.check(array, 9, 10);

    }
}

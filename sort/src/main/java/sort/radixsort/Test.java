package sort.radixsort;

import com.udemy.testhelpers.AssertElementEquals;

import java.util.Arrays;
import java.util.stream.Collectors;

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

        System.out.println();
        System.out.println("*** Challenge #3: String Sorter Radix Sort  ***");
        String[] stringArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };
        System.out.println("Before sort");
        System.out.println(String.join(", ", stringArray));
        System.out.println();

        StringSorter.sort(stringArray, 122, 5); // 122 is the last letter in ASCII – 'z'
        System.out.println("After sort");
        System.out.println(String.join(", ", stringArray));
        AssertElementEquals.check(stringArray, 0, "abcde");
        AssertElementEquals.check(stringArray, 1, "bbbbb");
        AssertElementEquals.check(stringArray, 2, "bcdef");
        AssertElementEquals.check(stringArray, 3, "dbaqc");
        AssertElementEquals.check(stringArray, 4, "omadd");
    }
}

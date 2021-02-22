import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        System.out.println("Before sort");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();

        BubbleSorter.sort(array);

        System.out.println("After sort");
        Arrays.stream(array).forEach(System.out::println);
    }
}

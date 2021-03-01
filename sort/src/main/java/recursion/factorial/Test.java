package recursion.factorial;

/**
 *  Factorial Algorithm
 *  n! = n * (n-1) * (n-2) * (n-3) ... 3 * 2 * 1
 *
 *  1! = 1 * 0!        = 1
 *  2! = 2 * 1         = 2 * 1!
 *  3! = 3 * 2 * 1     = 3 * 2!
 *  4! = 4 * 3 * 2 * 1 = 4 * 3!
 *
 *  1. num := input number; if num is == 0, factorial := 1, return;
 *  2. multiplier := 1
 *  3. factorial := 1
 *  4. while multiplier != num, do step 5 and step 6
 *  5. factorial := factorial * multiplier
 *  6. multiplier := multiplier + 1
 *  7. return factorial
 *
 *
 */
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("Iterative Factorial");
        System.out.println("3! = " + iterativeFactorial(3));

        System.out.println();

        System.out.println("Recursive Factorial");
        System.out.println("3! = " + recursiveFactorial(3));
    }

    public static int iterativeFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
}

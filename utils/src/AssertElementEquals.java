import com.sun.tools.javac.util.Assert;

abstract public class AssertElementEquals {
    public static void check(int[] array, int index, int value) {
        Assert.check(array[index] == value, String.format("Expected element at index %s to equal %s. Actual: %s", index, value, array[index]));
    }
}

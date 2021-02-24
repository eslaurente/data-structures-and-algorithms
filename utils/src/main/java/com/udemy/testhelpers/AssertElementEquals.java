package com.udemy.testhelpers;

abstract public class AssertElementEquals {
    public static void check(int[] array, int index, int value) {
        if (array[index] != value) {
            System.err.printf("Expected element at index %s to equal %s. Actual: %s%n", index, value, array[index]);
        }
    }
}

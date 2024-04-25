package org.practice;

import java.util.Arrays;

public class Array {
    public static void printArray(int[] array) {
        System.out.println("Elements: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        printArray(num);
    }

}

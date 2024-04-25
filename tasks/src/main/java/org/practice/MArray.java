package org.practice;

import java.util.Arrays;

public class MArray {
        public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
            int[] mArrays = new int[arrayA.length + arrayB.length];
            System.arraycopy(arrayA, 0, mArrays, 0, arrayA.length);
            System.arraycopy(arrayB, 0, mArrays, arrayA.length, arrayB.length);
            return mArrays;
        }
        public static void main(String[] args) {
            int[] arrayA = {1, 3, 5, 7, 9};
            int[] arrayB = {2, 4, 6, 8};
            int[] mergedResult = mergeArrays(arrayA, arrayB);
            System.out.println(Arrays.toString(mergedResult));
        }
    }

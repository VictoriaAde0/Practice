package org.practice;

public class RArray {
    public static int[] RotateArray(int[] number, int cycle) {
        int length = number.length;
        int cycleRotation = cycle % length;
        int[] RotateArray = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < cycleRotation) {
                RotateArray[i] = number[length - cycleRotation + i];
            } else {
                RotateArray[i] = number[i - cycleRotation];
            }
        }
        return RotateArray;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int cycle = 2;
        int[] RotatedArray = RotateArray(number, cycle);

        System.out.println("Initial Array: " + java.util.Arrays.toString(number));
        System.out.println("Rotated Array: " + java.util.Arrays.toString(RotatedArray));

    }
}

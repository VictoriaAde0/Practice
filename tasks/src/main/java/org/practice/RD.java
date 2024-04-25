package org.practice;

import java.util.ArrayList;

public class RD {
    public static class RDuplicate {
        public static ArrayList<Integer> findValues(int[] numbers) {
            ArrayList<Integer> Values = new ArrayList<>();
            for (int value : numbers) {
                if (!Values.contains(value)) {
                    Values.add(value);
                }
            }
            return Values;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50, 60, 15, 30, 10, 65, 60, 72};
            ArrayList<Integer> Values = findValues(numbers);
            System.out.println("First Array:" + java.util.Arrays.toString(numbers));
            System.out.println("New Array:" + Values);
        }
    }
}

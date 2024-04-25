package org.practice;

public class SLargestN {
        public static int SLargest(int[] array) {
            if (array.length < 2) {
                System.out.println("Array should contain at least two elements.");
                return -1;

            }

            int largestN = array[0];
            int sLargest = array[0];

            for (int number : array) {
                if (number > largestN) {
                    sLargest = largestN;
                    largestN = number;
                } else if (number > sLargest && number != largestN) {
                    sLargest = number;
                }
            }

            return sLargest;
        }

        public static void main(String[] args) {
            int[] array = {49, 32, 19, 56, 90, 28, 67};

            int sLargest = SLargest(array);

            if (sLargest != -1) {
                System.out.println("The second largest number in the array is: " + sLargest);
            }
        }
}
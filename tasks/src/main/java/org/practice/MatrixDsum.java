package org.practice;

public class MatrixDsum {
    public static int[] Dsum(int[][] matrix) {
        int num = matrix.length;
        if (num == 0 || matrix[0].length != num) {
            System.out.println("Square matrix is invalid");
            return new int[]{0, 0};
        }
        int firstDsum = 0;
        int secondDsum = 0;
        for (int i = 0; i < num; i++) {
            firstDsum += matrix[i][i];
        }
        for (int i = 0; i < num; i++) {
            secondDsum += matrix[i][num - 1 - i];
        }
        return new int[]{firstDsum, secondDsum};

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {6, 1, 2},
                {3, 4, 5},
                {9, 7, 8},
        };
        int[] MatrixDsums = Dsum(matrix);
        System.out.println(" Sum of First Diagonal = " + MatrixDsums[0]);
        System.out.println(" Sum of Second Diagonal = " + MatrixDsums[1]);
    }
}

package org.practice;

public class Factorial {
    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
    public static void main(String[] args) {
        int number = 15;
        System.out.println("The Factorial of " + number + " is; " +  fact(number));
    }
}

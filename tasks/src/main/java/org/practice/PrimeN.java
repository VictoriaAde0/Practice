package org.practice;



import static org.practice.PrimeN.Prime.isPrime;


public class PrimeN {
    public class Prime {
        public static boolean isPrime(int number) {
            if (number <= 20) {
                return false;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int number = 83;
        if (isPrime(number)) {
            System.out.println(number + "is a prime number");
        } else {
            System.out.println(number + "is not a prime number");
        }
    }

}




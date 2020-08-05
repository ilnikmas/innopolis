package ru.maslenchenko.ilya.lesson27;

public class FibonacciNumbers {
    public static void main(String[] args) {
        fibonacciWithIteration(10);
        System.out.println();
        fibonacchiWithRecursion(10);
    }

    public static void fibonacciWithIteration(int n) {
        int preprevious = 0;
        int previous = 1;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) System.out.printf("%d ", 0);
            else if (i == 1 | i == 2) {
                System.out.printf("%d ", 1);
            } else {
                preprevious = previous;
                previous = sum;
                sum = preprevious + previous;
                System.out.printf("%d ", sum);
            }
        }
    }

    public static void fibonacchiWithRecursion(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", fibonacciNumber(i));
        }
    }

    public static int fibonacciNumber(int n) {
        if (n == 1) return 0;
        else if (n == 2 || n == 3)
            return 1;
        else {
            return fibonacciNumber(n-1) + fibonacciNumber(n - 2);
        }
    }
}

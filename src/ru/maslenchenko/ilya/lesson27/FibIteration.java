package ru.maslenchenko.ilya.lesson27;

public class FibIteration {
    public static void main(String[] args) {
        int previous1 = 0;
        int previous2 = 1;
        int sum = 1;
        for (int i = 0; i < 10; i++) {
            if (i == 0) System.out.printf("%d ", 0);
            else if (i == 1 | i == 2) {
                System.out.printf("%d ", 1);
            } else {
                previous1 = previous2;
                previous2 = sum;
                sum = previous1 + previous2;
                System.out.printf("%d ", sum);
            }
        }
    }
}

package ru.maslenchenko.ilya.lesson21;

public class Task2 {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        printArray(array);
        arrayReverse(array);
        printArray(array);

    }
    static void arrayReverse(int[] ar) {
        int size = ar.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[size - 1 - i];
            ar[size - 1 - i] = temp;
        }
    }

    static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%d  ", ar[i]);

        }
        System.out.println();
    }
}

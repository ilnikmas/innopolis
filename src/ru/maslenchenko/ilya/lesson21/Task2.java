package ru.maslenchenko.ilya.lesson21;

public class Task2 {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        printArray(array);
        arrayReverse(array);
        printArray(array);

    }

    public static void arrayReverse(int[] ar) {
        int[] temp = new int[ar.length];
        int tmp = ar.length - 1;
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[tmp];
            tmp--;
        }
        for (int i = 0; i < ar.length ;i++) {
            ar[i] = temp[i];
        }
    }

    public static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
                System.out.printf("%d  ", ar[i]);

            }
        System.out.println();
        }
}

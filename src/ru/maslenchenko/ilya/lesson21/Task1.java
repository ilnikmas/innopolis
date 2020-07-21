package ru.maslenchenko.ilya.lesson21;

public class Task1 {
    static int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
    public static void main(String[] args) {
        printArray(array);
        toLeft(array);
        printArray(array);
    }

    public static void toLeft(int[][] ar) {
        int[][] temp = new int[ar.length][];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = new int[ar[i].length];
            temp[i][ar.length - 1] = 0;
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (j == ar[i].length - 1) {
                    ar[i][j] = temp[i][j];
                    continue;
                }
                temp[i][j] = ar[i][j + 1];
                ar[i][j] = temp[i][j];
            }
        }
    }

    public static void printArray(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.printf("%d ", ar[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

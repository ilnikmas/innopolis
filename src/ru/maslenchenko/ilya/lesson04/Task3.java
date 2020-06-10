package ru.maslenchenko.ilya.lesson04;

/**
 * Lesson 4 Task 3
 * Программа выводит на экран таблицу умножения
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("В качестве аргумента должно указываться целое число");
            e.printStackTrace();
        }

    }
}

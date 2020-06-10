package ru.maslenchenko.ilya.lesson04;

/**
 * Lesson 4 Task 1
 * Программа поиска минимального из двух чисел
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);
            if (first < second) {
                System.out.println("Минимальное число: " + first);
            } else {
                System.out.println("Минимальное число: " + second);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
            e.printStackTrace();
        }
    }

}

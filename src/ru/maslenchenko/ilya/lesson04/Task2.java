package ru.maslenchenko.ilya.lesson04;

import java.util.Scanner;

/**
 * Lesson 4 Task 2
 * Программа описывает введённое с клавиатуры число
 */
public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String negpos = "",
                   oddeven = "",
                   zero = "";
            System.out.println("Введите целое число:");
            int number = scanner.nextInt();
            if (number != 0) {
                negpos = number < 0 ? "отрицательное" : "положительное";
                oddeven = number %2 == 0 ? "чётное" : "нечётное";
            }
            System.out.printf("Введённое число %s %s %s", zero, negpos, oddeven);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
            e.printStackTrace();
        }
    }
}

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
            int number = Integer.parseInt(scanner.next());
            if (number != 0) {
                if (number < 0) {negpos = "отрицательное,";
                } else {negpos = "положительное,";}
                if (number % 2 == 0) {oddeven = "чётное.";}
                else {oddeven = "нечётное.";}
            } else {zero = "нулевое.";}
            System.out.printf("Введённое число %s %s %s", zero, negpos, oddeven);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
            e.printStackTrace();
        }
    }
}

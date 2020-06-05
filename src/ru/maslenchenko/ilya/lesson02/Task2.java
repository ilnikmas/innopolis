package ru.maslenchenko.ilya.lesson02;

import java.util.Scanner;

/**
 * Lesson 2 Task 2
 * Программа по расчёту "чистой" заработной платы"
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your GROSS here: ");
        double gross = scanner.nextDouble();
        System.out.format("Your NET is: %.2f", gross * 0.87);
    }
}

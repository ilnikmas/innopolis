package ru.maslenchenko.ilya.lesson02;

import java.util.Scanner;

/**
 * Lesson 2 Task 3
 * Программа конвертирует время из секунд в часы
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type seconds here: ");
        long timeInSeconds = scanner.nextLong();
        System.out.format(timeInSeconds + " seconds = " + " %.2f", Double.valueOf(timeInSeconds) / 3600.00);
        System.out.println(" hours");
    }
}

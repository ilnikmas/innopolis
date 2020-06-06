package ru.maslenchenko.ilya.lesson02;

import java.util.Scanner;

/**
 * Lesson 2 Task 3
 * Программа конвертирует время из секунд в часы
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Type seconds here: ");
            double timeInSeconds = Double.parseDouble(scanner.next());
            System.out.format("%.2f seconds = %.2f hours", timeInSeconds, timeInSeconds / 3600.00);
        } catch (NumberFormatException e) {
            System.out.println("Input is incorrect");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}

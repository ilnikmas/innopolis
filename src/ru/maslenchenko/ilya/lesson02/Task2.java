package ru.maslenchenko.ilya.lesson02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Lesson 2 Task 2
 * Программа по расчёту "чистой" заработной платы"
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type your GROSS here: ");
            double gross = Double.parseDouble(scanner.next());
            System.out.format("Your NET is: %.2f", gross * 0.87);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Input is incorrect");
            e.printStackTrace();
        }

    }
}

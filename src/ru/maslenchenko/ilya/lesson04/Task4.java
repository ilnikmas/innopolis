package ru.maslenchenko.ilya.lesson04;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Scanner;

/**
 * Lesson 4 Task 4
 * Программа выводит геометрическую или арифметическую
 * прогрессию для N чисел
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите '1' для расчёта арифметической прогрессии, или '2' - для геометрической");
        try (Scanner scanner = new Scanner(System.in)) {
            int progressionType = Integer.parseInt(scanner.next());
            System.out.println("Введите количество членов последовательности N: ");
            int n = Integer.parseInt(scanner.next());
            switch (progressionType) {
                case 1: {
                    System.out.println("Введите шаг прогрессии: ");
                    int step = Integer.parseInt(scanner.next());

                }
                case 2: {
                    System.out.println("Введите знаменатель прогрессии: ");
                    int ratio = Integer.parseInt(scanner.next());
                }
            }


        }
    }
}

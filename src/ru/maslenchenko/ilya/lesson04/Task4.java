package ru.maslenchenko.ilya.lesson04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
            double sum = 0;
            NumberFormat nf = new DecimalFormat("#.##");
            int progressionType = scanner.nextInt();
            System.out.println("Введите первый член последовательности: ");
            double firstMember = scanner.nextDouble();
            System.out.println("Введите количество членов последовательности N: ");
            int n = scanner.nextInt();
            switch (progressionType) {
                case 1: {
                    System.out.println("Введите шаг прогрессии: ");
                    double step = scanner.nextDouble();
                    System.out.println("Последовательность чисел: ");
                    for (int i = 1; i <= n; i++) {
                        sum += firstMember;
                        System.out.print(nf.format(firstMember) + " ");
                        firstMember += step;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите знаменатель прогрессии: ");
                    double ratio = scanner.nextDouble();
                    System.out.println("Последовательность чисел: ");
                    for (int i = 1; i <= n; i++) {
                        sum += firstMember;
                        System.out.print(nf.format(firstMember) + " ");
                        firstMember *= ratio;
                    }
                    break;
                }
            }
            System.out.println();
            System.out.println("Сумма прогрессии: " + nf.format(sum));
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода");
            e.printStackTrace();
        }
    }
}

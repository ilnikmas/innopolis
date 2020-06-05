package ru.maslenchenko.ilya.lesson02;

import java.util.Scanner;

/**
 * Lesson 2 Task 1
 * Программа по расчёту стоимости бензина
 */
public class Task1 {
    public static void main(String[] args) {
        final int oneLitreCost = 43;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Type amount of gazoline here: ");
            double amount = Double.parseDouble(scanner.next());
            System.out.format("%.2f litres of gasoline cost: %.2f",amount, amount * oneLitreCost);
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Input is incorrect");
            e.printStackTrace();
        }
    }
}

//Вариант для передачи количества бензина в качестве аргумента
/*
public class Task1 {
    public static void main(String[] args) {
        final int oneLitreCost = 43;
        if (args.length == 0) {
            System.out.println("Usage: java Task1 [argument], where [argument] - amount of gasoline in litres");
        }
        System.out.println(args[0] + " litres of gasoline cost: " + Integer.valueOf(args[0]) * oneLitreCost);
    }
}

*/
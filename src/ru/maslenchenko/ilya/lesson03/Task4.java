package ru.maslenchenko.ilya.lesson03;

import java.util.Scanner;

/**
 * Lesson 3 Task 4
 * Игра «горячо-холодно»
 */

public class Task4 {
    public static void main(String[] args) {
        int guessedNumber = (int) (Math.random() * 100 + 1); //Диапазон загадываемых чисел от 1 до 100 включительно
        Scanner scanner = new Scanner(System.in);
        int initialDifference = guessedNumber;
        System.out.println("I'm thinking of a number from 1 to 100. You have 10 attempts to guess it.");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.format("Attempt %d. Input number:%n", i + 1);
                int tryNumber = Integer.parseInt(scanner.next());
                int currentDifference = Math.abs(guessedNumber - tryNumber);
                if (tryNumber == guessedNumber) {
                    System.out.print("You win!!!");
                    return;
                } else if (currentDifference >= initialDifference) {
                    System.out.println("Cold...");
                } else {
                    System.out.println("Hot!");
                }
                initialDifference = currentDifference;
            } catch (NumberFormatException e) {
                System.out.println("You have entered not integer! Try again.");
                i--;
            }
        }
        System.out.format("You lose. It was number %d", guessedNumber);
        scanner.close();
    }
}
package ru.maslenchenko.ilya.lesson03;

import java.util.Scanner;
import java.util.Random;

/**
 * Lesson 3 Task 4
 * Игра «горячо-холодно»
 */

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(100) + 1 ; //Диапазон загадываемых чисел от 1 до 100 включительно
        Scanner scanner = new Scanner(System.in);
        int initialDifference = guessedNumber;
        System.out.println("I'm thinking of a number from 1 to 100." +
                " You have 10 attempts to guess it.\nFor exit enter number out of range 1 - 100");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.format("Attempt %d. Input number:%n", i + 1);
                int tryNumber = Integer.parseInt(scanner.next());
                int currentDifference = Math.abs(guessedNumber - tryNumber);
                if (tryNumber >= 1 && tryNumber <= 100) {
                    if (tryNumber == guessedNumber) {
                        System.out.print("You win!!!");
                        return;
                    } else if (currentDifference >= initialDifference) {
                        System.out.println("Cold...");
                    } else {
                        System.out.println("Hot!");
                    }
                    initialDifference = currentDifference;
                } else {
                    System.out.println("Your answer is out of range 1-100. Exit of program.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered not integer! Try again.");
                i--;
            }
        }
        System.out.format("You lose. It was number %d", guessedNumber);
        scanner.close();
    }
}
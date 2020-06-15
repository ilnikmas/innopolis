package ru.maslenchenko.ilya.advanced;

import java.util.Locale;
import java.util.Scanner;

public class Test1 {
    static int inputIntWithCheck(int min, int max) {
        boolean flag = true;
        int number = 0;
        System.out.printf("Введите целое число от %d до %d: ", min, max);
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input <= min || input >= max) {
                    System.out.println("Введёное число находится вне заданного диапазона. Ещё раз: ");
                    flag = true;
                } else {
                    number = input;
                    flag = false;
                }
            } else {
                System.out.println("Вводить нужно целое число. Ещё раз: ");
                flag = true;
            }
        } while (flag);
        return number;
    }

    static double inputDoubleWithCheck(double min, double max) {
        boolean flag = true;
        double number = 0;
        System.out.printf("Введите вещественное число от %.2f до %.2f: ", min, max);
        do {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            String inputStr = scanner.nextLine();
            try {
                double input = Double.parseDouble(inputStr.replace(',','.'));
                if (input <= min || input >= max) {
                    System.out.println("Введёное число находится вне заданного диапазона. Ещё раз: ");
                    flag = true;
                } else {
                    number = input;
                    flag = false;
                }
            } catch (NumberFormatException e){
                System.out.println("Вводить нужно число. Ещё раз: ");
                flag = true;
            }
        } while (flag);
        return number;
    }

    static double inputDoubleWithCheck() {
        boolean flag = true;
        double output = 0;
        System.out.println("Введите вещественное число: ");
        do {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            String inputStr = scanner.nextLine();
            try {
                double input = Double.parseDouble(inputStr.replace(',','.'));
                    output = input;
                    flag = false;
            } catch (NumberFormatException e){
                System.out.println("Вводить нужно число. Ещё раз: ");
                flag = true;
            }
        } while (flag);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(inputDoubleWithCheck());
        System.out.println(inputIntWithCheck(1, 5));
        System.out.println(inputDoubleWithCheck(1, 6));

    }
}

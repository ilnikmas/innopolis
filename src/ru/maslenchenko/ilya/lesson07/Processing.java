package ru.maslenchenko.ilya.lesson07;

import java.util.Locale;
import java.util.Scanner;

public class Processing {

    public static void printInterface() {
        System.out.println("Для просмотра меню нажмите 1\nЧтобы внести деньги, нажмите 2\nДля выбора напитка нажмите 3");
        System.out.println("Для завершения работы нажмите 0");
    }

    public static void printMenu() {
        for (Menu.Assortiment a : Menu.Assortiment.values()) {
            System.out.printf("%d: %s, цена %.2f\n", a.getButton(), a.getDrink(), a.getPrice());
        }
    }

    public static int drinkChoice() {
        System.out.println("Для выбора напитка нажмите цифру, соответствующую номеру напитка в меню:");
        return inputIntWithCheck(0, 9);

    }
    public static double drinkOut(int drink, double deposit) {
        double price = 0;
        if (deposit > 0) {
            for (Menu.Assortiment a : Menu.Assortiment.values()) {
                if (a.getButton() == drink) {
                    if (a.getPrice() <= deposit) {
                        System.out.printf("Получите свой напиток: %s\n\n\n", a.getDrink());
                        price = a.getPrice();
                    } else System.out.println("Недостаточно денег на счёте. Пополните счёт.");
                }
            }
        } else System.out.println("На вашем счёте отсутствуют средства. Пополните счёт.");
        return price;
    }

    static int inputIntWithCheck(int min, int max) {
        boolean flag = true;
        Scanner scanner = null;
        int number = 0;
        //System.out.printf("Введите цифру от %d до %d:\n", min, max);
        do {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input < min || input > max) {
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

    static double inputDoubleWithCheck() {
        boolean flag = true;
        Scanner scanner = null;
        double number = 0;
        System.out.println("Введите сумму: ");

        do {
            scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            String inputStr = scanner.nextLine();
            try {
                double input = Double.parseDouble(inputStr.replace(',','.'));
                number = input;
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("Вводить нужно число. Ещё раз: ");
                flag = true;
            }
        } while (flag);
        return number;
    }
}

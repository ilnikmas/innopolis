package ru.maslenchenko.ilya.lesson14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Scanner;

public class Processing {
    private static final Logger logger = LogManager.getLogger(Processing.class);

    public static void printInterface() {
        System.out.println("Для просмотра меню нажмите 1");
        System.out.println("Чтобы внести деньги, нажмите 2");
        System.out.println("Для выбора напитка нажмите 3");
        System.out.println("Для проверки остатка денежных средств нажмите 4");
        System.out.println("Для завершения работы нажмите 0");
        logger.info("Начало работы программы");
    }

    public static void printMenu() {
        for (Assortment a : Assortment.values()) {
            System.out.printf("%d: %s, цена %.2f%n", a.getButton(), a.getDrink(), a.getPrice());
        }
    }

    public static int drinkChoice() {
        System.out.println("Для выбора напитка нажмите цифру, соответствующую номеру напитка в меню:");
        return inputIntWithCheck(0, 9);

    }
    public static double drinkOut(int drink, double deposit) {
        double price = 0;
        if (deposit > 0) {
            for (Assortment a : Assortment.values()) {
                if (a.getButton() == drink) {
                    if (a.getPrice() <= deposit) {
                        System.out.printf("Получите свой напиток: %s%n%n%n", a.getDrink());
                        price = a.getPrice();
                        logger.trace("Успешное завершение операции. Выдан напиток {}.", a.getDrink());
                    } else {
                        System.out.println("Недостаточно денег на счёте. Пополните счёт.");
                        logger.warn("Недостаточно денег на счёте. На счёте {}!", deposit);
                    }
                }
            }
        } else {
            System.out.println("На вашем счёте отсутствуют средства. Пополните счёт.");
            logger.warn("На счёте отсутствуют средства!");
        }
        return price;
    }

    static int inputIntWithCheck(int min, int max) {
        boolean flag = true;
        Scanner scanner = null;
        int number = 0;
        do {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input < min || input > max) {
                    System.out.println("Введёное число находится вне заданного диапазона. Ещё раз: ");
                    logger.warn("Введёное число находится вне заданного диапазона. Диапазон от {} до {}, введено {}!", min, max, input);
                    flag = true;
                } else {
                    number = input;
                    flag = false;
                }
            } else {
                System.out.println("Вводить нужно целое число. Ещё раз: ");
                logger.warn("Введено не целое число!");
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
                logger.error("Ошибка ввода. Вместо числа получено {}.", inputStr);
                flag = true;
            }
        } while (flag);
        return number;
    }

    static void exit() {
        logger.info("Завершение работы пользователем.");
    }
}

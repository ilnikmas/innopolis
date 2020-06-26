package ru.maslenchenko.ilya.lesson08.Task1;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат операции: "+result);
    }

    static double getDouble() {
        boolean flag = true;
        Scanner scanner = null;
        double number = 0;
        System.out.println("Введите число: ");

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

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 * num2 / 100;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
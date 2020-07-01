package ru.maslenchenko.ilya.lesson12;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Для вызова исключения ArrayIndexOutOfBoundsException жмакни 1");
        System.out.println("Для вызова исключения NullPointerException жмакни 2");
        System.out.println("Для вызова пользовательского исключения жмакни 3");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1: {
                    //ArrayIndexOutOfBoundsException
                    int arr [] = {1};
                    arr[2] = 3;
                    break;
                }
                case 2: {
                    //NullPointerException
                    Object obj = null;
                    obj.hashCode();
                    break;
                }
                case 3: {
                    try {
                        ExceptionDemo.someMethod(11);
                    } catch (MyException e) {
                        System.out.println("Перехвачено пользовательское исключение: " + e);

                    }
                    break;
                }
                default: {
                    System.out.println("Ты тупой? Тебе русским по чёрному написано: вводи цифры 1 или 2!");
                    return;
                }
            }
        }
    }
}

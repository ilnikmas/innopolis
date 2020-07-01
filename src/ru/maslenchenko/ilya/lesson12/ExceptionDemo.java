package ru.maslenchenko.ilya.lesson12;

public class ExceptionDemo {
    static void someMethod(int a) throws MyException {
        System.out.println("Вызван метод someMethod(" + a + ")");
        if (a > 10) throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
}

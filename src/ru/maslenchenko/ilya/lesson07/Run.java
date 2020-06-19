package ru.maslenchenko.ilya.lesson07;
import static ru.maslenchenko.ilya.lesson07.Processing.*;

public class Run {
    public static void main(String[] args) {
        int choice = 0;
        double deposit = 0;
        do {
            printInterface();
            choice = inputIntWithCheck(0, 3);
            switch (choice) {
                case 0: {
                    //Выход из программы
                    return;
                }
                case 1: {
                    //Отображение меню напитков
                    printMenu();
                    break;
                }
                case 2: {
                    //Пополнение счёта
                    deposit += inputDoubleWithCheck();
                    break;
                }
                case 3: {
                    //Выбор и выдача напитка, а также уменьшение суммы на счёте
                    deposit -= drinkOut(Processing.drinkChoice(), deposit);
                    break;
                }
            }

        } while (choice != 0);
    }
}


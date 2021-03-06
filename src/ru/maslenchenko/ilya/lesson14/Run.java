package ru.maslenchenko.ilya.lesson14;
import static ru.maslenchenko.ilya.lesson14.Processing.*;

public class Run {
    public static void main(String[] args) {
        int choice = 0;
        double deposit = 0;
        do {
            printInterface();
            choice = inputIntWithCheck(0, 4);
            switch (choice) {
                case 0: {
                    //Выход из программы
                    exit();
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
                    deposit -= drinkOut(drinkChoice(), deposit);
                    break;
                }
                case 4: {
                    //Проверка баланса на счёте
                    System.out.println("Остаток на счёте: " + deposit);
                }
            }

        } while (true);
    }
}


package ru.maslenchenko.ilya.lesson07;

public class Run {
    public static void main(String[] args) {
        int choice = 0;
        Account account = new Account();
        do {
            Processing.printInterface();
            choice = Processing.inputIntWithCheck(0, 3);
            switch (choice) {
                case 0: {
                    //Выход из программы
                    return;
                }
                case 1: {
                    //Отображение меню напитков
                    Processing.printMenu();
                    break;
                }
                case 2: {
                    //Пополнение счёта
                    account.setDeposit(Processing.inputDoubleWithCheck());
                    break;
                }
                case 3: {
                    //Выбор и выдача напитка, а также уменьшение суммы на счёте
                    account.changeDeposit(Processing.drinkOut(Processing.drinkChoice(), account.getDeposit()));
                    break;
                }
            }

        } while (choice != 0);
    }
}

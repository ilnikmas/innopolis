package ru.maslenchenko.ilya.lesson09.Task3;

public class Swimmer extends Human {
    @Override
    void getArea() {
        System.out.println("Пловец выступает в басейне");
    }

    @Override
    public void run() {

    }

    @Override
    public void dive() {
        System.out.println("Ныряет в воду по сигналу");
    }

    @Override
    public void swim() {
        System.out.println("Плывёт дистанцию");
    }
}

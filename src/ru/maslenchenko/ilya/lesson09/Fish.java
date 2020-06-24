package ru.maslenchenko.ilya.lesson09;

public class Fish extends Animal implements Swim {
    @Override
    void getName() {
        System.out.println("Рыба");
    }

    @Override
    public void swim() {
        System.out.println("Рыба плывёт");
    }
}

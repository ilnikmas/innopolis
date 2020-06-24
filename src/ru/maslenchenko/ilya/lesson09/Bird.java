package ru.maslenchenko.ilya.lesson09;

public class Bird extends Animal implements Fly {
    @Override
    void getName() {
        System.out.println("Птица");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}

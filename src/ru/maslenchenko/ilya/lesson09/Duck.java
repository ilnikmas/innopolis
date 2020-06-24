package ru.maslenchenko.ilya.lesson09;

public class Duck extends Animal implements Fly, Run, Swim {
    @Override
    void getName() {
        System.out.println("Утка");
    }

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плывёт");
    }
}

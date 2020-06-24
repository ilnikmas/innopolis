package ru.maslenchenko.ilya.lesson09;

public class Dog extends Animal implements Swim, Run {
    @Override
    void getName() {
        System.out.println("Собака");;
    }

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public void swim() {
        System.out.println("Собака плывёт");
    }
}

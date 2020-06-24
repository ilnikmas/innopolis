package ru.maslenchenko.ilya.lesson09;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.run();
        dog.swim();
        Fish fish = new Fish();
        fish.getName();
        fish.swim();
        Bird bird = new Bird();
        bird.getName();
        bird.fly();
    }
}

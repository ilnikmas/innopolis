package ru.maslenchenko.ilya.lesson09.Task3;

public class Main {
    public static void main(String[] args) {
        Sprinter sprinter = new Sprinter();
        sprinter.getArea();
        sprinter.run();
        sprinter.dive();
        Swimmer swimmer = new Swimmer();
        swimmer.getArea();
        swimmer.dive();
        swimmer.swim();
        swimmer.run();
    }
}

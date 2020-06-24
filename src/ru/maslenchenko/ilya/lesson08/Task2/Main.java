package ru.maslenchenko.ilya.lesson08.Task2;

class Counted {
    private static int counter;

    public Counted() {
        counter++;
    }

    public int getNumOfInstances() {
        return counter;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new Counted().getNumOfInstances());
        System.out.println(new Counted().getNumOfInstances());
        System.out.println(new Counted().getNumOfInstances());
        System.out.println(new Counted().getNumOfInstances());
    }
}

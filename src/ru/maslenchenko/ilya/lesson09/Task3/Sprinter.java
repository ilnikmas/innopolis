package ru.maslenchenko.ilya.lesson09.Task3;

public class Sprinter extends Human {
    @Override
    void getArea() {
        System.out.println("Спринтер выступает на беговой дорожке");
    }

    @Override
    public void run() {
        System.out.println("Спринтер бежит дистанцию");
    }

    @Override
    public void dive() {

    }

    @Override
    public void swim() {

    }
}

package ru.maslenchenko.ilya.lesson13;

public class ChildException extends Throwable {
    private String food;

    ChildException(String food) {
        this.food = food;
    }
    @Override
    public String toString() {
        return food + " не нравится, есть не буду!!!";
    }
}

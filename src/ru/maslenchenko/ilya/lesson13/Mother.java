package ru.maslenchenko.ilya.lesson13;

import java.util.Random;

class Mother {
    public Food feed() {
        String food = null;
        Random random = new Random();
        int number = random.nextInt(6);
        for (Food f : Food.values()) {
            if (number == f.ordinal()) {
                food = f.getName();
            }
        }
        return Food.valueOf(food);
    }
    public static void main(String[] args) {
        Mother mother = new Mother();
        Child.toEat(mother.feed());
    }
}

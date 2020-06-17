package ru.maslenchenko.ilya.lesson06.stadium;

public class Fan extends Human {
    private static final String hobby = "болельщик";
    private boolean drunk = false;
    public boolean isDrunk() {
        return drunk;
    }

    public void setDrunk(boolean drunk) {
        this.drunk = drunk;
    }

    @Override
    public void yelling() {
        System.out.println("Спартак - чемпион!!!");
    }
    public Fan(String name, int age) {
        super(name, age, hobby);
    }
}

package ru.maslenchenko.ilya.lesson09.Task3;

public abstract class Human implements Run, Swim {
    private String sportsman;

    public String getSportsman() {
        return sportsman;
    }

    public void setSportsman(String sportsman) {
        this.sportsman = sportsman;
    }

    abstract void getArea();

}

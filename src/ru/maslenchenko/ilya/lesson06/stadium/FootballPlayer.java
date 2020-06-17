package ru.maslenchenko.ilya.lesson06.stadium;

public class FootballPlayer extends Human {
    private final static String hobby = "футболист";
    private boolean goalScore = false;
    public boolean isGoalScore() {
        return goalScore;
    }

    public void setGoalScore(boolean goalScore) {
        this.goalScore = goalScore;
    }

    @Override
    public void yelling() {
        System.out.println("Дай пас, козлина!!!");
    }
    public FootballPlayer(String name, int age) {
        super(name, age, hobby);
    }
}

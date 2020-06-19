package ru.maslenchenko.ilya.lesson06.stadium;

public class FootballPlayer extends Human {
    private final static String hobby = "футболист";
    private boolean goalScore = false;
    private int ballHitStrengh;
    private int hitAccuracy;

    public int getHitAccuracy() {
        return hitAccuracy;
    }

    public void setHitAccuracy(int hitAccuracy) {
        this.hitAccuracy = hitAccuracy;
    }

    public int getBallStrikeStrengh() {
        return ballHitStrengh;
    }

    public void setBallStrikeStrengh(int ballStrikeStrengh) {
        this.ballHitStrengh = ballStrikeStrengh;
    }

    public boolean isGoalScore() {
        return goalScore;
    }

    public void setGoalScore(boolean goalScore) {
        this.goalScore = goalScore;
    }

    public void hitBall(Ball ball) {

    }

    public void makePass(Ball ball, FootballPlayer player) {

    }
    @Override
    public void yelling() {
        System.out.println("Дай пас, козлина!!!");
    }
    public FootballPlayer(String name, int age) {
        super(name, age, hobby);
    }
}

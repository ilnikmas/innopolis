package ru.maslenchenko.ilya.lesson06.stadium;

public class Stadium {
    private Fan [] fans;
    private FootballPlayer [] players;
    private int capacity;
    private int fieldWidth;
    private int fieldLength;
    private boolean opened;
    public Fan[] getFans() {
        return fans;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(int fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public int getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(int fieldLength) {
        this.fieldLength = fieldLength;
    }

    public void setFans(Fan[] fans) {
        this.fans = fans;
    }

    public FootballPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(FootballPlayer[] players) {
        this.players = players;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }


}

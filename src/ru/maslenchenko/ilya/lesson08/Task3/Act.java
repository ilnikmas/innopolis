package ru.maslenchenko.ilya.lesson08.Task3;

public class Act {
    private int actNumber;
    private String actData;
    private String[] goodsList;

    Act(int actNumber, String actData, String[] goodsList) {
        this.actNumber = actNumber;
        this.actData = actData;
        this.goodsList = goodsList;

    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public String getActData() {
        return actData;
    }

    public void setActData(String actData) {
        this.actData = actData;
    }

    public String[] getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(String[] goodsList) {
        this.goodsList = goodsList;
    }
}

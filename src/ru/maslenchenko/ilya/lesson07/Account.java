package ru.maslenchenko.ilya.lesson07;

public class Account {
    private double deposit = 0.00;

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double cash) {
        this.deposit = cash;
    }

    public void changeDeposit(double cash) {this.deposit -= cash;}
}

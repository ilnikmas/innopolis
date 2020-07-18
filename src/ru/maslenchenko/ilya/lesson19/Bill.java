package ru.maslenchenko.ilya.lesson19;

public class Bill {
    private String name;
    private double weight;
    private double price;
    private double cost;

    public Bill() {

    }

    public Bill(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return getWeight() * getPrice();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", cost=" + getCost() +
                '}';
    }
}

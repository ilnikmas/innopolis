package ru.maslenchenko.ilya.lesson23;

class Product {
    private String name;
    private int quantity;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name=" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

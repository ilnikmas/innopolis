package ru.maslenchenko.ilya.lesson23;

import static ru.maslenchenko.ilya.lesson23.Shop.products;

public class Run {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct("Каша", 2);
        shop.addProduct("Водка", 15);
        shop.addProduct("Мясо", 7);
        //System.out.println(shop.getProductQuantity("Водка"));
        //System.out.println(shop.getPosition("Водка"));
        for (Product pr : products) {
            System.out.println(pr);
        }
        System.out.println();
        shop.addProduct("Каша", 5);
        for (Product pr : products) {
            System.out.println(pr);
        }
    }
}

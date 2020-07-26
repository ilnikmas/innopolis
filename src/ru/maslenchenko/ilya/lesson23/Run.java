package ru.maslenchenko.ilya.lesson23;

public class Run {
    public static void main(String[] args) {
        CustomerBasket customerBasket = new CustomerBasket();
        customerBasket.addProduct("Каша", 2);
        customerBasket.addProduct("Водка", 15);
        customerBasket.addProduct("Мясо", 7);
        System.out.println(customerBasket.toString());
        System.out.println();
        customerBasket.addProduct("Каша", 5);
        System.out.println(customerBasket.toString());
        customerBasket.removeProduct("Водка");
        System.out.println(customerBasket.toString());
        customerBasket.updateProductQuantity("Колбаса", 5);
        System.out.println(customerBasket.getProductQuantity("Водка"));
        System.out.println(customerBasket.getProductQuantity("Каша"));
        System.out.println(customerBasket.getProducts());
        customerBasket.clear();
        System.out.println(customerBasket.toString());
    }
}

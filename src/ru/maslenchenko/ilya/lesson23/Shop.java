package ru.maslenchenko.ilya.lesson23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop implements Basket {
    public static List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (products.isEmpty()) {
            products.add(new Product(product, quantity));
        } else {
            Iterator<List> it =

                if (!pr.getName().equals(product)) {
                    products.add(new Product(product, quantity));
                } else {
                    System.out.println("Пошёл нахуй");
                    //System.out.println(products.get(products.indexOf(pr)).getQuantity());
                }
            }
        }


    @Override
    public void removeProduct(String product) {


    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product prod : products) {

        }
        return products.get(products.indexOf(product)).getQuantity();
    }

    public int getPosition(String product) {
        return products.indexOf(product);
    }

}

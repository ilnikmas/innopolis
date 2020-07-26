package ru.maslenchenko.ilya.lesson23;

import java.util.ArrayList;
import java.util.List;

public class CustomerBasket implements Basket {
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        boolean productIsAbsentInBasket = true;
        if (!products.isEmpty()) {
            for (Product pr : products) {
                if (pr.getName().equals(product)) {
                    productIsAbsentInBasket = false;
                    pr.setQuantity(pr.getQuantity() + quantity);
                }
            }
        }
        if (productIsAbsentInBasket) products.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {
        int index = 0;
        if (!products.isEmpty()) {
            //products.removeIf(n -> n.getName().equals(product));
            for (Product pr : products) {
                if (pr.getName().equals(product)) {
                    index = products.indexOf(pr);
                }
            }
            products.remove(index);
        }
     }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product pr : products) {
            if (pr.getName().equals(product)) {
                pr.setQuantity(quantity);
                return;
            }
        }
        System.out.printf("Продукт %s отсутствует в корзине.\n", product);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> basketList = new ArrayList<>();
        for (Product prod : products) {
            basketList.add(prod.getName());
        }
        return basketList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product pr : products) {
            if (pr.getName().equals(product)) {
                return pr.getQuantity();
            }
        }
        System.out.printf("Продукт %s отсутствует в корзине.\n", product);
        return 0;
    }

    @Override
    public String toString() {
        return "Товары в корзине:\n " + products;
    }
}

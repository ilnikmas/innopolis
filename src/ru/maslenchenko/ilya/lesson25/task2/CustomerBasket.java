package ru.maslenchenko.ilya.lesson25.task2;

import java.util.*;

public class CustomerBasket implements Basket {
    private Map<String, Integer> products = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        boolean productIsAbsentInBasket = true;
        if (!products.isEmpty()) {
            Iterator iter = products.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            if (mEntry.getKey() == product) {
                productIsAbsentInBasket = false;
                mEntry.setValue((Integer) mEntry.getValue() + quantity);
            }
        }
    }
        if (productIsAbsentInBasket) products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        if (!products.isEmpty()) {
            products.remove(product);
        } else System.out.printf("Товар %s отсутствует в корзине", product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, quantity);
        } else System.out.printf("Товар %s отвутствует в корзине\n", product);
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(products.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        if (products.get(product) != null) {
            return products.get(product);
        } else System.out.printf("Товар %s отсутствует в корзине", product);
        return -1;
    }

    @Override
    public String toString() {
        return "Товары в корзине:\n " + products;
    }
}

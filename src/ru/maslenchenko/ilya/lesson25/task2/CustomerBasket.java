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
                if (iter.next().equals(product)) {
                    int temp = 0;
                    productIsAbsentInBasket = false;
                    Map.Entry mEntry = (Map.Entry) iter.next();
                    temp = (Integer) mEntry.getValue() + quantity;
                    mEntry.setValue(temp);
                }
            }
        }
        if (productIsAbsentInBasket) products.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        int index = 0;
        if (!products.isEmpty()) {
            Iterator iter = products.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry mEntry = (Map.Entry) iter.next();
                if (mEntry.getKey().equals(product)) {
                    products.remove(product);
                }
            }
        }
     }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        Iterator iter = products.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            if (mEntry.getKey().equals(product)) {
                products.put(product, quantity);
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
        Iterator iter = products.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            basketList.add(mEntry.getKey().toString());
        }
        return basketList;
    }

    @Override
    public int getProductQuantity(String product) {
        Iterator iter = products.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            if (mEntry.getKey().equals(product)) {
                return (Integer) mEntry.getValue();
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

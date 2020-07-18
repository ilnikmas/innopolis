package ru.maslenchenko.ilya.lesson19;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductOutBill {

    public void productOutBill(String incFileName) {

        try (Scanner sc = new Scanner(new File("D:\\coding\\" + incFileName + ".txt"))) {
            ArrayList<String> productsAsArrayList = parse(sc);
            for (String str : formatOutProducts(productsAsArrayList)
            ) {
                System.out.println(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private ArrayList<String> parse(Scanner sc) {
        ArrayList<String> productsAsArrayList = new ArrayList<String>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            productsAsArrayList.add(line);
        }

        return productsAsArrayList;
    }

    private ArrayList<String> formatOutProducts(ArrayList<String> arrayList) {
        double sumBill = 0;
        String multiply;
        ArrayList<String> formatOutProducts = new ArrayList<>();

        for (int i = 0; i < arrayList.size() - 1; i = i + 3) {
            multiply = String.format("%.2f", Double.parseDouble(arrayList.get(i + 1)) * Double.parseDouble(arrayList.get(i + 2)));
            String tmp = String.format("%-18s%6.2f%s%6s%14s", arrayList.get(i), Double.parseDouble(arrayList.get(i + 2)),
                    " x ", floatCheckerFormat(Double.parseDouble(arrayList.get(i + 1))),
                    "=" + multiply);
            formatOutProducts.add(tmp);
            sumBill = sumBill + Double.parseDouble(arrayList.get(i + 1)) * Double.parseDouble(arrayList.get(i + 2));
        }

        formatOutProducts.add(0, String.format("%-20s%-7s%-11s%s", "Наименование", "Цена", "Кол-во", "Стоимость"));
        formatOutProducts.add(1, "===============================================");
        formatOutProducts.add("===============================================");
        formatOutProducts.add(String.format("%-40s%.2f", "Итого:", sumBill));

        return formatOutProducts;
    }

    private String floatCheckerFormat(double value) {
        if (value % 1 == 0)
            return String.format("%.0f", value);
        else
            return String.format("%.3f", value);
    }
}
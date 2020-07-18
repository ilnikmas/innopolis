package ru.maslenchenko.ilya.lesson19;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Processing {
    static List<Bill> list = new ArrayList<>();
    public static void readFile() throws IOException {
        Path path = Paths.get("D:\\coding\\products.txt");
        FileReader fr = new FileReader(String.valueOf(path));
        BufferedReader reader = new BufferedReader(fr);
        Bill bill = new Bill();
        int i = 1;
        String line = reader.readLine();
        while (line != null) {
            if (i == 4) i = 1;
            if (i == 1) {
                bill.setName(line);
            }
            if (i ==2) {
                bill.setWeight(Double.parseDouble(line));
            }
            if (i == 3) {
                bill.setPrice(Double.parseDouble(line));
                list.add(bill);
                bill = new Bill();
            }
            i++;
            line = reader.readLine();
        }
        formatOutput();
    }

    public static void formatOutput() {
        DecimalFormat df3 = new DecimalFormat("#.###");
        df3.setDecimalSeparatorAlwaysShown(false);
        double sum = 0;
        System.out.println("Наименование\t\t\tЦена\tКол-во\t\tСтоимость");
        System.out.println("=====================================================");
        for (Bill b : list) {
            sum += b.getCost();
            System.out.printf("%-15s\t\t%8.2f x %7.3f\t =%10.2f\n", b.getName(), b.getPrice(), b.getWeight(), b.getCost());
        }
        System.out.println("=====================================================");
        System.out.printf("Итого:\t\t\t\t\t\t\t\t\t%12.2f", sum);
    }
}

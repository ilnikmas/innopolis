package ru.maslenchenko.ilya.lesson19;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Processing {
    static List<Bill> list = new ArrayList<>();

    static String checkDouble(Double value) {
        if (value % 1 == 0)
            return String.format("%.0f", value);
        else
            return String.format("%.3f", value);
    }

    static void readFile(Path path) throws IOException {
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

    static void formatOutput() {
        double sum = 0;
        System.out.printf("%-24s%-8s%-8s%12s%n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.println("====================================================");
        for (Bill b : list) {
            sum += b.getCost();
            System.out.printf("%-22s%6.2f x %7s%4s%10.2f%n", b.getName(), b.getPrice(), checkDouble(b.getWeight()), "=", b.getCost());
        }
        System.out.println("====================================================");
        System.out.printf("%-45s%6.2f", "Итого:", sum);
    }


}

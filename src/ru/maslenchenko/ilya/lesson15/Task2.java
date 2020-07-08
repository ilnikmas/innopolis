package ru.maslenchenko.ilya.lesson15;

import java.io.File;
import java.util.Arrays;

public class Task2 {
    public static void DirList(File fileName) {
        File file = new File(String.valueOf(fileName));
        File folder = file.getParentFile();
        if (file.isDirectory()) {
            System.out.println(file.getName() + " является каталогом");
            for (File dir : file.listFiles()) {
                System.out.println(dir.getName());
                DirList(dir);
            }
        }

    }

    public static void main(String[] args) {
        DirList(new File(args[0]));
    }
}

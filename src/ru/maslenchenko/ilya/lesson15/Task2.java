package ru.maslenchenko.ilya.lesson15;

import java.io.File;
import java.util.Scanner;

public class Task2 {
    static StringBuilder gap = new StringBuilder("-");

    public static void DirList(File fileName) {
        for (File dir : fileName.listFiles()) {
            System.out.println(gap + dir.getName());
            if (dir.isDirectory()) {
                gap.append('-');
                DirList(dir);
            }
        }
        gap.deleteCharAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Путь к папке:");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Папки с введеным именем не существует!");
        } else if (!dir.isDirectory()) {
            System.out.println("Не является папкой!");
        } else {
            DirList(dir);
        }
    }
}

package ru.maslenchenko.ilya.lesson15;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task2 {
    static StringBuilder gap = new StringBuilder(" ");

    public static void DirList(File fileName) {
        File file = new File(String.valueOf(fileName));
        File folder = file.getParentFile();
        if (file.isDirectory()) {
            for (File dir : file.listFiles()) {
                System.out.println(gap + dir.getName());
                DirList(dir);
            }
            gap.append(" ");
        }
    }

    public static void main(String[] args) {
        DirList(new File(args[0]));
        //Path pathOne = Paths.get("d:\\coding");
        //Path pathTwo = Paths.get("d:\\coding\\hello\\bin");
        //System.out.println(pathOne.relativize(pathTwo));
    }
}

package ru.maslenchenko.ilya.lesson19;

import java.io.IOException;
import java.nio.file.Paths;

public class Run {
    public static void main(String[] args) throws IOException {
        Run run = new Run();
        run.run();
    }
    public void run() throws IOException {
        Processing.readFile(Paths.get("D:\\coding\\products.txt"));
    }
}

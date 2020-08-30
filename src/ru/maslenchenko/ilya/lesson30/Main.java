
package ru.maslenchenko.ilya.lesson30;

public class Main {
    public static void main(String[] args) {
        Main task = new Main();
        task.run();
    }

    public void run () {
        Methods.analyzeWord(Methods.takeWord());
    }
}
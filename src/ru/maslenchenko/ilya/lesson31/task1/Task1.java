package ru.maslenchenko.ilya.lesson31.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static ru.maslenchenko.ilya.lesson31.task1.isPalindrom.*;

public class Task1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Task1 task = new Task1();
        String st = br.readLine();
        task.run(st);

    }
    public void run (String s) {
        if(isPalindrom(s)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
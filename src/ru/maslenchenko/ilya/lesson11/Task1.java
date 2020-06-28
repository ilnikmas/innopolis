package ru.maslenchenko.ilya.lesson11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();
        String replace = "вырезано цензурой";
        String regularExpression = "(?i)\\bбяка\\b";
        Pattern pattern = Pattern.compile(regularExpression, Pattern.UNICODE_CASE);
        Matcher match = pattern.matcher(inputString);
        StringBuffer stringBuffer = new StringBuffer();

        while (match.find()){
            match.appendReplacement(stringBuffer, replace);
        }
        match.appendTail(stringBuffer);
        System.out.println("Цензурированный текст: ");
        System.out.println(stringBuffer.toString());

    }
}

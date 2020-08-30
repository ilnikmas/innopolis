package ru.maslenchenko.ilya.lesson31.task1;

public class isPalindrom {
    public static boolean isPalindrom(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
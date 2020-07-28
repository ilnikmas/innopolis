package ru.maslenchenko.ilya.lesson24;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("foo");
        alist.add("buzz");
        alist.add("bar");
        alist.add("fork");
        alist.add("bort");
        alist.add("spoon");
        alist.add("!");
        alist.add("dude");

        List list  = removeEvenLength(alist);
        for (Object lst : list) {
            System.out.println(lst);
        }

    }

    public static ArrayList<String> removeEvenLength(ArrayList<String> set) {
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            if (element.length() % 2 == 0) {
                list.add(element);
            }
        }
        return list;
    }

}
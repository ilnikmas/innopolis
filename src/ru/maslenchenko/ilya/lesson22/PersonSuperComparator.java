package ru.maslenchenko.ilya.lesson22;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSuperComparator{
    public static void personSort(List<Person> persons) {

        Collections.sort(persons, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                String x1 = ((Person) o1).getName();
                String x2 = ((Person) o2).getName();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                Integer y1 = ((Person) o1).getAge();
                Integer y2 = ((Person) o2).getAge();
                return y1.compareTo(y2);
            }});
    }
}

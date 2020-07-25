package ru.maslenchenko.ilya.lesson22;

import java.util.Comparator;
import java.util.List;

class PersonSuperComparator{
    static void personSort(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
    }
}

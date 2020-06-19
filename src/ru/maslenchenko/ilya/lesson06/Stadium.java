package ru.maslenchenko.ilya.lesson06;
import ru.maslenchenko.ilya.lesson06.stadium.*;

public class Stadium {
    public static void main(String[] args) {
        Human human = new Human("Вася", 23, "футболист");
        human.greetings();
        human.yelling();
        System.out.println(human.getAge());
        Fan fan = new Fan("Петя", 56);
        fan.greetings();
        fan.yelling();
    }
}

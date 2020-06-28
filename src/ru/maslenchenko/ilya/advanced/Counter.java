package ru.maslenchenko.ilya.advanced;

public class Counter {
    public static void main(String[] args) {
        OutPut t1 = new OutPut();
        System.out.print(t1.x + " ");

        OutPut t2 = fix(t1);
        System.out.println(t1.x + " " + t2.x);

    }

    static OutPut fix(OutPut t) {
        t.x += 42;
        return t;
    }
}

class OutPut {
    byte x = 42;
}


package ru.maslenchenko.ilya.lesson06.stadium;

public class Human {
    private String name;
    private int age;
    private String hobby;
    public void greetings() {
        System.out.printf("Здравствуйте. Меня зовут %s, мне %d лет, я %s\n", name, age, hobby);
    }
    public void yelling() {
        System.out.println("Ааааааааа!!!! Мы все умрёёёёёёём!!!!");
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Human() {
    }

    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

}

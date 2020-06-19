package ru.maslenchenko.ilya.lesson07;

public class Menu {
    public enum Assortiment {
        GREEN_TEA(0,"Зелёный чай",1.25),
        BLACK_TEA(1,"Чёрный чай",2.75),
        ESPRESSO(2,"Кофе Эспрессо",3.85),
        CAPPUCCINO(3,"Капучино",4.90),
        COCA_COLA(4,"Кока-Кола",1.35),
        PEPSI_COLA(5,"Пепси-Кола",1.45),
        FANTA(6,"Фанта",1.55),
        KBAC(7,"Квас", 1.00),
        MILK(8,"Молоко", 0.75),
        WATER(9,"Вода", 0.25);

        private final double price;
        private final int button;
        private final String drink;

        Assortiment(int button, String drink, double price) {
            this.button = button;
            this.drink = drink;
            this.price = price;
        }

        public int getButton() {
            return button;
        }
        public String getDrink() {
            return drink;
        }
        public double getPrice() {
            return price;
        }
    }
}

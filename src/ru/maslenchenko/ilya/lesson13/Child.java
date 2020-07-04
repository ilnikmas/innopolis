package ru.maslenchenko.ilya.lesson13;

class Child {
    public static void toEat(Food food) {
        for (Food f : Food.values()) {
            if (f == food) {
                try {
                    if (f.isFavorite()) {
                        System.out.println("Ребёнок съел " + f.getFood());
                    } else {
                        throw new ChildException(f.getFood());
                    }
                } catch (ChildException e) {
                    System.out.println(e);
                } finally {
                    System.out.println("Спасибо, мама!");
                }
            }
        }
    }
}

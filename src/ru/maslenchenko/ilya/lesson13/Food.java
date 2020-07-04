package ru.maslenchenko.ilya.lesson13;

public enum Food {
    MASHED_POTATOES("MASHED_POTATOES", "Картофельное пюре", false),
    OATMEAL("OATMEAL","Овсяная каша", false),
    APPLESAUCE("APPLESAUCE","Яблочное пюре", true),
    CARROT("CARROT","Морковь", false),
    CURD("CURD","Творог", true),
    BORSCHT("BORSCHT","Борщ", false),
    CHEESECAKE("CHEESECAKE","Сырники", true);

    private final String name;
    private final String food;
    private final boolean favorite;

    Food(String name, String food, boolean favorite) {
        this.name = name;
        this.food = food;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public boolean isFavorite() {
        return favorite;
    }
}

package by.bsuir.lab1.task9;

public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий"),
    YELLOW("Желтый"),
    ORANGE("Оранжевый"),
    PURPLE("Пурпурный");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package org.example.lesson4hw;
/*-Класс Cat должен расширять (наследовать) класс Animal.
должен иметь приватное поле color (String).
Сетер и гетер для него. иметь два конструктора:

--первый принимает параметры все параметры для конструирования
себя (color) и родительскогокласса

-- второй принимает параметры для конструирования родительского,
класса color-по умолчанию*/

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color="black";
    }
}
